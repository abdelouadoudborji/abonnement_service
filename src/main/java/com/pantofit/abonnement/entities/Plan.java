package com.pantofit.abonnement.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data
public class Plan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String Code;
    @Column(length = 75)
    private int nbrticket;
    @Column(length = 75)
    private double montant;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "plan")
    private List<Abonnement> AbonnementList ;
}