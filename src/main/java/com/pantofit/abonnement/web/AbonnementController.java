package com.pantofit.abonnement.web;


import com.pantofit.abonnement.dao.AbonnementRepository;
import com.pantofit.abonnement.entities.Abonnement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbonnementController {
AbonnementRepository abonnementRepository;
public AbonnementController(AbonnementRepository abonnementRepository){
    this.abonnementRepository=abonnementRepository;
}
@GetMapping(path="/getAbonnement/{code}")
    public  Long getAbonnement(@PathVariable(name="code") String code){
    Abonnement abonnement=this.abonnementRepository.findAbonnementByCode(code);
    if(abonnement!=null){
        System.out.println(abonnement.getId());
        return abonnement.getId();
    }
    else{
        return 0L;

    }


}

}
