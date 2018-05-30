package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tarasvolianskyi.biometryforforestry.R;

public class IncomingDataFormForOneColumn extends Fragment{
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.incoming_data_form_for_one_column_fragment, container, false);
        initView();
        return view;
    }

    private void initView() {


    }
}
