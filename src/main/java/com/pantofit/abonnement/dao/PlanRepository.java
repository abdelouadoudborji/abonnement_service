package com.pantofit.abonnement.dao;

import com.pantofit.abonnement.entities.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlanRepository extends JpaRepository<Plan,Long> {
   Plan findPlanByMontant(double montant);
}
