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

/**
 * Created by tarasvolianskyi on 21.03.18.
 */

public class TopicOneCountFragment extends Fragment implements View.OnClickListener {

    View view;

    private EditText etR1C1;
    private EditText etR2C1;
    private EditText etR3C1;
    private EditText etR4C1;
    private EditText etR5C1;

    private TextView tvR1C2;
    private TextView tvR2C2;
    private TextView tvR3C2;
    private TextView tvR4C2;
    private TextView tvR5C2;
    private TextView tvR6C2;
    private TextView tvR1C3;
    private TextView tvR2C3;
    private TextView tvR3C3;
    private TextView tvR4C3;
    private TextView tvR5C3;
    private TextView tvR6C3;
    private TextView tvR1C4;
    private TextView tvR2C4;
    private TextView tvR3C4;
    private TextView tvR4C4;
    private TextView tvR5C4;
    private TextView tvR6C4;

    private Button btnCountTopicOne;

    double valueOfTvR1C2;
    double valueOfTvR2C2;
    double valueOfTvR3C2;
    double valueOfTvR4C2;
    double valueOfTvR5C2;
    double valueOfTvR6C2;
    double valueOfTvR1C3;
    double valueOfTvR2C3;
    double valueOfTvR3C3;
    double valueOfTvR4C3;
    double valueOfTvR5C3;
    double valueOfTvR6C3;
    double valueOfTvR1C4;
    double valueOfTvR2C4;
    double valueOfTvR3C4;
    double valueOfTvR4C4;
    double valueOfTvR5C4;
    double valueOfTvR6C4;

    double valueOfTotalColomn2;
    double valueOfTotalColomn3;
    double valueOfTotalColomn4;

    double valueAvarage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_one_view_fragment, container, false);
        initView();
        return view;
    }

    private void initView() {
        btnCountTopicOne = (Button) view.findViewById(R.id.btn_count1);
        btnCountTopicOne.setOnClickListener(this);

        etR1C1 = (EditText) view.findViewById(R.id.et_row_1_colomn_1);
        etR2C1 = (EditText) view.findViewById(R.id.et_row_2_colomn_1);
        etR3C1 = (EditText) view.findViewById(R.id.et_row_3_colomn_1);
        etR4C1 = (EditText) view.findViewById(R.id.et_row_4_colomn_1);
        etR5C1 = (EditText) view.findViewById(R.id.et_row_5_colomn_1);

        tvR1C2 = (TextView) view.findViewById(R.id.tv_row_1_colomn_2);
        tvR2C2 = (TextView) view.findViewById(R.id.tv_row_2_colomn_2);
        tvR3C2 = (TextView) view.findViewById(R.id.tv_row_3_colomn_2);
        tvR4C2 = (TextView) view.findViewById(R.id.tv_row_4_colomn_2);
        tvR5C2 = (TextView) view.findViewById(R.id.tv_row_5_colomn_2);
        tvR6C2 = (TextView) view.findViewById(R.id.tv_row_6_colomn_2);

        tvR1C3 = (TextView) view.findViewById(R.id.tv_row_1_colomn_3);
        tvR2C3 = (TextView) view.findViewById(R.id.tv_row_2_colomn_3);
        tvR3C3 = (TextView) view.findViewById(R.id.tv_row_3_colomn_3);
        tvR4C3 = (TextView) view.findViewById(R.id.tv_row_4_colomn_3);
        tvR5C3 = (TextView) view.findViewById(R.id.tv_row_5_colomn_3);
        tvR6C3 = (TextView) view.findViewById(R.id.tv_row_6_colomn_3);

        tvR1C4 = (TextView) view.findViewById(R.id.tv_row_1_colomn_4);
        tvR2C4 = (TextView) view.findViewById(R.id.tv_row_2_colomn_4);
        tvR3C4 = (TextView) view.findViewById(R.id.tv_row_3_colomn_4);
        tvR4C4 = (TextView) view.findViewById(R.id.tv_row_4_colomn_4);
        tvR5C4 = (TextView) view.findViewById(R.id.tv_row_5_colomn_4);
        tvR6C4 = (TextView) view.findViewById(R.id.tv_row_6_colomn_4);

    }

    @Override
    public void onClick(View view) {
        getDataToFirstColomn();
        countTotalColomnTwo();
        countAvarage();
        countNumbersToColomnThree();
        countTotalColomnThree();
        countNumbersToColomnFour();
    }

    private void countNumbersToColomnFour() {
        valueOfTvR1C4 = Math.pow(valueOfTvR1C3, 2);
        valueOfTvR2C4 = Math.pow(valueOfTvR2C3, 2);
        valueOfTvR3C4 = Math.pow(valueOfTvR3C3, 2);
        valueOfTvR4C4 = Math.pow(valueOfTvR4C3, 2);
        valueOfTvR5C4 = Math.pow(valueOfTvR5C3, 2);

        tvR1C4.setText(Double.toString(valueOfTvR1C4));
        tvR2C4.setText(Double.toString(valueOfTvR2C4));
        tvR3C4.setText(Double.toString(valueOfTvR3C4));
        tvR4C4.setText(Double.toString(valueOfTvR4C4));
        tvR5C4.setText(Double.toString(valueOfTvR5C4));
    }

    private void countTotalColomnThree() {
        valueOfTotalColomn3 = valueOfTvR1C3 + valueOfTvR2C3 + valueOfTvR3C3 + valueOfTvR4C3 + valueOfTvR5C3;
        tvR6C3.setText(Double.toString(valueOfTotalColomn3));
    }

    private void countNumbersToColomnThree() {
        valueOfTvR1C3 = valueOfTvR1C2 - valueAvarage;
        valueOfTvR2C3 = valueOfTvR2C2 - valueAvarage;
        valueOfTvR3C3 = valueOfTvR3C2 - valueAvarage;
        valueOfTvR4C3 = valueOfTvR4C2 - valueAvarage;
        valueOfTvR5C3 = valueOfTvR5C2 - valueAvarage;

        tvR1C3.setText(Double.toString(valueOfTvR1C3));
        tvR2C3.setText(Double.toString(valueOfTvR2C3));
        tvR3C3.setText(Double.toString(valueOfTvR3C3));
        tvR4C3.setText(Double.toString(valueOfTvR4C3));
        tvR5C3.setText(Double.toString(valueOfTvR5C3));
    }


    private void getDataToFirstColomn() {
        tvR1C2.setText(etR1C1.getText().toString());
        tvR2C2.setText(etR2C1.getText().toString());
        tvR3C2.setText(etR3C1.getText().toString());
        tvR4C2.setText(etR4C1.getText().toString());
        tvR5C2.setText(etR5C1.getText().toString());

        valueOfTvR1C2 = Double.parseDouble(etR1C1.getText().toString());
        valueOfTvR2C2 = Double.parseDouble(etR2C1.getText().toString());
        valueOfTvR3C2 = Double.parseDouble(etR3C1.getText().toString());
        valueOfTvR4C2 = Double.parseDouble(etR4C1.getText().toString());
        valueOfTvR5C2 = Double.parseDouble(etR5C1.getText().toString());

    }

    @SuppressLint("SetTextI18n")
    private void countTotalColomnTwo() {
        valueOfTotalColomn2 = valueOfTvR1C2 + valueOfTvR2C2 + valueOfTvR3C2 + valueOfTvR4C2 + valueOfTvR5C2;
        tvR6C2.setText(Double.toString(valueOfTotalColomn2));
    }

    private void countAvarage() {
        valueAvarage = valueOfTotalColomn2 / 5;
    }
}
