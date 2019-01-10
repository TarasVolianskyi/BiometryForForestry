package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BLTopic21 {

    private MyArrayData myArrayData = new MyArrayData();
    private ArrayList<Double> arrayListDiametr;
    private ArrayList<Double> arrayListHeight;
    public int numberOfTrees = 107;
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

    public void putDataToArrayFromBD() {
        arrayListDiametr = getRandomArray();
    }

    public ArrayList<Double> getRandomArray() {
        ArrayList<Double> myDoubleData = new ArrayList<>();
        for (int i = 0; i < 106; i++) {
            Random r = new Random();
            double randomValue = 20.0 + (50.0 - 20.0) * r.nextDouble();
            myDoubleData.add(randomValue);
        }
        return myDoubleData;
    }

    /*public int countMainSize() {
        return numberOfTrees = arrayListDiametr.size();
    }*/

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double countLgN() {
        lgN = Math.round(Math.log10(numberOfTrees) * 1000.0) / 1000.0;
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
        Xmax = Math.round(Collections.max(getRandomArray()) * 10.0) / 10.0;
        return Xmax;
    }

    public double countXmin() {
        Xmin = Math.round(Collections.min(getRandomArray()) * 10.0) / 10.0;
        return Xmin;
    }

    public double countYmax() {
        Ymax = Math.round(Collections.max(getRandomArray()) * 10.0) / 10.0;
        return Ymax;
    }

    public double countYmin() {
        Ymin = Math.round(Collections.min(getRandomArray()) * 10.0) / 10.0;
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
        X1 = countXmin() - countCx();
        do {
            X1 -= countCx();
        } while (X1 == 0.0 || X1 < 0.0);
        X1 += countCx();
       // X1 = countXmin() - X1;
        return X1;
    }

    public double countY1() {
        return 2.0;
    }

    public double countNgranX() {
        NgranX = countX1() - 0.5 * countCx();
        return NgranX;
    }

    public double countNgranY() {
        return 2.0;
    }

    public double countVgranX() {
        VgranX = countX1() + 0.5 * countCx() - 0.1;
        return VgranX;
    }

    public double countVgranY() {
        return 2.0;
    }

}
