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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.TopicOneCountFragment;
import com.example.tarasvolianskyi.biometryforforestry.TopicTwoCountFragment;
import com.example.tarasvolianskyi.biometryforforestry.presentView.PVTopic21;

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
        Button btnTopic1 = (Button) view.findViewById(R.id.btn_22column_5_chosing_of_one_from_five_columns_fragment);
        btnTopic1.setOnClickListener(this);
        Button btnTopic21 = (Button) view.findViewById(R.id.btn_222column_5_chosing_of_one_from_five_columns_fragment);
        btnTopic21.setOnClickListener(this);

    }

    public void bundleSetData(int value) {

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

            case R.id.btn_222column_5_chosing_of_one_from_five_columns_fragment:
                PVTopic21 pvTopic21 = new PVTopic21();
                FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.flMainActivity, pvTopic21, "timeForReservation");
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
                break;

            case R.id.btn_column_1_chosing_of_one_from_five_columns_fragment:
                shareInfoOfColomn(1);
                break;
            case R.id.btn_column_2_chosing_of_one_from_five_columns_fragment:
                shareInfoOfColomn(2);
                break;
            case R.id.btn_column_3_chosing_of_one_from_five_columns_fragment:
                shareInfoOfColomn(3);
                break;
            case R.id.btn_column_4_chosing_of_one_from_five_columns_fragment:
                shareInfoOfColomn(4);
                break;
            case R.id.btn_column_5_chosing_of_one_from_five_columns_fragment:
                shareInfoOfColomn(5);
                break;
        }
    }

    public void shareInfoOfColomn(int num) {
        IncomingDataFormForOneColumn incomingDataFormForOneColumn = new IncomingDataFormForOneColumn();
        Bundle bundle = new Bundle();
        bundle.putInt("ttt", num);
        incomingDataFormForOneColumn.setArguments(bundle);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flMainActivity, incomingDataFormForOneColumn, "timeForReservation");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    }


