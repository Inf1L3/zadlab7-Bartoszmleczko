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
public class Punkt2D {

    private int x;
    private int y;
    Random r = new Random();

    public Punkt2D() {
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void ranPoint() {
        x = r.nextInt(21) - 10;
        y = r.nextInt(21) - 10;
        System.out.println("Wspolrzedna x: " + x);
        System.out.println("Wspolrzedna y: " + y);
    }

    public void getPoint() {
        System.out.println("Wspolrzedna x: " + x);
        System.out.println("Wspolrzedna y: " + y);
    }
    public int ran(){
        int x = r.nextInt(21)-10;
        return x;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x: " + x + ", y: " + y + '}';
    }

}
