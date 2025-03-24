package com.projetos.Objetos;



public class Rosquinha implements Comida{

    public final String tipo = "rosquinha"; 
    private String nome; 
    private String sabor; 

    @Override
    public String QualTipo(){
        return tipo; 
    }

    @Override
    public void QualNome() {
        System.out.printf("O nome é", nome);
    }

    @Override 
    public void QualSabor(){
        System.out.printf("O Sabor é", sabor);
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






}