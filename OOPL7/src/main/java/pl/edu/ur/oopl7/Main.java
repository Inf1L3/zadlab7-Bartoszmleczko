/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import lab7.zadanie2.Punkt2D;
import lab7.zadanie2.Punkt3D;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        /*Osoba os = new Osoba();
         os.setDane();
         System.out.println(os.toString());
         Student stud = new Student();
         stud.setDaneStud();
         System.out.println(stud.toString());
         Wykladowca prof = new Wykladowca();
         prof.setDaneWyk();
         System.out.println(prof.toString());*/
        Punkt2D point = new Punkt2D(5, 2);
        point.getPoint();
        point.ranPoint();
        System.out.println(point.toString());
        Punkt3D point3 = new Punkt3D(3, 2, 3);
        point3.ranPoint();
        System.out.println(point3.toString());
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for (int i = 0; i < 100; i++) {
            array2D[i] = new Punkt2D(point.ran(),point.ran());
          
        }
        for (int i = 0; i < 100; i++) {
            array3D[i] = new Punkt3D(point.ran(),point.ran(),point.ran());
        }
        for(int i=0;i<100;i++){
            int xd = array2D[i].getX();
            int yd = array2D[i].getY();
        for(int j=0;j<100;j++){
            int xt = array3D[j].getX();
            int yt = array3D[j].getY();
            if(xd == xt && yd == yt){
                System.out.println("");
                System.out.println("Te punkty maja takie same wspolrzedne x i y:");
                System.out.println( "2D: "+i+": "+array2D[i].toString());
                System.out.println("3D: "+j+": "+array3D[j].toString());
                System.out.println("");
            }}
        }
    
}
}
