package org.example.Entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
