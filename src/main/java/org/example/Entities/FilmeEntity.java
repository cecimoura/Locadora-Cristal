package org.example.Entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_filme")

public class FilmeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(length = 100)
    private String genero;

    @Column(length = 10)
    private String classificacao;

    @Column(nullable = false)
    private boolean disponivel;

    //Construtor vazio
    public FilmeEntity(){}

    public FilmeEntity(String titulo, String genero, String classificacao, boolean disponivel){
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.disponivel = disponivel;
    }

    //getters e setters
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getTitulo(){return titulo;}
    public void setTitulo(){this.titulo = titulo;}

    public String getGenero(){return genero;}
    public void setGenero(){this.genero = genero;}

    public String getClassificacao(){return classificacao;}
    public void setClassificacao(){this.classificacao = classificacao;}

    public boolean isDisponivel(){return disponivel;}
    public void setDisponivel(boolean disponivel){this.disponivel = disponivel;}
}
