package com.example.tarasvolianskyi.biometryforforestry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarasvolianskyi on 21.03.18.
 */

public class TopicOneCountFragment extends Fragment {

    View view;

    private double number1;
    private double number2;
    private double number3;
    private double number4;
    private double number5;
    private double number6;
    private double number7;
    private double number8;
    private double number9;
    private double number10;
    private double number11;
    private double number12;
    private double number13;
    private double number14;
    private double number15;
    private double number16;
    private double number17;
    private double number18;
    private double number19;
    private double number20;

    private double number1colomn2;
    private double number2colomn2;
    private double number3colomn2;
    private double number4colomn2;
    private double number5colomn2;
    private double number6colomn2;
    private double number7colomn2;
    private double number8colomn2;
    private double number9colomn2;
    private double number10colomn2;
    private double number11colomn2;
    private double number12colomn2;
    private double number13colomn2;
    private double number14colomn2;
    private double number15colomn2;
    private double number16colomn2;
    private double number17colomn2;
    private double number18colomn2;
    private double number19colomn2;
    private double number20colomn2;

    private double number1colomn3;
    private double number2colomn3;
    private double number3colomn3;
    private double number4colomn3;
    private double number5colomn3;
    private double number6colomn3;
    private double number7colomn3;
    private double number8colomn3;
    private double number9colomn3;
    private double number10colomn3;
    private double number11colomn3;
    private double number12colomn3;
    private double number13colomn3;
    private double number14colomn3;
    private double number15colomn3;
    private double number16colomn3;
    private double number17colomn3;
    private double number18colomn3;
    private double number19colomn3;
    private double number20colomn3;

    private TextView tvTableC1R1;
    private TextView tvTableC1R2;
    private TextView tvTableC1R3;
    private TextView tvTableC1R4;
    private TextView tvTableC1R5;
    private TextView tvTableC1R6;
    private TextView tvTableC1R7;
    private TextView tvTableC1R8;
    private TextView tvTableC1R9;
    private TextView tvTableC1R10;
    private TextView tvTableC1R11;
    private TextView tvTableC1R12;
    private TextView tvTableC1R13;
    private TextView tvTableC1R14;
    private TextView tvTableC1R15;
    private TextView tvTableC1R16;
    private TextView tvTableC1R17;
    private TextView tvTableC1R18;
    private TextView tvTableC1R19;
    private TextView tvTableC1R20;

    private TextView tvTableC2R1;
    private TextView tvTableC2R2;
    private TextView tvTableC2R3;
    private TextView tvTableC2R4;
    private TextView tvTableC2R5;
    private TextView tvTableC2R6;
    private TextView tvTableC2R7;
    private TextView tvTableC2R8;
    private TextView tvTableC2R9;
    private TextView tvTableC2R10;
    private TextView tvTableC2R11;
    private TextView tvTableC2R12;
    private TextView tvTableC2R13;
    private TextView tvTableC2R14;
    private TextView tvTableC2R15;
    private TextView tvTableC2R16;
    private TextView tvTableC2R17;
    private TextView tvTableC2R18;
    private TextView tvTableC2R19;
    private TextView tvTableC2R20;

    private TextView tvAvarage;

    List<Double> arrayWithNumbers1Topic = new ArrayList<>();
    List<Double> arrayWithNumbers2Topic = new ArrayList<>();
    List<Double> arrayWithNumbers3Topic = new ArrayList<>();

