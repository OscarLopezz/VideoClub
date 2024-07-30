package com.mycompany.clases;

import java.util.*;

public class NewRentMovie {
    private Movie movieRente; 
    private Customer customerWhoRent;

    public NewRentMovie(Movie movie, Customer customer) {
        movieRente = movie;
        customerWhoRent = customer;
    }

    public Movie getMovieRente() {
        return movieRente;
    }

    public void setMovieRente(Movie movieRente) {
        this.movieRente = movieRente;
    }

    public Customer getCustomerWhoRent() {
        return customerWhoRent;
    }

    public void setCustomerWhoRent(Customer customerWhoRent) {
        this.customerWhoRent = customerWhoRent;
    }

    @Override
    public String toString() {
        return movieRente.toString() + "\n" + customerWhoRent.toString(); 
    }
    
    
    
    
}
