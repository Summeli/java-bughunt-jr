package com.bughunt;

import java.util.Comparator;

public class BuggyInstrumentOrganizer implements Comparator<Instrument>{

    //sort with value, cheapest first, if equal maintain original order
    @Override
    public int compare(Instrument o1, Instrument o2){
        return o1.getValue() > o2.getValue()? 1:-1;
    }
}
