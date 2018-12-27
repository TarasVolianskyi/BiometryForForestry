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

        initView();
        return view;
    }

    private void initView() {
        tvLgN = view.findViewById(R.id.tv_lgn_topic_2_1_view_fragment);
        tvCx = view.findViewById(R.id.tvCx_topic_2_1_view_fragment);

        tvLgN.setText(Constants.K_FIRST_KOEF + String.valueOf(new BLTopic21().countLgN()));
        tvCx.setText("" +"tttt"/* String.valueOf(new BLTopic21().countCx())*/);
    }


}
