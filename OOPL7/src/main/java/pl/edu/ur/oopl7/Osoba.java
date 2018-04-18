/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;
import java.util.*;
/**
 *
 * @author student
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private String plec;
    private int rokUrodzenia;

    Scanner sc = new Scanner(System.in);
    
    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, String plec, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.rokUrodzenia = rokUrodzenia;
    }
    
    public void setDane()
    {
        System.out.println("Podaj imie: ");
        imie=sc.nextLine();
        this.imie=imie;
        System.out.println("Podaj nazwisko: ");
        nazwisko=sc.nextLine();
        this.nazwisko=nazwisko;
        System.out.println("Podaj plec: ");
        plec=sc.nextLine();
        this.plec=plec;
        System.out.println("Podaj rok urodzenia: ");
        rokUrodzenia=sc.nextInt();
        this.rokUrodzenia=rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba" + "imie: " + imie + ", nazwisko: " + nazwisko + ", plec: " + plec + ", rokUrodzenia: " + rokUrodzenia;
    }
    
}
