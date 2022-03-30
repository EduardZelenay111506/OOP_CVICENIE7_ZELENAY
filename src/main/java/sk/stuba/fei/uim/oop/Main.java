package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clovek c = new Clovek("meno","adresa",187,100,20,new ArrayList<Clovek>(List.of(new Clovek())));
        System.out.println(c.toString());
    }
}
