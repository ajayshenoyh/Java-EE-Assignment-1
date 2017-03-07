package edu.fullerton.cs476.bean;

import edu.fullerton.cs476.model.Coin;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ajay on 2/27/17.
 */
@ManagedBean(name="coinBean")
@RequestScoped
public class CoinBean implements Serializable {

    private List<Coin> coins;
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getFlip() {
        return flip;
    }

    public void setFlip(String flip) {
        this.flip = flip;
    }


    StringBuilder str = new StringBuilder();
    public void randomflip() {
        Random rand = new Random();

        for (int count = 0; count < no; count++)
        {
            if (rand.nextInt(2) == 0)
                str.append("T");
            else
                str.append("H");
        }
        setFlip(str.toString());
    }
    private String flip;
    @PostConstruct
    public void init() {
        coins = new ArrayList<>();

    }
    public void start(){
        randomflip();
        coins.add(new Coin(no,flip));
    }
    public List<Coin> getBooks() {
        return coins;
    }

}