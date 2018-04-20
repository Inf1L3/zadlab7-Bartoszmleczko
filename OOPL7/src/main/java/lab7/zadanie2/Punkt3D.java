/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.zadanie2;

import java.util.Random;

/**
 *
 * @author Bartosz
 */
public class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D() {
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    
    @Override
    public void ranPoint(){
        super.ranPoint();
        z=r.nextInt(21)-10;
        System.out.println("Wspolrzedna z: " + z);
    }

    @Override
    public String toString() {
        return "Punkt3D{" + super.toString() + ", z:" + z + '}';
    }
    

}
