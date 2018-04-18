/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Main {
        public static void main(String[] args) {
        Osoba os = new Osoba();
        os.setDane();
        System.out.println(os.toString());
        Student stud = new Student();
        stud.setDaneStud();
        System.out.println(stud.toString());
        Wykladowca prof = new Wykladowca();
        prof.setDaneWyk();
        System.out.println(prof.toString());
    }
}
