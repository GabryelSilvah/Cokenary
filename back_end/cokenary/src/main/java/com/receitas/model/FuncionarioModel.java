package com.receitas.model;

import jakarta.persistence.*;

import java.util.Date;
@Table(name = "funcionarios")
@Entity
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name = "rg")
    private int rg;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_adm")
    private Date dt_adm;
    @Column(name = "salario")
    private float salario;
    @Column(name = "cargo")
    private Long cargo;

    public Long getId() {
        return id;
    }

    public int getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public Date getDt_adm() {
        return dt_adm;
    }

    public float getSalario() {
        return salario;
    }

    public Long getCargo() {
        return cargo;
    }
}
