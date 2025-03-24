package com.projetos;

import java.util.Scanner;

import com.projetos.Objetos.Comida;
import com.projetos.Objetos.Coxinha;
import com.projetos.Objetos.Dialog;
import com.projetos.Objetos.Rosquinha;
import com.projetos.Objetos.Salgado;
import com.projetos.Objetos.Doce;

public class main {

    private static Dialog dialog;

    public static void main(String[] args) {

        dialog = new Doce();
        Comida p = dialog.createFood();
        System.out.println(p.QualTipo());

    }

}
