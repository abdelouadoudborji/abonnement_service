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
AbonnementRepository abonnementRepository;
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
