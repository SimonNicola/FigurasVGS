/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author DAWTarde
 */
public class Elipse extends Figura{
    private float radioX;
    private float radioY;
    private float pi;
    
    public Elipse(){
        this.radioX=-1;
        this.radioY=-1;
        this.pi=-1;
    }
    
    public Elipse(Coordenada c,int x, int y){
        super(c);
        this.radioX = x;
        this.radioY = y;
        this.pi=3.14159265359f;
    }
    
    @Override
    public String toSVG() {
      return "<rect " + "cx=/" + this.getPocicion2D().getX() + "cy=/" + this.getPocicion2D().getY() + "''" + "rx=" + this.radioX + " ry=" + this.radioY + " "
                + "style='fill:" + this.getColor() + ";stroke-width:" + super.getGrosor() + ";stroke:" + this.getBorder() + "' />";
    }

    @Override
    public float calcArea() {
      return pi * radioX * radioY;
    }
}
