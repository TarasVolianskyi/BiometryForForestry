package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;

import java.util.ArrayList;
import java.util.Collections;

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
    private double Cx;
    private double Cy;
    private double X1;
    private double Y1;
    private double NgranX;
    private double NgranY;
    private double VgranX;
    private double VgranY;

    public void putDataToArrayFromBD() {
        arrayListDiametr = myArrayData.getRandomArray();
    }

    public int countMainSize() {
        return numberOfTrees = arrayListDiametr.size();
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double countLgN() {
        lgN = Math.round(Math.log10(numberOfTrees) * 1000.0) / 1000.0;
        //  lgN = Math.round(Math.log10((double)numberOfTrees));
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
        Xmax = Collections.max(arrayListDiametr);
        return Xmax;
    }

    public double countXmin() {
        Xmin = Collections.min(arrayListDiametr);
        return Xmin;
    }

    public double countYmax() {
        Ymax = Collections.max(arrayListHeight);
        return Ymax;
    }

    public double countYmin() {
        Ymin = Collections.min(arrayListHeight);
        return Ymin;
    }

    public double countCx() {
        Cx = Math.round((countXmax() - countXmin()) / countNumberOfRozrad());
        return Cx;
    }

    public double countCy() {
        Cy = Math.round((countYmax() - countYmin()) / countNumberOfRozrad());
        return Cy;
    }

    public double countX1() {
        X1 = countXmin() - countCx();
        do {
            X1 -= countCx();
        } while (X1 == 0.0 || X1 < 0.0);
        X1 += countCx();
        X1 = countXmin() - X1;
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
