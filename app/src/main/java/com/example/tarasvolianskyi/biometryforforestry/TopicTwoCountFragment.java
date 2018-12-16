package com.example.tarasvolianskyi.biometryforforestry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.IncomingData.MyArrayData;

import java.util.ArrayList;

public class TopicTwoCountFragment extends Fragment {

    View view;
    private TextView textViewTest;

    private ArrayList <Double> arrayListDiametr;
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
        bussinessLogic();
        initView();
        return view;
    }

    private void initView() {
        tvLgN = view.findViewById(R.id.tvTestLog_topic_2_1_view_fragment);
        tvLgN.setText(String.valueOf(lgN));
    }

    private void bussinessLogic() {
        MyArrayData myArrayData = new MyArrayData();
        arrayListDiametr = myArrayData.getRandomArray();
        numberOfTrees = arrayListDiametr.size();
        lgN = Math.log10(numberOfTrees);

    }

}
