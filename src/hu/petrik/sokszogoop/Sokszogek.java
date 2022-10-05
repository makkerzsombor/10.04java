package hu.petrik.sokszogoop;

import java.util.ArrayList;

public class Sokszogek {
    private static ArrayList<Sokszog> sokszogek = new ArrayList<>();

    public Sokszogek() {
        int rnd = (int)(Math.random() * 4) + 1;
        if (rnd == 1){
            sokszogek.add(new Negyzet());
        } else if (rnd == 2) {
            sokszogek.add(new Paralelogramma());
        } else if (rnd == 3) {
            sokszogek.add(new Teglalap());
        }else{
            sokszogek.add(new Haromszog());
        }
    }

    public double osszTerulet(){
        double terulet = 0;
        for (Sokszog sokszog : sokszogek) {
            terulet += sokszog.getTerulet();
        }
        return terulet;
    }

    public double osszKerulet(){
        double kerulet = 0;
        for(Sokszog sokszog : sokszogek){
            kerulet += sokszog.getTerulet();
        }
        return kerulet;
    }

    public double maxTerulet(){
        double terulet = 0;
        for (Sokszog sokszog : sokszogek){
            if (sokszog.getTerulet()>terulet){
                terulet = sokszog.getTerulet();
            }
        }
        return terulet;
    }

    public String kiir(int i){
        i++;
        return String.format("A lista elem: %s\n", sokszogek.get(i-1));

    }

    @Override
    public String toString() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f",osszKerulet(),osszTerulet(),maxTerulet());
    }
}
