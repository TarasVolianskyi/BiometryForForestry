package com.example.tarasvolianskyi.biometryforforestry.presentView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic21;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic3;

import java.util.ArrayList;

import static com.example.tarasvolianskyi.biometryforforestry.R.layout.topic_3_view_frament;

public class ViewTopic3 extends Fragment {
    private TextView tvX2;
    private TextView tvTest3;
    View view;
    BLTopic3 blTopic3 = new BLTopic3();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(topic_3_view_frament, container, false);
        initView();
        return view;
    }

    private void initView() {
        tvX2 = (TextView) view.findViewById(R.id.x2);
        //tvX2.setText(Html.fromHtml("x<sup>2</sup>"));
        tvX2.setText(Html.fromHtml("  A<sup>2</sup>+B<sup>2</sup> = C<sup>2</sup>"));
        tvTest3 = (TextView) view.findViewById(R.id.testTopic3);
        tvTest3.setText(blTopic3.findPlaceWithZeroForColomn3Table3()+"");

        blTopic3.showListInTable();

    }

}
