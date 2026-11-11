package com.joysistvi.day24.abstraction.interface_;

// contract - dito nilalagay yung mga functionality
//na dapat makita sa actual application

public interface Pet {

    //static constant
    // default: public static final
    int MAX_PLAY_MINUTES = 30;

    //abstract method
    //default: public abstract (public)
    void play ();

    void showAffection ();

}
