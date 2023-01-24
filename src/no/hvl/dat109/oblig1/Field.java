package no.hvl.dat109.oblig1;

import java.util.ArrayList;

public class Field {

    public ArrayList<Integer> createFields() {
        ArrayList<Integer> fields = new ArrayList<Integer>(100);
        for(int i=1; i<=100; i++){
            fields.add(i);
        }
        return fields;
    }


}
