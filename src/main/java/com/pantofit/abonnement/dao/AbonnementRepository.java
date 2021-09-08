package com.pantofit.abonnement.dao;

import com.pantofit.abonnement.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
    Abonnement findAbonnementByCode(String code);

}
