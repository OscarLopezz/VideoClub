package com.mycompany.clases;

import java.util.ArrayList;

/**
 *
 * @author chappyd_0
 */
public class ListMovies {
    
    private ArrayList<Movie> listMovies;

    public ListMovies() {
        listMovies = new ArrayList<>();
    }
    
    public void addMovie(String title, String director, short realeaseYear, byte isan, byte numberCopies){
        Movie neMovie = new Movie(title, director, realeaseYear, isan, numberCopies);
        listMovies.add(neMovie);
    }
    
    public Movie searchMovie(byte isan){
        for (Movie searchMovie : listMovies) {
            if (searchMovie.getIsan() == isan) {
                return searchMovie;
            }
        }
        return null;
    }
    
    public boolean moddifMovie(String titleM, String directorM, short realeaseYearM, byte isanM, byte numberCopiesM, byte isan){
        Movie moddifMovie = searchMovie(isan);
        if(moddifMovie!= null){
            moddifMovie.setTitle(titleM);
            moddifMovie.setDirector(directorM);
            moddifMovie.setRealeaseYear(realeaseYearM);
            moddifMovie.setIsan(isanM);
            moddifMovie.setNumberCopies(numberCopiesM);
            return true;
        }
        return false;
    }
    
    public boolean moddifMovieCopies(byte isan, byte newNumberCopies){
        Movie moddifMovie = searchMovie(isan);
        if(moddifMovie != null){
            byte numberCopies = moddifMovie.getNumberCopies();
            moddifMovie.setNumberCopies((byte)(numberCopies + newNumberCopies));
            return true;
        }
        return false;
    }
    
    
    public StringBuilder showListMovies(){
        StringBuilder listExt =  new StringBuilder();
        for (Movie listMovy : listMovies) {
            listExt.append(listMovy);
        }
        return listExt;
    }
}
