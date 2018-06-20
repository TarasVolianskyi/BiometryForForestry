package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.TopicOneCountFragment;

public class ChosingOfOneFromFiveColumns extends Fragment implements View.OnClickListener {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.chosing_of_one_from_five_columns_fragment, container, false);
        initView();
        return view;
    }

    private void initView() {
        Button btnColumn1 = (Button) view.findViewById(R.id.btn_column_1_chosing_of_one_from_five_columns_fragment);
        Button btnColumn2 = (Button) view.findViewById(R.id.btn_column_2_chosing_of_one_from_five_columns_fragment);
        Button btnColumn3 = (Button) view.findViewById(R.id.btn_column_3_chosing_of_one_from_five_columns_fragment);
        Button btnColumn4 = (Button) view.findViewById(R.id.btn_column_4_chosing_of_one_from_five_columns_fragment);
        Button btnColumn5 = (Button) view.findViewById(R.id.btn_column_5_chosing_of_one_from_five_columns_fragment);

        btnColumn1.setOnClickListener(this);
        btnColumn2.setOnClickListener(this);
        btnColumn3.setOnClickListener(this);
        btnColumn4.setOnClickListener(this);
        btnColumn5.setOnClickListener(this);


        //test
        Button btnColumn5d = (Button) view.findViewById(R.id.btn_22column_5_chosing_of_one_from_five_columns_fragment);
        btnColumn5d.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_22column_5_chosing_of_one_from_five_columns_fragment:
                TopicOneCountFragment topicOneCountFragment = new TopicOneCountFragment();

                FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.flMainActivity, topicOneCountFragment, "timeForReservation");
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();
                break;
            case R.id.btn_column_1_chosing_of_one_from_five_columns_fragment:
                IncomingDataFormForOneColumn incomingDataFormForOneColumn = new IncomingDataFormForOneColumn();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flMainActivity, incomingDataFormForOneColumn, "timeForReservation");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
        }

    }
}
