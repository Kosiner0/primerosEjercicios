package com.ejercicios.ejercicio10;

public class MediaTest {

    public static void main(String[] args) {
            Media m0 = new Media();
            float f0 = m0.media();
            System.out.println("La media sin parámetos es "+ f0);
            
            Media m1 = new Media();
            float f1 = m1.media(10);
            System.out.println("LA media de 10 es " + f1);
    
            Media m2 = new Media();
            float f2 = m2.media(10, 20);
            System.out.println("LA media de 10 y 20  es " + f2);
            
            Media m3 = new Media();
            float f3 = m3.media(10,20, 30);
            System.out.println("LA media de 10,20 y 30 es " + f3);
            
            Media m4 = new Media();
            float f4 = m4.media(10, 20,30,40);
            System.out.println("LA media de 10, 20, 30 y 40  es " + f4);
    }

}

