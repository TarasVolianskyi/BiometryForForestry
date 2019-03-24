package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import android.widget.ListView;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BLTopic21 {

    private MyArrayData myArrayData = new MyArrayData();
    private ArrayList<Double> arrayListDiametr;
    private ArrayList<Double> arrayListHeight;
    private ArrayList<Integer> myArrayDiameterInRozrads;
    private ArrayList<Integer> myArrayHeightInRozrads;

    public int numberOfTrees;
    private double lgN;
    private double exectNumbOfRozrad;
    private double numbRozradRounded;
    private double Xmax;
    private double Xmin;
    private double Ymax;
    private double Ymin;
    private double CxWitoutRound;
    private double CyWitoutRound;
    private double Cx;
    private double Cy;
    private double X1;
    private double Y1;
    private double NgranX;
    private double NgranY;
    private double VgranX;
    private double VgranY;
    private ListView listView;


    private ArrayList<Double> arrayListOfDataDiametr = new MyArrayData().getDataArrayDiametr();
    private POJOTableAdapter pojoTableAdapter = new POJOTableAdapter();

    public void putDataToArrayFromBD() {
        arrayListDiametr = arrayListOfDataDiametr;
    }

    public int countNumberOfTrees() {
        return numberOfTrees = arrayListOfDataDiametr.size();
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double countLgN() {
        return Math.round(Math.log10(countNumberOfTrees()) * 1000.0) / 1000.0;
    }

    public double countExectNumberOfRozrad() {
        return Math.round(((1 + 3.322 * countLgN()) * 100.0) / 100.0);
    }

    public double countNumberOfRozrad() {
        return Math.round(countExectNumberOfRozrad());
    }

    public double countXmax() {
        return Math.round(Collections.max(arrayListOfDataDiametr) * 10.0) / 10.0;
    }

    public double countXmin() {
        return Math.round(Collections.min(arrayListOfDataDiametr) * 10.0) / 10.0;
    }

    public double countYmax() {
        return Math.round(Collections.max(arrayListOfDataDiametr) * 10.0) / 10.0;
    }

    public double countYmin() {
        return Math.round(Collections.min(arrayListOfDataDiametr) * 10.0) / 10.0;

    }

    public double countCxWithoutRound() {
        return Math.round(((countXmax() - countXmin()) / countNumberOfRozrad()) * 100.0) / 100.0;

    }

    public double countCyWithoutRound() {
        return Math.round(((countYmax() - countYmin()) / countNumberOfRozrad()) * 100.0) / 100.0;
    }

    public double countCx() {
        return Math.round(countCxWithoutRound());
    }

    public double countCy() {
        return Math.round(countCyWithoutRound());
    }


    public double countX1() {
        X1 = Math.round((countXmin() - (Math.floor(countXmin() / countCx()) * countCx())) * 10.0) / 10.0;
        double y = 80;
        if (X1 < Math.round(countCx() / 2 * 100.0) / 100.0) {
            y = 111 + 1;
        } else if (X1 > Math.round(countCx() / 2 * 100.0) / 100.0) {
            y = 222 + 1;
        }
        //X1 = countXmin();
        //return X1;
        return 24.0;
    }

    public double countY1() {
        return 24.0;
    }

    public double countNgranX() {
        NgranX = Math.round((countX1() - 0.5 * countCx()) * 10.0) / 10.0;
        return NgranX;
    }

    public double countNgranY() {
        NgranY = Math.round((countY1() - 0.5 * countCy()) * 10.0) / 10.0;
        return NgranY;
    }

    public double countVgranX() {
        VgranX = Math.round((countX1() + 0.5 * countCx() - 0.1) * 10.0) / 10.0;
        return VgranX;
    }

    public double countVgranY() {
        VgranY = Math.round((countY1() + 0.5 * countCy() - 0.1) * 10.0) / 10.0;
        return VgranY;
    }


    public ArrayList<POJOTableAdapter> showListInTable() {
        ArrayList<POJOTableAdapter> arrayListPOJO = new ArrayList<>();
        ArrayList<Integer> arrayListOfCountedRozrads = (ArrayList<Integer>) sortDuplicatsOfRozrads(findNumbOfRozradForAllItems(new MyArrayData().getDataArrayDiametr()));
        ArrayList<Integer> arrayListLastColomn = (ArrayList<Integer>) lastColomnTopic21(arrayListOfCountedRozrads);
        for (int i = 0; i < arrayListOfCountedRozrads.size(); i++) {
            arrayListPOJO.add(new POJOTableAdapter((countX1() + countCx() * i - countCx() / 2) + " - " + ((countX1() + countCx() * i + countCx() / 2) - 0.1),
                    (countX1() + countCx() * i), "    ", arrayListOfCountedRozrads.get(i), arrayListLastColomn.get(i)));

        }
        return arrayListPOJO;
    }


    public List<Integer> findNumbOfRozradForAllItems(ArrayList<Double> realDiametrs) {
        List<Integer> arrayListOfRozrads = new ArrayList<>();
        for (int i = 0; i < realDiametrs.size(); i++) {
            arrayListOfRozrads.add(findRozradOfDiametr(24.0, 4.0, realDiametrs.get(i)));
        }
        return arrayListOfRozrads;
    }

    public List<Integer> sortDuplicatsOfRozrads(List<Integer> rozradOfItem) {
        List<Integer> arrayListOfRozrads = new ArrayList<>();
        Map<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
        for (int integer : rozradOfItem) {
            if (duplicates.containsKey(integer)) {
                duplicates.put(integer, duplicates.get(integer) + 1);
            } else {
                duplicates.put(integer, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            arrayListOfRozrads.add(entry.getValue());
        }
        return arrayListOfRozrads;
    }


    public int findRozradOfDiametr(Double x1, Double cx, Double oneDiametr) {
        int res = 0;
        for (int i = 1; i < 25; i++) {
            if (oneDiametr < x1 + ((i - 1) * cx) + (cx / 2 - 0.1)) {
                //res = i;
                return res = i;
            }
        }
        return res;
    }

    public List<Integer> lastColomnTopic21(List<Integer> listForCount) {
        int sumItem = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < listForCount.size(); i++) {
            sumItem += listForCount.get(i);
            resultList.add(sumItem);
        }

        return resultList;
    }

    public ArrayList<Integer> getArrayWithDiametrRozrads() {
        myArrayDiameterInRozrads = (ArrayList<Integer>) sortDuplicatsOfRozrads(findNumbOfRozradForAllItems(new MyArrayData().getDataArrayDiametr()));
        return myArrayDiameterInRozrads;
    }

}
