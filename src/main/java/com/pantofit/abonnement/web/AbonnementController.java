package com.pantofit.abonnement.web;

import com.pantofit.abonnement.dao.AbonnementRepository;
import com.pantofit.abonnement.entities.Abonnement;
import com.pantofit.abonnement.model.Client;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class AbonnementController {
    private AbonnementRepository abonnementRepository;
    public AbonnementController(AbonnementRepository abonnementRepository){
        this.abonnementRepository=abonnementRepository;
    }
    @GetMapping(path="/getAbonnement/{id}")
    public  Long getAbonnement(@PathVariable(name="id") Long code){
        Abonnement abonnement=this.abonnementRepository.findAbonnementByClientIDAndCourant(code,true);
        if(abonnement!=null){
            System.out.println(abonnement.getId());
            return abonnement.getId();
        }
        else{
            return 0L;

        }


    }
    @GetMapping (path="/workout/{id}")
    public  boolean checkabonnement(@PathVariable(name="id") Long id){
        Abonnement abonnement=this.abonnementRepository.findAbonnementByClientIDAndCourant(id,true);
        if(abonnement!=null){
            if( abonnement.getNbrseancerestants()>1){
                abonnement.setNbrseancerestants(abonnement.getNbrseancerestants()-1);
                abonnementRepository.save(abonnement);
            }else {
                abonnement.setNbrseancerestants(abonnement.getNbrseancerestants()-1);
                abonnement.setCourant(false);
                 abonnementRepository.save(abonnement);
            }
            return true;
        }
        else{
            return false;

        }
    }

    @GetMapping(path="/solde/{id}")
    public int SoldeRestant(@PathVariable(name="id") Long id){
        Abonnement abonnement=this.abonnementRepository.findAbonnementByClientIDAndCourant(id,true);
        if(abonnement!=null){
            return abonnement.getNbrseancerestants();
        }
        else{
            return 0;

        }

    }
}
