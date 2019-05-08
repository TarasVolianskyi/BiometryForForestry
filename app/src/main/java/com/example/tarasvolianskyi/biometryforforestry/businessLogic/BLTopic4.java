package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter4;

import java.util.ArrayList;

public class BLTopic4 {

    BLTopic3 blTopic3 = new BLTopic3();
    BLTopic21 blTopic21 = new BLTopic21();
    private POJOTableAdapter4 pojoTableAdapter4 = new POJOTableAdapter4();


    private int numberOfTrees = blTopic3.getNumberOfTrees();
    private double XSerArefm = blTopic3.getChapter34Res1();
    private double sigmaTopic4 = blTopic3.getChapter34Res2();
    private double Cx = blTopic21.countCx();

    public double getXminTopic4() {
        return Math.round((XSerArefm - 3 * sigmaTopic4) * 10.0) / 10.0;
    }

    public double getXmaxTopic4() {
        return Math.round((XSerArefm + 3 * sigmaTopic4) * 10.0) / 10.0;
    }


    public ArrayList<POJOTableAdapter> showListInTable() {
        ArrayList<POJOTableAdapter> arrayListPOJO = new ArrayList<>();
      /*  ArrayList<Integer> arrayListOfCountedRozrads = (ArrayList<Integer>) sortDuplicatsOfRozrads(findNumbOfRozradForAllItems(new MyArrayData().getDataArrayDiametr()));
        ArrayList<Integer> arrayListLastColomn = (ArrayList<Integer>) lastColomnTopic21(arrayListOfCountedRozrads);
        for (int i = 0; i < arrayListOfCountedRozrads.size(); i++) {
            arrayListPOJO.add(new POJOTableAdapter((countX1() + countCx() * i - countCx() / 2) + " - " + ((countX1() + countCx() * i + countCx() / 2) - 0.1),
                    (countX1() + countCx() * i), "    ", arrayListOfCountedRozrads.get(i), arrayListLastColomn.get(i)));}
*/

        return arrayListPOJO;
    }
}
