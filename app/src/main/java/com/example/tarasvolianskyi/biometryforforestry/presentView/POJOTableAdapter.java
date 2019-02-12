package com.example.tarasvolianskyi.biometryforforestry.presentView;

public class POJOTableAdapter {

    private String textOne;
    private double num2;
    private String textThree;
    private int num4;
    private double num5;


    public POJOTableAdapter(String textOne, double num2, String textThree, int num4, double num5) {
        this.textOne = textOne;
        this.num2 = num2;
        this.textThree = textThree;
        this.num4 = num4;
        this.num5 = num5;
    }

    public POJOTableAdapter() {

    }

    public void setTextOne(String textOne) {
        this.textOne = textOne;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setTextThree(String textThree) {
        this.textThree = textThree;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public String getTextOne() {
        return textOne;
    }

    public double getNum2() {
        return num2;
    }

    public String getTextThree() {
        return textThree;
    }

    public double getNum4() {
        return num4;
    }

    public double getNum5() {
        return num5;
    }

    @Override
    public String toString() {
        return "POJOTableAdapter{" +
                "textOne='" + textOne + '\'' +
                ", num2=" + num2 +
                ", textThree='" + textThree + '\'' +
                ", num4=" + num4 +
                ", num5=" + num5 +
                '}';
    }
}
