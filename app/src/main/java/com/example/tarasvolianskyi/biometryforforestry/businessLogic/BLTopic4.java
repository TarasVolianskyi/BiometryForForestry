package com.example.tarasvolianskyi.biometryforforestry.businessLogic;

public class BLTopic4 {

    BLTopic3 blTopic3 = new BLTopic3();
    BLTopic21 blTopic21 = new BLTopic21();

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
}
