/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
public class Dibujo implements Drawable {

    //vector de figuras de la clase Figura
    private Figura figuras[];

    public Dibujo() {
        //creamos un vector de 20
        this.figuras = new Figura[20];
    }

    //method recibe una Figura f
    public void addFigura(Figura f) {
        //creamos un boolean
        boolean insertado = false;
        //recorriendo el length de la figura, y el insertado sea falso
        for (int i = 0; i < this.figuras.length && !insertado; i++) {
            //si la pocicion del vector de i, es differente de null
            if (this.figuras[i] == null) {
                //se inserta
                this.figuras[i] = f;
                //insertado se iguala a verdadero
                insertado = true;
            }
        }
    }

    //sobrescribimos el metodo a SVG de Drawable
    @Override
    public String toSVG() {
        //creamos una variable de String
        StringBuilder vuelta = new StringBuilder("<svg width=400 height=110>");
        //recoremos el vector hasta la longitud del vector
        for (int i = 0; i < this.figuras.length; i++) {
            //si encontramos una pocicion no vaciak, o sea, una figura
            if (this.figuras[i] != null) {
                /*añadimos el SVG de la figura encontrada al string anterior, volvemos, a recorer, el
                vector de nuevo, para volver a encontrar otra figura, y si encontramos, la añadimos ademas
                al String*/
                vuelta.append(this.figuras[i].toSVG() + "\n");
            }

        }
        vuelta.append("</svg>");
        return vuelta.toString();
    }

}
