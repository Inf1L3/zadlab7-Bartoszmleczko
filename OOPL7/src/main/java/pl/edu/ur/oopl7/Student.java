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
public class Student extends Osoba{
    private String typStudiow;
    private String kierunek;
    private int nrIndeksu;
    private int rokStudiow;

    public Student() {
    }
 
    
    public Student(String typStudiow, String kierunek, int nrIndeksu, int rokStudiow, String imie, String nazwisko, String plec, int rokUrodzenia) {
        super(imie, nazwisko, plec, rokUrodzenia);
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public void setDaneStud(){
        System.out.println("Podaj typ studiow: ");
        typStudiow = sc.nextLine();
        this.typStudiow=typStudiow;
        System.out.println("Podaj kierunek: ");
        kierunek = sc.nextLine();
        this.kierunek=kierunek;
        System.out.println("Podaj numer indeksu: ");
        nrIndeksu = sc.nextInt();
        this.nrIndeksu=nrIndeksu;  
        System.out.println("Podaj rok studiow: ");
        rokStudiow = sc.nextInt();
        this.rokStudiow=rokStudiow;   
    }

    @Override
    public String toString() {
        return "Student{" + "typStudiow: " + typStudiow + ", kierunek: " + kierunek + ", nrIndeksu: " + nrIndeksu + ", rokStudiow: " + rokStudiow + super.toString() + "}";
    }
    




   
    
    
}
