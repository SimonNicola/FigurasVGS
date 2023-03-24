/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
public abstract class Figura implements Drawable {

    private Coordenada pocicion2D;
    private String color;
    private String border;
    private int grosor;

    public Figura() {
        pocicion2D = new Coordenada(-1, -1);
        color = "ff0000";
        border = "0000ff";
        grosor = -1;
    }

    public Figura(Coordenada pocicion2D) {
        this.pocicion2D = pocicion2D;    
    }

  

    @Override
    public abstract String toSVG();

    public abstract float calcArea();

    public Coordenada getPocicion2D() {
        return pocicion2D;
    }

    public void setPocicion2D(Coordenada pocicion2D) {
        this.pocicion2D = pocicion2D;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

}
