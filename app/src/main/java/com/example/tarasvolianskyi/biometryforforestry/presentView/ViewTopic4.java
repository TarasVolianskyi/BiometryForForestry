package com.example.tarasvolianskyi.biometryforforestry.presentView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tarasvolianskyi.biometryforforestry.R;

public class ViewTopic4 extends Fragment {
  private   View view;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_4_view_fragment, container, false);


        initView();

        return view;
    }

    private void initView() {
    }

}
