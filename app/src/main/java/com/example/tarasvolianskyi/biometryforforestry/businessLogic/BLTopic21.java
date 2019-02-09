package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import android.content.Context;
import android.widget.Toast;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BLTopic21 {

    private MyArrayData myArrayData = new MyArrayData();
    private ArrayList<Double> arrayListDiametr;
    private ArrayList<Double> arrayListHeight;
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
        lgN = Math.round(Math.log10(countNumberOfTrees()) * 1000.0) / 1000.0;
        return lgN;
    }

    public double countExectNumberOfRozrad() {
        exectNumbOfRozrad = Math.round(((1 + 3.322 * countLgN()) * 100.0) / 100.0);
        return exectNumbOfRozrad;
    }

    public double countNumberOfRozrad() {
        numbRozradRounded = Math.round(countExectNumberOfRozrad());
        return numbRozradRounded;
    }

    public double countXmax() {
        Xmax = Math.round(Collections.max(arrayListOfDataDiametr) * 10.0) / 10.0;
        return Xmax;
    }

    public double countXmin() {
        Xmin = Math.round(Collections.min(arrayListOfDataDiametr) * 10.0) / 10.0;
        return Xmin;
    }

    public double countYmax() {
        Ymax = Math.round(Collections.max(arrayListOfDataDiametr) * 10.0) / 10.0;
        return Ymax;
    }

    public double countYmin() {
        Ymin = Math.round(Collections.min(arrayListOfDataDiametr) * 10.0) / 10.0;
        return Ymin;
    }

    public double countCxWithoutRound() {
        CxWitoutRound = Math.round(((countXmax() - countXmin()) / countNumberOfRozrad()) * 100.0) / 100.0;
        return CxWitoutRound;
    }

    public double countCyWithoutRound() {
        CyWitoutRound = Math.round(((countYmax() - countYmin()) / countNumberOfRozrad()) * 100.0) / 100.0;
        return CyWitoutRound;
    }

    public double countCx() {
        Cx = Math.round(countCxWithoutRound());
        return Cx;
    }

    public double countCy() {
        Cy = Math.round(countCyWithoutRound());
        return Cy;
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
        //  arrayListTestAdapter = new ArrayList<>();
        //   for (double i = countXmin(); i < 4 + countNumberOfRozrad(); i += 4.0) {
        for (double i = countX1(); i < 50; i += 4.0) {
            // arrayListTestAdapter.add(i);
            arrayListPOJO.add(new POJOTableAdapter((i - countCx() / 2) + " - " + ((i + countCx() / 2) - 0.1),
                    i, "    ", 230000, 333));

        }
        return arrayListPOJO;
    }


    public ArrayList<Double> countDiametrForCategory(Double x1,Double Cx, ArrayList<Double> arrayListDiametr){







        return null;
    }

    public int findRozradOfDiametr(Double x1, Double cx, Double oneDiametr) {
        int res = 0;
        for (int i = 1; i < 25; i++) {
            if (oneDiametr < x1 + i * cx) {
                //res = i;
                return res = i;
            }
        }
        return res;
    }
}
