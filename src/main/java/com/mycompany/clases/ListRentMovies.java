
package com.mycompany.clases;

import java.util.ArrayList;

public class ListRentMovies {
    private ArrayList<NewRentMovie> listRentMovies;

    public ListRentMovies() {
    listRentMovies = new ArrayList<>();
    }

    public ArrayList<NewRentMovie> getListRentMovies() {
        return listRentMovies;
    }

    public void setListRentMovies(ArrayList<NewRentMovie> listRentMovies) {
        this.listRentMovies = listRentMovies;
    }
    
    public StringBuilder printList() {
    StringBuilder output = new StringBuilder();
        for (NewRentMovie listRentMovy : listRentMovies) {
            output.append(listRentMovy.toString()).append("\n");
        }
        return output;
    }
    
    
    
    
}
