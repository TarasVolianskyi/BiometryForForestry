package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;

import java.util.ArrayList;
import java.util.Collections;

public class BLTopic21 {

    private MyArrayData myArrayData = new MyArrayData();
    private ArrayList <Double> arrayListDiametr;
    private ArrayList <Double> arrayListHeight;
    private int numberOfTrees;
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


    public double countLgN() {
        lgN = Math.round((Math.log10(numberOfTrees) * 1000.0) / 1000.0);
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
        return 2.0;
    }

    public double countY1() {
        return 2.0;
    }

    public double countNgranX() {
        return 2.0;
    }

    public double countNgranY() {
        return 2.0;
    }

    public double countVgranX() {
        return 2.0;
    }

    public double countVgranY() {
        return 2.0;
    }

}
