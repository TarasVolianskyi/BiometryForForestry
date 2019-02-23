package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BLTopic3 {

    private int numberOfTrees = 105;

    private ArrayList<Integer> myArrayDiametrRozrads = new BLTopic21().getArrayWithDiametrRozrads();// TODO change
    private ArrayList<Integer> myArrayDiametrChastotu = (ArrayList<Integer>) new BLTopic21().getArrayWithDiametrRozrads();
    private ArrayList<Integer> myArrayDiametrChastotuSumm = (ArrayList<Integer>) new BLTopic21().lastColomnTopic21(myArrayDiametrChastotu);
    private ArrayList<Integer> itemsBiggerThanHalf = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn3Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn4Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn5Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn6Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn7Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn8Tab3 = new ArrayList<>();
    private ArrayList<Integer> arrayListColomn9Tab3 = new ArrayList<>();

    public ArrayList<String> showListInTable() {
        ArrayList<String> arrayListPOJO = new ArrayList<>();
        ArrayList<Integer> arrayListOfCountedRozrads = myArrayDiametrChastotu;
        // ArrayList<Integer> arrayListLastColomn = (ArrayList<Integer>) lastColomnTopic21(arrayListOfCountedRozrads);
        //  arrayListTestAdapter = new ArrayList<>();
        //   for (double i = countXmin(); i < 4 + countNumberOfRozrad(); i += 4.0) {
        for (int i = 0; i < arrayListOfCountedRozrads.size(); i++) {
            // arrayListTestAdapter.add(i);
            // arrayListPOJO.add(myArrayDiametrChastotu.get(i)));
            arrayListPOJO.add("ff");
        }
        //arrayListOfCountedRozrads.get((int) i)
        return arrayListPOJO;
    }

    public int findPlaceWithZeroForColomn3Table3() {
        int res = 0;
        int middle = (int) roundAvoid(numberOfTrees / 2, 1);

        for (int i = 0; i < myArrayDiametrChastotuSumm.size(); i++) {

            if (myArrayDiametrChastotuSumm.get(i) <= middle && myArrayDiametrChastotuSumm.get(i + 1) > middle) {
                itemsBiggerThanHalf.add(i);
            }
        }
        //res = Collections.min(itemsBiggerThanHalf);
        res = itemsBiggerThanHalf.get(0)+1;
        return res;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


}
