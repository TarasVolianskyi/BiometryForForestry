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

import java.util.ArrayList;

import static com.example.tarasvolianskyi.biometryforforestry.R.layout.topic_3_view_frament;

public class ViewTopic3 extends Fragment {
    TextView tvX2;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(topic_3_view_frament, container, false);
        initView();
        return view;
    }

    private void initView() {
        tvX2 = (TextView) view.findViewById(R.id.x2);
        tvX2.setText(Html.fromHtml("x<sup>2</sup>"));
    }


}
