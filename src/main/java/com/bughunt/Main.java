package com.bughunt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //try null value, to see the problems with buggy organizer
        Instrument a = new Instrument("a",1);
        Instrument b = new Instrument("b",0);
        Instrument c = new Instrument("c",0);
        Instrument d = new Instrument("d",4);
        Instrument e = new Instrument("e",4);
        Instrument f = new Instrument("f",3);
        Instrument g = new Instrument("g",5);
        Instrument h = new Instrument("h",7);
        Instrument i = new Instrument("i",8);
        Instrument j = new Instrument("j",8);
        Instrument k = new Instrument("k",9);
        Instrument l = new Instrument("l",9);
        Instrument m = new Instrument("m",0);
        Instrument n = new Instrument("n",0);
        Instrument o = new Instrument("o",1);

        //add instruments to two lists, and sort
        List<Instrument> instruments = new LinkedList<Instrument>();
        instruments.add(a);
        instruments.add(b);
        instruments.add(c);
        instruments.add(d);
        instruments.add(e);
        instruments.add(f);
        instruments.add(g);
        instruments.add(h);
        instruments.add(i);
        instruments.add(j);
        instruments.add(k);
        instruments.add(l);
        instruments.add(m);
        instruments.add(n);
        instruments.add(o);

        List<Instrument> instruments2 = new ArrayList<Instrument>();
        instruments2.add(a);
        instruments2.add(b);
        instruments2.add(c);
        instruments2.add(d);
        instruments2.add(e);
        instruments2.add(f);
        instruments2.add(g);
        instruments2.add(h);
        instruments2.add(i);
        instruments2.add(j);
        instruments2.add(k);
        instruments2.add(l);
        instruments2.add(m);
        instruments2.add(n);
        instruments2.add(o);


        Collections.sort(instruments, new BuggyInstrumentOrganizer());
        Collections.sort(instruments2, new InstrumentOrganizer());
        System.out.println("Printing the BUGGG VS CORRECT ORDER");
        System.out.println("------------------");
        for (int x = 0; x < instruments.size(); x++) {
            System.out.println (instruments.get(x).getName() + "-" +instruments.get(x).getValue() + "  VS  "+ instruments2.get(x).getName()+"-" +instruments2.get(x).getValue());
        }

    }
}

