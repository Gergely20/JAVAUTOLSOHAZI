package com.example.ElolenyesHazi;

interface Villam{
    public void belecsap();
    public void meghal();
}

public class Eloleny implements Villam{
    String eloleny;

    public Eloleny(String eloleny) {
        this.eloleny = eloleny;
    }
    public void meghal() {
        System.out.println("Meghalt az élőlény");
    }

    public void belecsap() {
        System.out.println("Belecsapott a villám");
    }
}
