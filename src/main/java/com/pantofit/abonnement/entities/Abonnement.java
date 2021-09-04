package com.pantofit.abonnement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pantofit.abonnement.model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;


import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor @ToString @AllArgsConstructor
@Data
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String Code;
    @ManyToOne
    private Plan plan;
    private int nbrseancerestants;
    private boolean courant;
    private Long ClientID;
    @Transient
    private Client client;

}
