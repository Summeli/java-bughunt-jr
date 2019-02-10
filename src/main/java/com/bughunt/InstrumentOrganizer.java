package com.bughunt;

import java.util.Comparator;

public class InstrumentOrganizer implements Comparator<Instrument> {


        //sortataan arvon mukaan nousevaksi
        @Override
        public int compare(Instrument o1, Instrument o2){

            //null check, lisäpisteitä voidaan laskea, jos hoksataan ottaa
            // null arvot sorttauksessa huomioon
            if (o1.getValue()==null && o2.getValue() != null) {
                return 1;
            }

            if (o1.getValue() != null && o2.getValue() == null){
                return -1;
            }

            if (o1.getValue() == null && o2.getValue() == null) {
                return 0;
            }

            //Tässä on oikeastaan tärkein osa, eli hoksataan ottaa huomioon tilanne,
            // jolloin objektit ovat yhtäsuuria
            if(o1.getValue() > o2.getValue()){
                return 1;
            }else if(o1.getValue() < o2.getValue()){
                return -1;
            }else {
                return 0;
            }
    }
}