    private double sumOf20;
    private double avarageOf20;
    TextView testTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_1_view_fragment, container, false);
        bussinessLogic();
        initView();

        return view;
    }

    private void bussinessLogic() {
        getDataWithNumbersToTable1();
        putFirstColumnToTable();
        putDataToArrayWithNumbers1();
        countSumOf20();
        countAvarage();
        countAllTable();
        putDataToArrayWithNumbers2();
    }



    private void initView() {

        testTextView = view.findViewById(R.id.tvR12C2_topic_1_view_fragment);
        testTextView.setText(String.valueOf(sumOf20));
    }

    private void putFirstColumnToTable() {
        tvTableC1R1 = view.findViewById(R.id.tvR2C2_topic_1_view_fragment);
        tvTableC1R2 = view.findViewById(R.id.tvR3C2_topic_1_view_fragment);
        tvTableC1R3 = view.findViewById(R.id.tvR4C2_topic_1_view_fragment);
        tvTableC1R4 = view.findViewById(R.id.tvR5C2_topic_1_view_fragment);
        tvTableC1R5 = view.findViewById(R.id.tvR6C2_topic_1_view_fragment);
        tvTableC1R6 = view.findViewById(R.id.tvR7C2_topic_1_view_fragment);
        tvTableC1R7 = view.findViewById(R.id.tvR8C2_topic_1_view_fragment);
        tvTableC1R8 = view.findViewById(R.id.tvR9C2_topic_1_view_fragment);
        tvTableC1R9 = view.findViewById(R.id.tvR10C2_topic_1_view_fragment);
        tvTableC1R10 = view.findViewById(R.id.tvR11C2_topic_1_view_fragment);
        tvTableC1R11 = view.findViewById(R.id.tvR2C6_topic_1_view_fragment);
        tvTableC1R12 = view.findViewById(R.id.tvR3C6_topic_1_view_fragment);
        tvTableC1R13 = view.findViewById(R.id.tvR4C6_topic_1_view_fragment);
        tvTableC1R14 = view.findViewById(R.id.tvR5C6_topic_1_view_fragment);
        tvTableC1R15 = view.findViewById(R.id.tvR6C6_topic_1_view_fragment);
        tvTableC1R16 = view.findViewById(R.id.tvR7C6_topic_1_view_fragment);
        tvTableC1R17 = view.findViewById(R.id.tvR8C6_topic_1_view_fragment);
        tvTableC1R18 = view.findViewById(R.id.tvR9C6_topic_1_view_fragment);
        tvTableC1R19 = view.findViewById(R.id.tvR10C6_topic_1_view_fragment);
        tvTableC1R20 = view.findViewById(R.id.tvR11C6_topic_1_view_fragment);

        tvAvarage = view.findViewById(R.id.tvAvarage_topic_1_view_fragment);

        tvTableC1R1.setText(String.valueOf(number1));
        tvTableC1R2.setText(String.valueOf(number2));
        tvTableC1R3.setText(String.valueOf(number3));
        tvTableC1R4.setText(String.valueOf(number4));
        tvTableC1R5.setText(String.valueOf(number5));
        tvTableC1R6.setText(String.valueOf(number6));
        tvTableC1R7.setText(String.valueOf(number7));
        tvTableC1R8.setText(String.valueOf(number8));
        tvTableC1R9.setText(String.valueOf(number9));
        tvTableC1R10.setText(String.valueOf(number10));
        tvTableC1R11.setText(String.valueOf(number11));
        tvTableC1R12.setText(String.valueOf(number12));
        tvTableC1R13.setText(String.valueOf(number13));
        tvTableC1R14.setText(String.valueOf(number14));
        tvTableC1R15.setText(String.valueOf(number15));
        tvTableC1R16.setText(String.valueOf(number16));
        tvTableC1R17.setText(String.valueOf(number17));
        tvTableC1R18.setText(String.valueOf(number18));
        tvTableC1R19.setText(String.valueOf(number19));
        tvTableC1R20.setText(String.valueOf(number20));


    }

    private void countAvarage() {
        avarageOf20 = sumOf20 / 20;
        tvAvarage.setText(String.valueOf(sumOf20) + " / 20 = " + String.valueOf(avarageOf20));
    }

    private void putDataToArrayWithNumbers1() {

        arrayWithNumbers1Topic.add(number1);
        arrayWithNumbers1Topic.add(number2);
        arrayWithNumbers1Topic.add(number3);
        arrayWithNumbers1Topic.add(number4);
        arrayWithNumbers1Topic.add(number5);
        arrayWithNumbers1Topic.add(number6);
        arrayWithNumbers1Topic.add(number7);
        arrayWithNumbers1Topic.add(number8);
        arrayWithNumbers1Topic.add(number9);
        arrayWithNumbers1Topic.add(number10);
        arrayWithNumbers1Topic.add(number11);
        arrayWithNumbers1Topic.add(number12);
        arrayWithNumbers1Topic.add(number13);
        arrayWithNumbers1Topic.add(number14);
        arrayWithNumbers1Topic.add(number15);
        arrayWithNumbers1Topic.add(number16);
        arrayWithNumbers1Topic.add(number17);
        arrayWithNumbers1Topic.add(number18);
        arrayWithNumbers1Topic.add(number19);
        arrayWithNumbers1Topic.add(number20);
    }

    private void putDataToArrayWithNumbers2() {
        arrayWithNumbers2Topic.add(number1colomn2);


    }

    private void countAllTable() {
        countColomnTwo();
        countColomnThree();
        countSumInTable();
    }

    private void countSumInTable() {

    }

    private void countSumOf20() {
        sumOf20 = 0d;
        for (int i = 0; i < arrayWithNumbers1Topic.size(); ++i) {
            final double value = Double.parseDouble(String.valueOf(arrayWithNumbers1Topic.get(i)));
            sumOf20 += Math.round(value * 100) / 100.0;
        }
    }


    private void countColomnThree() {
    }

    private void countColomnTwo() {
        tvTableC2R1 = view.findViewById(R.id.tvR2C3_topic_1_view_fragment);
        tvTableC2R2 = view.findViewById(R.id.tvR3C3_topic_1_view_fragment);
        tvTableC2R3 = view.findViewById(R.id.tvR4C3_topic_1_view_fragment);
        tvTableC2R4 = view.findViewById(R.id.tvR5C3_topic_1_view_fragment);
        tvTableC2R5 = view.findViewById(R.id.tvR6C3_topic_1_view_fragment);
        tvTableC2R6 = view.findViewById(R.id.tvR7C3_topic_1_view_fragment);
        tvTableC2R7 = view.findViewById(R.id.tvR8C3_topic_1_view_fragment);
        tvTableC2R8 = view.findViewById(R.id.tvR9C3_topic_1_view_fragment);
        tvTableC2R9 = view.findViewById(R.id.tvR10C3_topic_1_view_fragment);
        tvTableC2R10 = view.findViewById(R.id.tvR11C3_topic_1_view_fragment);
        tvTableC2R11 = view.findViewById(R.id.tvR2C7_topic_1_view_fragment);
        tvTableC2R12 = view.findViewById(R.id.tvR3C7_topic_1_view_fragment);
        tvTableC2R13 = view.findViewById(R.id.tvR4C7_topic_1_view_fragment);
        tvTableC2R14 = view.findViewById(R.id.tvR5C7_topic_1_view_fragment);
        tvTableC2R15 = view.findViewById(R.id.tvR6C7_topic_1_view_fragment);
        tvTableC2R16 = view.findViewById(R.id.tvR7C7_topic_1_view_fragment);
        tvTableC2R17 = view.findViewById(R.id.tvR8C7_topic_1_view_fragment);
        tvTableC2R18 = view.findViewById(R.id.tvR9C7_topic_1_view_fragment);
        tvTableC2R19 = view.findViewById(R.id.tvR10C7_topic_1_view_fragment);
        tvTableC2R20 = view.findViewById(R.id.tvR11C7_topic_1_view_fragment);

        tvTableC2R1.setText(String.valueOf(number1colomn2));
        tvTableC2R2.setText(String.valueOf(number2colomn2));
        tvTableC2R3.setText(String.valueOf(number3colomn2));
        tvTableC2R4.setText(String.valueOf(number4colomn2));
        tvTableC2R5.setText(String.valueOf(number5colomn2));
        tvTableC2R6.setText(String.valueOf(number6colomn2));
        tvTableC2R7.setText(String.valueOf(number7colomn2));
        tvTableC2R8.setText(String.valueOf(number8colomn2));
        tvTableC2R9.setText(String.valueOf(number9colomn2));
        tvTableC2R10.setText(String.valueOf(number10colomn2));
        tvTableC2R11.setText(String.valueOf(number11colomn2));
        tvTableC2R12.setText(String.valueOf(number12colomn2));
        tvTableC2R13.setText(String.valueOf(number13colomn2));
        tvTableC2R14.setText(String.valueOf(number14colomn2));
        tvTableC2R15.setText(String.valueOf(number15colomn2));
        tvTableC2R16.setText(String.valueOf(number16colomn2));
        tvTableC2R17.setText(String.valueOf(number17colomn2));
        tvTableC2R18.setText(String.valueOf(number18colomn2));
        tvTableC2R19.setText(String.valueOf(number19colomn2));
        tvTableC2R20.setText(String.valueOf(number20colomn2));
    }

    private void getDataWithNumbersToTable1() {
        number1 = 33;
        number2 = 41;
        number3 = 32;
        number4 = 20;
        number5 = 14;
        number6 = 21;
        number7 = 29;
        number8 = 20;
        number9 = 18;
        number10 = 20;
        number11 = 16;
        number12 = 18;
        number13 = 17;
        number14 = 18;
        number15 = 35;
        number16 = 20;
        number17 = 42;
        number18 = 20;
        number19 = 30;
        number20 = 23;
    }

}
