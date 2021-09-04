package com.pantofit.abonnement.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import java.util.Date;

@Data
public class Client {
    private Long id;
    private String Code;
    private String first_name;
    private String last_name;
    private Date birthday;
    private String email;
    private String phonenumber;
    private String address;
    private String photo;
}
