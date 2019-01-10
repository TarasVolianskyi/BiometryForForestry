package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import java.util.ArrayList;
import java.util.Random;

public class MyArrayData {

    public ArrayList <Double> getRandomArray() {
        ArrayList <Double> myDoubleData = new ArrayList <>();
        for (int i = 0; i < 106; i++) {
            Random r = new Random();
            double randomValue = 20.0 + (50.0 - 20.0) * r.nextDouble();
            myDoubleData.add(randomValue);
        }
        return myDoubleData;
    }
}
