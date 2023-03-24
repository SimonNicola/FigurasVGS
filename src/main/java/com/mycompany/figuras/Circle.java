/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
//extiende de Elipse, solo haría falta quitar un radio
public class Circle extends Elipse {

    //instancia de radio
    private int radio;

    //constructor por defecto
    public Circle() {
        super();
        this.radio = -1;
    }

    public Circle(Coordenada c, int radio) {
        super(c, radio, radio);
        this.radio = radio;

    }

}
