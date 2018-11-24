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
import android.widget.Toast;

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

    private TextView tvTableC3R1;
    private TextView tvTableC3R2;
    private TextView tvTableC3R3;
    private TextView tvTableC3R4;
    private TextView tvTableC3R5;
    private TextView tvTableC3R6;
    private TextView tvTableC3R7;
    private TextView tvTableC3R8;
    private TextView tvTableC3R9;
    private TextView tvTableC3R10;
    private TextView tvTableC3R11;
    private TextView tvTableC3R12;
    private TextView tvTableC3R13;
    private TextView tvTableC3R14;
    private TextView tvTableC3R15;
    private TextView tvTableC3R16;
    private TextView tvTableC3R17;
    private TextView tvTableC3R18;
    private TextView tvTableC3R19;
    private TextView tvTableC3R20;

    private TextView tvAvarage;


    List<Double> arrayWithNumbers1Topic = new ArrayList<>();
    List<Double> arrayWithNumbers2Topic = new ArrayList<>();
    List<Double> arrayWithNumbers3Topic = new ArrayList<>();

    private double sumOf20;
    private double sumCol2;
    private double sumCol3;
    private double avarageOf20;
    private double sigma;
    private double koefMinl;
    private double intervalArefmN;
    private double intervalArefmV;
    private double intervalKvadrN;
    private double intervalKvadrV;
    private double koefX1;
    private double koefX2;
    private TextView sum1TextView;
    private TextView sum2TextView;
    private TextView sum3TextView;
    private TextView tvSigma;
    private TextView tvKoefMinl;
    private TextView tvIntervalArefm2;
    private TextView tvIntervalArefm3;
    private TextView tvIntervalKvadr2;
    private TextView tvIntervalKvadr3;
    private TextView tvKoefX1;
    private TextView tvKoefX2;

    private double koefT = 2.093;

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

        countSigma();
        countKoefMinlv();
        countIntArefm();
        countIntKvadr();

    }

    private void countIntKvadr() {
    }

    private void countIntArefm() {


    }

    private void countKoefMinlv() {
        koefMinl = Math.round(sigma / avarageOf20 * 10000) / 100;
    }

    private void countSigma() {

        sigma = Math.round(Math.sqrt(sumCol3 / 19.0) * 100.0) / 100.0;

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
        arrayWithNumbers2Topic.add(number2colomn2);
        arrayWithNumbers2Topic.add(number3colomn2);
        arrayWithNumbers2Topic.add(number4colomn2);
        arrayWithNumbers2Topic.add(number5colomn2);
        arrayWithNumbers2Topic.add(number6colomn2);
        arrayWithNumbers2Topic.add(number7colomn2);
        arrayWithNumbers2Topic.add(number8colomn2);
        arrayWithNumbers2Topic.add(number9colomn2);
        arrayWithNumbers2Topic.add(number10colomn2);
        arrayWithNumbers2Topic.add(number11colomn2);
        arrayWithNumbers2Topic.add(number12colomn2);
        arrayWithNumbers2Topic.add(number13colomn2);
        arrayWithNumbers2Topic.add(number14colomn2);
        arrayWithNumbers2Topic.add(number15colomn2);
        arrayWithNumbers2Topic.add(number16colomn2);
        arrayWithNumbers2Topic.add(number17colomn2);
        arrayWithNumbers2Topic.add(number18colomn2);
        arrayWithNumbers2Topic.add(number19colomn2);
        arrayWithNumbers2Topic.add(number20colomn2);

    }

    private void putDataToArrayWithNumbers3() {
        arrayWithNumbers3Topic.add(number1colomn3);
        arrayWithNumbers3Topic.add(number2colomn3);
        arrayWithNumbers3Topic.add(number3colomn3);
        arrayWithNumbers3Topic.add(number4colomn3);
        arrayWithNumbers3Topic.add(number5colomn3);
        arrayWithNumbers3Topic.add(number6colomn3);
        arrayWithNumbers3Topic.add(number7colomn3);
        arrayWithNumbers3Topic.add(number8colomn3);
        arrayWithNumbers3Topic.add(number9colomn3);
        arrayWithNumbers3Topic.add(number10colomn3);
        arrayWithNumbers3Topic.add(number11colomn3);
        arrayWithNumbers3Topic.add(number12colomn3);
        arrayWithNumbers3Topic.add(number13colomn3);
        arrayWithNumbers3Topic.add(number14colomn3);
        arrayWithNumbers3Topic.add(number15colomn3);
        arrayWithNumbers3Topic.add(number16colomn3);
        arrayWithNumbers3Topic.add(number17colomn3);
        arrayWithNumbers3Topic.add(number18colomn3);
        arrayWithNumbers3Topic.add(number19colomn3);
        arrayWithNumbers3Topic.add(number20colomn3);
    }

    private void initView() {
        sum1TextView = view.findViewById(R.id.tvR12C6_topic_1_view_fragment);
        sum1TextView.setText(String.valueOf(sumOf20));

        sum2TextView = view.findViewById(R.id.tvR12C7_topic_1_view_fragment);
        sum2TextView.setText(String.valueOf(sumCol2));

        sum3TextView = view.findViewById(R.id.tvR12C8_topic_1_view_fragment);
        sum3TextView.setText(String.valueOf(sumCol3));

        tvSigma = view.findViewById(R.id.tvSigma_topic_1_view_fragment);
        tvSigma.setText(String.valueOf(sigma) + " см");

        tvKoefMinl = view.findViewById(R.id.tvKoef_minl_topic_1_view_fragment);
        tvKoefMinl.setText(String.valueOf(sigma) + " / " + String.valueOf(avarageOf20) + " * 100% = " + String.valueOf(koefMinl) + " %");

        tvIntervalArefm2 = view.findViewById(R.id.tvSer_arefm_2_topic_1_view_fragment);
        tvIntervalArefm2.setText(String.valueOf(tvIntervalArefm2));

        tvIntervalArefm3 = view.findViewById(R.id.tvSer_arefm_3_topic_1_view_fragment);
        tvIntervalArefm3.setText(String.valueOf(tvIntervalArefm3));

        tvIntervalKvadr2 = view.findViewById(R.id.tvSer_kvdr_2_topic_1_view_fragment);
        tvIntervalKvadr2.setText(String.valueOf(tvIntervalKvadr2));

        tvIntervalKvadr3 = view.findViewById(R.id.tvSer_kvdr_3_topic_1_view_fragment);
        tvIntervalKvadr3.setText(String.valueOf(tvIntervalKvadr3));

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
        tvAvarage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), String.valueOf(sumOf20) + " / 20 = " + String.valueOf(avarageOf20), Toast.LENGTH_SHORT).show();
            }
        });

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
        avarageOf20 = Math.round(sumOf20 / 20.0 * 100.0) / 100.0;
        tvAvarage.setText(String.valueOf(sumOf20) + " / 20 = " + String.valueOf(avarageOf20));
    }

    private void countAllTable() {
        countColomnTwo();
        putDataToArrayWithNumbers2();
        countColomnThree();
        putDataToArrayWithNumbers3();
        countSumInTable();
    }

    private void countSumInTable() {
        countSumOf20();
        countSumOfColomn2();
        countSumOfColomn3();
    }

    private void countSumOfColomn3() {
        sumCol3 = 0d;
        for (int i = 0; i < arrayWithNumbers3Topic.size(); ++i) {
            final double value3 = Double.parseDouble(String.valueOf(arrayWithNumbers3Topic.get(i)));
            sumCol3 = Math.round((sumCol3 + value3) * 100.0) / 100.0;
            //Toast.makeText(getContext(), String.valueOf(sumCol3), Toast.LENGTH_SHORT).show();
        }
    }

    private void countSumOfColomn2() {
        sumCol2 = 0d;
        for (int i = 0; i < arrayWithNumbers2Topic.size(); ++i) {
            final double value2 = Double.parseDouble(String.valueOf(arrayWithNumbers2Topic.get(i)));
            sumCol2 = Math.round((sumCol2 + value2) * 100.0) / 100.0;
        }
    }

    private void countSumOf20() {
        sumOf20 = 0d;
        for (int i = 0; i < arrayWithNumbers1Topic.size(); ++i) {
            final double value = Double.parseDouble(String.valueOf(arrayWithNumbers1Topic.get(i)));
            sumOf20 += Math.round(value * 100.0) / 100.0;
        }
    }

    private void countColomnThree() {

        number1colomn3 = Math.round((number1colomn2 * number1colomn2) * 100.0) / 100.0;
        number2colomn3 = Math.round((number2colomn2 * number2colomn2) * 100.0) / 100.0;
        number3colomn3 = Math.round((number3colomn2 * number3colomn2) * 100.0) / 100.0;
        number4colomn3 = Math.round((number4colomn2 * number4colomn2) * 100.0) / 100.0;
        number5colomn3 = Math.round((number5colomn2 * number5colomn2) * 100.0) / 100.0;
        number6colomn3 = Math.round((number6colomn2 * number6colomn2) * 100.0) / 100.0;
        number7colomn3 = Math.round((number7colomn2 * number7colomn2) * 100.0) / 100.0;
        number8colomn3 = Math.round((number8colomn2 * number8colomn2) * 100.0) / 100.0;
        number9colomn3 = Math.round((number9colomn2 * number9colomn2) * 100.0) / 100.0;
        number10colomn3 = Math.round((number10colomn2 * number10colomn2) * 100.0) / 100.0;
        number11colomn3 = Math.round((number11colomn2 * number11colomn2) * 100.0) / 100.0;
        number12colomn3 = Math.round((number12colomn2 * number12colomn2) * 100.0) / 100.0;
        number13colomn3 = Math.round((number13colomn2 * number13colomn2) * 100.0) / 100.0;
        number14colomn3 = Math.round((number14colomn2 * number14colomn2) * 100.0) / 100.0;
        number15colomn3 = Math.round((number15colomn2 * number15colomn2) * 100.0) / 100.0;
        number16colomn3 = Math.round((number16colomn2 * number16colomn2) * 100.0) / 100.0;
        number17colomn3 = Math.round((number17colomn2 * number17colomn2) * 100.0) / 100.0;
        number18colomn3 = Math.round((number18colomn2 * number18colomn2) * 100.0) / 100.0;
        number19colomn3 = Math.round((number19colomn2 * number19colomn2) * 100.0) / 100.0;
        number20colomn3 = Math.round((number20colomn2 * number20colomn2) * 100.0) / 100.0;

        tvTableC3R1 = view.findViewById(R.id.tvR2C4_topic_1_view_fragment);
        tvTableC3R2 = view.findViewById(R.id.tvR3C4_topic_1_view_fragment);
        tvTableC3R3 = view.findViewById(R.id.tvR4C4_topic_1_view_fragment);
        tvTableC3R4 = view.findViewById(R.id.tvR5C4_topic_1_view_fragment);
        tvTableC3R5 = view.findViewById(R.id.tvR6C4_topic_1_view_fragment);
        tvTableC3R6 = view.findViewById(R.id.tvR7C4_topic_1_view_fragment);
        tvTableC3R7 = view.findViewById(R.id.tvR8C4_topic_1_view_fragment);
        tvTableC3R8 = view.findViewById(R.id.tvR9C4_topic_1_view_fragment);
        tvTableC3R9 = view.findViewById(R.id.tvR10C4_topic_1_view_fragment);
        tvTableC3R10 = view.findViewById(R.id.tvR11C4_topic_1_view_fragment);
        tvTableC3R11 = view.findViewById(R.id.tvR2C8_topic_1_view_fragment);
        tvTableC3R12 = view.findViewById(R.id.tvR3C8_topic_1_view_fragment);
        tvTableC3R13 = view.findViewById(R.id.tvR4C8_topic_1_view_fragment);
        tvTableC3R14 = view.findViewById(R.id.tvR5C8_topic_1_view_fragment);
        tvTableC3R15 = view.findViewById(R.id.tvR6C8_topic_1_view_fragment);
        tvTableC3R16 = view.findViewById(R.id.tvR7C8_topic_1_view_fragment);
        tvTableC3R17 = view.findViewById(R.id.tvR8C8_topic_1_view_fragment);
        tvTableC3R18 = view.findViewById(R.id.tvR9C8_topic_1_view_fragment);
        tvTableC3R19 = view.findViewById(R.id.tvR10C8_topic_1_view_fragment);
        tvTableC3R20 = view.findViewById(R.id.tvR11C8_topic_1_view_fragment);

        tvTableC3R1.setText(String.valueOf(number1colomn3));
        tvTableC3R2.setText(String.valueOf(number2colomn3));
        tvTableC3R3.setText(String.valueOf(number3colomn3));
        tvTableC3R4.setText(String.valueOf(number4colomn3));
        tvTableC3R5.setText(String.valueOf(number5colomn3));
        tvTableC3R6.setText(String.valueOf(number6colomn3));
        tvTableC3R7.setText(String.valueOf(number7colomn3));
        tvTableC3R8.setText(String.valueOf(number8colomn3));
        tvTableC3R9.setText(String.valueOf(number9colomn3));
        tvTableC3R10.setText(String.valueOf(number10colomn3));
        tvTableC3R11.setText(String.valueOf(number11colomn3));
        tvTableC3R12.setText(String.valueOf(number12colomn3));
        tvTableC3R13.setText(String.valueOf(number13colomn3));
        tvTableC3R14.setText(String.valueOf(number14colomn3));
        tvTableC3R15.setText(String.valueOf(number15colomn3));
        tvTableC3R16.setText(String.valueOf(number16colomn3));
        tvTableC3R17.setText(String.valueOf(number17colomn3));
        tvTableC3R18.setText(String.valueOf(number18colomn3));
        tvTableC3R19.setText(String.valueOf(number19colomn3));
        tvTableC3R20.setText(String.valueOf(number20colomn3));
    }

    private void countColomnTwo() {
        //for (int j = 0; j < arrayWithNumbers2Topic.size(); ++j) {
              /*  for (int i = 0; i < arrayWithNumbers1Topic.size(); ++i) {
                arrayWithNumbers2Topic.get(j);
                     double tt=   Double.parseDouble(String.valueOf(arrayWithNumbers1Topic.get(i) - avarageOf20));
            }
        }*/
       /* for (int i = 0; i < arrayWithNumbers2Topic.size(); ++i) {
            final double value = Double.parseDouble(String.valueOf(arrayWithNumbers1Topic.get(i)));
            sumOf20 += Math.round(value * 100) / 100.0;
        }*/
        number1colomn2 = Math.round((number1 - avarageOf20) * 100.0) / 100.0;
        number2colomn2 = Math.round((number2 - avarageOf20) * 100.0) / 100.0;
        number3colomn2 = Math.round((number3 - avarageOf20) * 100.0) / 100.0;
        number4colomn2 = Math.round((number4 - avarageOf20) * 100.0) / 100.0;
        number5colomn2 = Math.round((number5 - avarageOf20) * 100.0) / 100.0;
        number6colomn2 = Math.round((number6 - avarageOf20) * 100.0) / 100.0;
        number7colomn2 = Math.round((number7 - avarageOf20) * 100.0) / 100.0;
        number8colomn2 = Math.round((number8 - avarageOf20) * 100.0) / 100.0;
        number9colomn2 = Math.round((number9 - avarageOf20) * 100.0) / 100.0;
        number10colomn2 = Math.round((number10 - avarageOf20) * 100.0) / 100.0;
        number11colomn2 = Math.round((number11 - avarageOf20) * 100.0) / 100.0;
        number12colomn2 = Math.round((number12 - avarageOf20) * 100.0) / 100.0;
        number13colomn2 = Math.round((number13 - avarageOf20) * 100.0) / 100.0;
        number14colomn2 = Math.round((number14 - avarageOf20) * 100.0) / 100.0;
        number15colomn2 = Math.round((number15 - avarageOf20) * 100.0) / 100.0;
        number16colomn2 = Math.round((number16 - avarageOf20) * 100.0) / 100.0;
        number17colomn2 = Math.round((number17 - avarageOf20) * 100.0) / 100.0;
        number18colomn2 = Math.round((number18 - avarageOf20) * 100.0) / 100.0;
        number19colomn2 = Math.round((number19 - avarageOf20) * 100.0) / 100.0;
        number20colomn2 = Math.round((number20 - avarageOf20) * 100.0) / 100.0;

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
        number2 = 49;
        number3 = 39;
        number4 = 20;
        number5 = 10;
        number6 = 21;
        number7 = 29;
        number8 = 28;
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
