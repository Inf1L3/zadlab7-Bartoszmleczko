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
public class Wykladowca extends Osoba {
    private String tytul;
    private int stazZawod;

    public Wykladowca() {
    }

    public Wykladowca(String tytul, int stazZawod, String imie, String nazwisko, String plec, int rokUrodzenia) {
        super(imie, nazwisko, plec, rokUrodzenia);
        this.tytul = tytul;
        this.stazZawod = stazZawod;
    }
    
    public void setDaneWyk(){
        System.out.println("Podaj tytul naukowy: ");
        tytul=sc.nextLine();
        this.tytul = tytul;
        System.out.println("Podaj dlugosc pracy na uczelni: ");
        stazZawod = sc.nextInt();
        this.stazZawod=stazZawod;
    }

    @Override
    public String toString() {
        return "Wykladowca{" + "tytul=" + tytul + ", stazZawod=" + stazZawod + super.toString() + '}';
    }
    
}
