package com.projetos.Objetos;

import com.projetos.Objetos.Comida;

public class Coxinha implements Comida {

    public final String tipo = "Coxinha"; 
    private String nome; 
    private String sabor; 

    @Override
    public String QualTipo(){
        return tipo;
    }

    @Override
    public void QualNome() {
        // TODO Auto-generated method stub
        System.out.println("O nome é "+ nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void QualSabor() {
        // TODO Auto-generated method stub
        System.out.println("O sabor é " + sabor);
    }

}