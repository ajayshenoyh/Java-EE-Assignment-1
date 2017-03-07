package edu.fullerton.cs476.model;
/**
 * Created by ajay on 2/27/17.
 */
public class Coin {

    private int no;

    private String flip;

    public Coin(int no, String flip){
        this.flip = flip;
        this.no = no;
    }

    public Coin() {

    }

    public String getflip() {
        return flip;
    }

    public void setflip(String flip) {
        this.flip = flip;
    }

    public int getno() {
        return no;
    }

    public void setno(int no) {
        this.no = no;
    }

}

