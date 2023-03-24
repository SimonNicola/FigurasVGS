/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
public class Main {

    public static void main(String[] args) {
        //creamos d de la clase Dibujo por defecto
        Dibujo d = new Dibujo();
        //creamos una coordenada para asingar
        Coordenada c = new Coordenada(1, 2);

        //creamos y instanciamos con el constructor por defecto
        Figura tempo = new Rectangulo(c, 1, 2);
        //le damos el borde
        tempo.setBorder("0000ff");
        //le ponemos un color
        tempo.setColor("ffffff");
        //le asingnamos un grosor
        tempo.setGrosor(3);
        //System.out.println(tempo.toSVG());
        d.addFigura(tempo);

        //nueva figura
        c = new Coordenada(44, 21);
        tempo = new Rectangulo(c, 20, 20);
        tempo.setBorder("ff0000");
        tempo.setColor("00ff00");
        tempo.setGrosor(1);
        d.addFigura(tempo);
        System.out.println(d.toSVG());

        //nueva figura
        c = new Coordenada(50, 100);
        Figura tempo1 = new Elipse(c, 40, 60);
        tempo1.setBorder("FF00FF");
        tempo1.setColor("FFFFFF");
        tempo1.setGrosor(3);
        d.addFigura(tempo1);

    }
}
