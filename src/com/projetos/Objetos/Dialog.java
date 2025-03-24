package com.projetos.Objetos;

import com.projetos.Objetos.Comida;

public abstract class Dialog{

    public abstract Comida createFood();

    public void returnFood(){
        Comida comida = createFood(); 
        System.out.println(comida.QualTipo());
    }; 

    
    
}
