package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BLTopic3 {

    private int numberOfTrees = 105;
    BLTopic21 blTopic21 = new BLTopic21();
    private double sumColomn4;
    private double sumColomn5;
    private double sumColomn6;
    private double sumColomn7;
    private double sumColomn9;
    private double m1;
    private double m2;
    private double m3;
    private double m4;

    private double mu2;
    private double mu3;
    private double mu4;

    private POJOTableAdapter3 pojoTableAdapter3 = new POJOTableAdapter3();
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
            //todo - fix this code
            arrayListPOJO3.add(new POJOTableAdapter3((int) (blTopic21.countX1() + blTopic21.countCx() * i), myArrayDiametrChastotu.get(i),
                    arrayListColomn3Tab3.get(i), arrayListColomn4Tab3.get(i), arrayListColomn5Tab3.get(i),
                    arrayListColomn6Tab3.get(i), arrayListColomn7Tab3.get(i), arrayListColomn8Tab3.get(i), arrayListColomn9Tab3.get(i)));
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
        res = itemsBiggerThanHalf.get(0) + 1;
        return res;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public ArrayList<Integer> createArrayColomn3() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            arrayListColomn3Tab3.add(i - findPlaceWithZeroForColomn3Table3());
            res = i - findPlaceWithZeroForColomn3Table3();
            resArray.add(res);
            pojoTableAdapter3.setColomn3(res);
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

    @TargetApi(Build.VERSION_CODES.N)
    public ArrayList<Integer> countArrayColomn4() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            res = Math.multiplyExact((int) Math.pow(createArrayColomn3().get(i), 1), myArrayDiametrChastotu.get(i));
            resArray.add(res);
            pojoTableAdapter3.setColomn4(res);
        }
        return resArray;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public ArrayList<Integer> countArrayColomn5() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            res = Math.multiplyExact((int) Math.pow(createArrayColomn3().get(i), 2), myArrayDiametrChastotu.get(i));
            resArray.add(res);
            pojoTableAdapter3.setColomn5(res);
        }
        return resArray;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public ArrayList<Integer> countArrayColomn6() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            res = Math.multiplyExact((int) Math.pow(createArrayColomn3().get(i), 3), myArrayDiametrChastotu.get(i));
            resArray.add(res);
            pojoTableAdapter3.setColomn6(res);
        }
        return resArray;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public ArrayList<Integer> countArrayColomn7() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            res = Math.multiplyExact((int) Math.pow(createArrayColomn3().get(i), 4), myArrayDiametrChastotu.get(i));
            resArray.add(res);
            pojoTableAdapter3.setColomn7(res);
        }
        return resArray;
    }

    public ArrayList<Integer> countArrayColomn8() {
        int res;
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            arrayListColomn8Tab3.add(i - findPlaceWithZeroForColomn3Table3());
            res = i - findPlaceWithZeroForColomn3Table3() + 1;
            resArray.add(res);
            pojoTableAdapter3.setColomn8(res);
        }
        return resArray;
    }
    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    public ArrayList<Integer> countArrayColomn9(int stepin) {
        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i = 0; i < myArrayDiametrChastotu.size(); i++) {
            resArray.add(Math.multiplyExact((int) Math.pow(countArrayColomn8().get(i), stepin), myArrayDiametrChastotu.get(i)));
        }
        return resArray;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countAllTable() {
        arrayListColomn4Tab3 = countArray(1);
        arrayListColomn5Tab3 = countArray(2);
        arrayListColomn6Tab3 = countArray(3);
        arrayListColomn7Tab3 = countArray(4);
        arrayListColomn8Tab3 = countArrayColomn8();
        arrayListColomn9Tab3 = countArrayColomn9(4);
    }

    private double findSummOfArrayItems(ArrayList<Integer> arrayListOfItems) {
        double sum = 0;
        for (int i = 0; i < arrayListOfItems.size(); i++)
            sum += arrayListOfItems.get(i);
        return sum;
    }

    public double getSumColomn4Topic3() {
        return sumColomn4 = findSummOfArrayItems(countArrayColomn4());
    }

    public double getSumColomn5Topic3() {
        return sumColomn4 = findSummOfArrayItems(countArrayColomn5());
    }

    public double getSumColomn6Topic3() {
        return sumColomn4 = findSummOfArrayItems(countArrayColomn6());
    }

    public double getSumColomn7Topic3() {
        return sumColomn4 = findSummOfArrayItems(countArrayColomn7());
    }

    public double getSumColomn9Topic3() {
        return sumColomn4 = findSummOfArrayItems(countArrayColomn4());
    }

    public double getM1() {
        return m1 = Math.round((getSumColomn4Topic3() / (double) numberOfTrees) * 10000.0) / 10000.0;
    }

    public double getM2() {
        return m2 = Math.round((getSumColomn5Topic3() / (double) numberOfTrees) * 10000.0) / 10000.0;
    }

    public double getM3() {
        return m3 = Math.round((getSumColomn6Topic3() / (double) numberOfTrees) * 10000.0) / 10000.0;
    }

    public double getM4() {
        return m4 = Math.round((getSumColomn7Topic3() / (double) numberOfTrees) * 10000.0) / 10000.0;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public double getControlLeft() {
        return Math.round((1.0 + 4 * getM1() + 6 * getM2() + 4 * getM3() + getM4()) * 10000.0) / 10000.0;
    }

    public double getControlRight() {
        return Math.round((getSumColomn9Topic3() / (double) numberOfTrees) * 10000.0) / 10000.0;
    }

    public double getMu2() {
        return Math.round((getM2() - Math.pow(getM1(), 2)) * 10000.0) / 10000.0;
    }

    public double getMu3() {
        return Math.round((getM3() - 3 * getM1() * getM2() + 2 * Math.pow(getM1(), 3)) * 10000.0) / 10000.0;
    }

    public double getMu4() {
        return Math.round((getM4() - 4 * getM1() * getM3() + 6 * Math.pow(getM1(), 2) * getM2() -
                3 * Math.pow(getM1(), 4)) * 10000.0) / 10000.0;
    }

    public double getMu3Control() {
        return Math.round((getM3() - 3 * getM1() * getMu2() - Math.pow(getM1(), 3)) * 10000.0) / 10000.0;
    }

    public double getMu4Control() {
        return Math.round((getM4() - 4 * getM1() * getMu3() - 6 * Math.pow(getM1(), 2) * getMu2() - Math.pow(getM1(), 4)) * 10000.0) / 10000.0;
    }

    public double getR3() {
        return Math.round((getMu3() / Math.pow(getMu2(), 1.5)) * 1000.0) / 1000.0;
    }

    public double getR4() {
        return Math.round((getMu4() / Math.pow(getMu2(), 2)) * 1000.0) / 1000.0;
    }

    public double getChapter34Res1() {
        return Math.round((getChapter34X0() + blTopic21.countCx() * getM1()) * 10.0) / 10.0;
    }

    public double getChapter34Res2() {
        return Math.round((blTopic21.countCx() * Math.sqrt(getM2())) * 100.0) / 100.0;
    }

    public double getChapter34Res3() {
        return Math.round((getChapter34Res2() / getChapter34Res1() * 100) * 10.0) / 10.0;
    }

    public double getChapter34Res4() {
        return Math.round(getR3() * 100.0) / 100.0;
    }

    public double getChapter34Res5() {
        return Math.round((getR4() - 3) * 100.0) / 100.0;
    }

    public double getChapter34Res6() {
        return Math.round((getChapter34Res2() / Math.sqrt(numberOfTrees)) * 100.0) / 100.0;
    }

    public double getChapter34Res7() {
        return Math.round((getChapter34Res2() / Math.sqrt(2 * numberOfTrees)) * 1000.0) / 1000.0;
    }

    public double getChapter34Res8() {
        return Math.round(((getChapter34Res3() / Math.sqrt(2 * numberOfTrees)) * Math.sqrt(1 + 2 * Math.pow(getChapter34Res3() / 100,
                2))) * 10.0) / 10.0;
    }

    public double getChapter34Res9() {
        return Math.round(Math.sqrt(6 / (double) numberOfTrees) * 100.0) / 100.0;
    }

    public double getChapter34Res10() {
        return Math.round(2 * Math.sqrt(6 / (double) numberOfTrees) * 100.0) / 100.0;
    }

    public double getChapter34Res11() {
        return Math.round((getChapter34Res6() / getChapter34Res1() * 100) * 10.0) / 10.0;
    }

    public double getChapter34X0() {
        double locX1 = blTopic21.countX1();
        double locCx = blTopic21.countCx();
        return locX1 + locCx * findPlaceWithZeroForColomn3Table3();
    }

    //3.5
    public double getKvantul() {
        return 1.96;
    }


    public double getLimitRes1Min() {
        return Math.round((getChapter34Res1() - getKvantul() * getChapter34Res6()) * 100.0) / 100.0;
    }

    public double getLimitRes1Max() {
        return Math.round((getChapter34Res1() + getKvantul() * getChapter34Res6()) * 100.0) / 100.0;
    }

    public double getLimitRes2Min() {
        return Math.round((getChapter34Res2() - getKvantul() * getChapter34Res7()) * 10.0) / 10.0;
    }

    public double getLimitRes2Max() {
        return Math.round((getChapter34Res2() + getKvantul() * getChapter34Res7()) * 10.0) / 10.0;
    }

    public double getLimitRes3Min() {
        return Math.round((getChapter34Res3() - getKvantul() * getChapter34Res8()) * 10.0) / 10.0;
    }

    public double getLimitRes3Max() {
        return Math.round((getChapter34Res3() + getKvantul() * getChapter34Res8()) * 10.0) / 10.0;
    }

    public double getLimitRes4Min() {
        return Math.round((getChapter34Res4() - getKvantul() * getChapter34Res9()) * 100.0) / 100.0;
    }

    public double getLimitRes4Max() {
        return Math.round((getChapter34Res4() + getKvantul() * getChapter34Res9()) * 100.0) / 100.0;
    }

    public double getLimitRes5Min() {
        return Math.round((getChapter34Res5() - getKvantul() * getChapter34Res10()) * 100.0) / 100.0;
    }

    public double getLimitRes5Max() {
        return Math.round((getChapter34Res5() + getKvantul() * getChapter34Res10()) * 100.0) / 100.0;
    }
}
