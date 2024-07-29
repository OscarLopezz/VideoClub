
package com.mycompany.clases;


public class Movie {
    private String title;
    private String director;
    private short realeaseYear;
    private byte isan;
    private byte numberCopies;

    public Movie(String title, String director, short realeaseYear, byte isan, byte numberCopies) {
        this.title = title;
        this.director = director;
        this.realeaseYear = realeaseYear;
        this.isan = isan;
        this.numberCopies = numberCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getRealeaseYear() {
        return realeaseYear;
    }

    public void setRealeaseYear(short realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    public byte getIsan() {
        return isan;
    }

    public void setIsan(byte isan) {
        this.isan = isan;
    }

    public byte getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(byte numberCopies) {
        this.numberCopies = numberCopies;
    }
    
    
    
}
