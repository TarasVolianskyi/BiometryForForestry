package com.example.tarasvolianskyi.biometryforforestry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TopicTwoCountFragment extends Fragment {

    View view;
    private TextView textViewTest;


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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_1_view_fragment, container, false);
        bussinessLogic();
        initView();
        return view;
    }

    private void initView() {
        textViewTest = view.findViewById(R.id.tvTest);
        textViewTest.setText(String.valueOf(lgN));
    }

    private void bussinessLogic() {
        numberOfTrees = 105;
        lgN = Math.log10(numberOfTrees);

    }


}
