package com.example.tarasvolianskyi.biometryforforestry.presentView;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;
import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic21;

import java.util.ArrayList;

public class PVTopic21 extends Fragment {

    View view;
    private TextView textViewTest;

    private TextView tvNumberOfTrees;
    private TextView tvLgN;
    private TextView tvExectNumbOfRozrad;
    private TextView tvNumbRozradRounded;
    private TextView tvXmax;
    private TextView tvXmin;
    private TextView tvYmax;
    private TextView tvYmin;
    private TextView tvCx;
    private TextView tvCy;
    private TextView tvX1;
    private TextView tvY1;
    private TextView tvNgranX;
    private TextView tvNgranY;
    private TextView tvVgranX;
    private TextView tvVgranY;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_2_1_view_frament, container, false);
        getArray();
        initView();
        return view;
    }

    private void getArray() {
        new BLTopic21().putDataToArrayFromBD();
    }

    private void initView() {
        tvLgN = view.findViewById(R.id.tv2_topic_2_1_view_fragment);
        tvCx = view.findViewById(R.id.tv5_topic_2_1_view_fragment);
        tvCy = view.findViewById(R.id.tv7_topic_2_1_view_fragment);
        tvX1 = view.findViewById(R.id.tv10_topic_2_1_view_fragment);
        tvY1 = view.findViewById(R.id.tv11a_topic_2_1_view_fragment);
        tvNgranX = view.findViewById(R.id.tv13_topic_2_1_view_fragment);
        tvNgranY = view.findViewById(R.id.tv14_topic_2_1_view_fragment);
        tvVgranX = view.findViewById(R.id.tv16_topic_2_1_view_fragment);
        tvVgranY = view.findViewById(R.id.tv17_topic_2_1_view_fragment);


        tvLgN.setText((Constants.K_FIRST_KOEF + String.valueOf(new BLTopic21().countLgN()) + " " +
                Constants.NEAR_EQUAL +
                " " + String.valueOf(new BLTopic21().countExectNumberOfRozrad()) + " = " +
                String.valueOf(new BLTopic21().countNumberOfRozrad())).toString());

        tvCx.setText(("( " + String.valueOf(new BLTopic21().countXmax()) + " - "
                + String.valueOf(new BLTopic21().countXmin()) + " ) / "
                + String.valueOf(new BLTopic21().countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(new BLTopic21().countCxWithoutRound())
                + " = " + String.valueOf(new BLTopic21().countCx()) + " см;").toString());

        tvCy.setText(("( " + String.valueOf(new BLTopic21().countYmax()) + " - "
                + String.valueOf(new BLTopic21().countYmin()) + " ) / "
                + String.valueOf(new BLTopic21().countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(new BLTopic21().countCyWithoutRound())
                + " = " + String.valueOf(new BLTopic21().countCy()) + " м;").toString());

        tvX1.setText(("X1 = " + String.valueOf(new BLTopic21().countX1()) + " см;").toString());
        tvY1.setText(("Y1 = " + String.valueOf(new BLTopic21().countY1()) + " м;").toString());

        tvNgranX.setText((String.valueOf(new BLTopic21().countX1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " = " + String.valueOf(new BLTopic21().countNgranX()) + " см;").toString());

        tvNgranY.setText((String.valueOf(new BLTopic21().countY1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " = " + String.valueOf(new BLTopic21().countNgranY()) + " м;").toString());

        tvVgranX.setText((String.valueOf(new BLTopic21().countX1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " - 0,1 = " + String.valueOf(new BLTopic21().countVgranX()) + " см;").toString());

        tvVgranY.setText((String.valueOf(new BLTopic21().countY1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " - 0,1 = " + String.valueOf(new BLTopic21().countVgranY()) + " м;").toString());


    }


}
