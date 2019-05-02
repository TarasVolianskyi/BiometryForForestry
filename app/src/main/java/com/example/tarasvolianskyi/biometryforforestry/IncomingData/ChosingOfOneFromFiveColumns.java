package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.TopicOneCountFragment;
import com.example.tarasvolianskyi.biometryforforestry.presentView.ViewTopic21;
import com.example.tarasvolianskyi.biometryforforestry.presentView.ViewTopic3;
import com.example.tarasvolianskyi.biometryforforestry.presentView.ViewTopic4;
import com.example.tarasvolianskyi.biometryforforestry.presentView.ViewTopic5;

public class ChosingOfOneFromFiveColumns extends Fragment implements View.OnClickListener {
    private View view;
    private Button btnTopic3;

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
        Button btnTopic1 = (Button) view.findViewById(R.id.btn_1_choose_from_all_topics_fragment);
        btnTopic1.setOnClickListener(this);
        Button btnTopic21 = (Button) view.findViewById(R.id.btn_21_choose_from_all_topics_fragment);
        btnTopic21.setOnClickListener(this);
        btnTopic3 = (Button) view.findViewById(R.id.btn_3_choose_from_all_topics_fragment);
        btnTopic3.setOnClickListener(this);
        Button btnTopic4 = (Button) view.findViewById(R.id.btn_4_choose_from_all_topics_fragment);
        btnTopic4.setOnClickListener(this);
        Button btnTopic5 = (Button) view.findViewById(R.id.btn_5_choose_from_all_topics_fragment);
        btnTopic5.setOnClickListener(this);

    }

    public void bundleSetData(int value) {
        int r = 7;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_1_choose_from_all_topics_fragment:
                TopicOneCountFragment topicOneCountFragment = new TopicOneCountFragment();
                FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.flMainActivity, topicOneCountFragment, "timeForReservation");
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();
                break;

            case R.id.btn_21_choose_from_all_topics_fragment:
                ViewTopic21 viewTopic21 = new ViewTopic21();
                FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.replace(R.id.flMainActivity, viewTopic21, "timeForReservation");
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
                break;

            case R.id.btn_3_choose_from_all_topics_fragment:
                ViewTopic3 viewTopic3 = new ViewTopic3();

                //Pair[] pairs = new Pair[1];
                //pairs[0] = new Pair<View, String>(btnTopic3, "transformationName1");
                FragmentManager fragmentManager3 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
               // fragmentTransaction3.replace(R.id.flMainActivity, viewTopic3, "timeForReservation3");
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.commit();
                break;

            case R.id.btn_4_choose_from_all_topics_fragment:
                ViewTopic4 viewTopic4 = new ViewTopic4();
                FragmentManager fragmentManager4 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                fragmentTransaction4.replace(R.id.flMainActivity, viewTopic4, "timeForReservation4");
                fragmentTransaction4.addToBackStack(null);
                fragmentTransaction4.commit();
                break;

            case R.id.btn_5_choose_from_all_topics_fragment:
                ViewTopic5 viewTopic5 = new ViewTopic5();
                FragmentManager fragmentManager5 = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction5 = fragmentManager5.beginTransaction();
                fragmentTransaction5.replace(R.id.flMainActivity, viewTopic5, "timeForReservation4");
                fragmentTransaction5.addToBackStack(null);
                fragmentTransaction5.commit();
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


