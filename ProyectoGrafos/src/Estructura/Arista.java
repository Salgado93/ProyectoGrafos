/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.awt.Color;

/**
 *
 * @author luigy
 */
public class Arista {
    private Color color;
    private Vertice puntoA;
    private Vertice puntoB;
    private int peso;

    public Arista() {
    
    }

    public Arista(Color color, Vertice puntoA, Vertice puntoB, int peso) {
        this.color = color;
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Vertice getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Vertice puntoA) {
        this.puntoA = puntoA;
    }

    public Vertice getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Vertice puntoB) {
        this.puntoB = puntoB;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getPesoString(){
        String p;
        p = String.valueOf(peso);
        p = Integer.toString(peso);
        return p;
    }

    @Override
    public String toString() {
        return puntoA+"-->"+puntoB+" Peso: "+peso;
    }
    
    
}
