/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
public class Rectangulo extends Figura {

    private int h;
    private int w;

    //constructor por defecto
    public Rectangulo() {
        //llamada al constructor del padre
        super();
        this.h = -1;
        this.w = -1;
        this.setBorder("#ffffff");
        this.setColor("#AA3333");
    }

    //constructor sobrecargado
    public Rectangulo(Coordenada c, int w, int h) {
        /*llama al constructor del padre, que tendra una coordenada, color y borde
        además de un grosor*/
        super(c);
        this.h = h;
        this.w = w;
    }

    @Override
    public float calcArea() {
        return this.h * this.w;

    }

    @Override
    public String toSVG() {
        //llamando al constructor padre
        return "<rect " + "y=/" + this.getPocicion2D().getY() + "x=/" + this.getPocicion2D().getX() + "''" + "width=" + this.w + " height=" + this.h + " "
                + "style='fill:" + this.getColor() + ";stroke-width:" + super.getGrosor() + ";stroke:" + this.getBorder() + "' />";
    }

}
