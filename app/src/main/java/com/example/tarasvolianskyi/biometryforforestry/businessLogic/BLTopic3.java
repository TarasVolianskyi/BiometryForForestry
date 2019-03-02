package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter3;

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

    @RequiresApi(api = Build.VERSION_CODES.N)
    public ArrayList<POJOTableAdapter3> showListInTable() {
        ArrayList<POJOTableAdapter3> arrayListPOJO3 = new ArrayList<>();
        ArrayList<Integer> arrayListOfCountedRozrads = myArrayDiametrChastotu;
        countAllTable();
        for (int i = 0; i < arrayListOfCountedRozrads.size(); i++) {
            arrayListPOJO3.add(new POJOTableAdapter3(myArrayDiametrChastotu.get(i), arrayListColomn3Tab3.get(i)
                    , arrayListColomn4Tab3.get(i), arrayListColomn5Tab3.get(i), arrayListColomn6Tab3.get(i), arrayListColomn7Tab3.get(i),1, 1, 1
            ));
        }
        return arrayListPOJO3;
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
        res = itemsBiggerThanHalf.get(0) + 1;
        return res;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public ArrayList<Integer> createArrayColomn3() {
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            arrayListColomn3Tab3.add(i - findPlaceWithZeroForColomn3Table3());
            resArray.add(i - findPlaceWithZeroForColomn3Table3());
        }
        return resArray;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public ArrayList<Integer> countArray(int stepin) {
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            resArray.add(Math.multiplyExact((int) Math.pow(createArrayColomn3().get(i), stepin), myArrayDiametrChastotu.get(i)));
        }
        return resArray;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countAllTable() {
        arrayListColomn4Tab3 = countArray(1);
        arrayListColomn5Tab3 = countArray(2);
        arrayListColomn6Tab3 = countArray(3);
        arrayListColomn7Tab3 = countArray(4);
    }

}
