package com.example.tarasvolianskyi.biometryforforestry.presentView;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
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
    private TableLayout tableLayout21;


    private ArrayList<POJOTableAdapter> arrayList;
    private POJOTableAdapter pojoTableAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_2_1_view_frament, container, false);
        getArray();
        initView();
        fillTableLayout();

        return view;
    }

    private void getArray() {
        new BLTopic21().putDataToArrayFromBD();
    }

    private void initView() {
        tvLgN = view.findViewById(R.id.tv2_topic_2_1_view_fragment);
        tvCx = view.findViewById(R.id.tv5_topic_2_1_view_fragment);
        tvCy = view.findViewById(R.id.tv7_topic_2_1_view_fragment);
        tvX1 = view.findViewById(R.id.tv10_topic_2_1_view_fragment);
        tvY1 = view.findViewById(R.id.tv11a_topic_2_1_view_fragment);
        tvNgranX = view.findViewById(R.id.tv13_topic_2_1_view_fragment);
        tvNgranY = view.findViewById(R.id.tv14_topic_2_1_view_fragment);
        tvVgranX = view.findViewById(R.id.tv16_topic_2_1_view_fragment);
        tvVgranY = view.findViewById(R.id.tv17_topic_2_1_view_fragment);
        tableLayout21 = view.findViewById(R.id.tl_topic21_view_fragment);

        tvLgN.setText((Constants.K_FIRST_KOEF + String.valueOf(new BLTopic21().countLgN()) + " " +
                Constants.NEAR_EQUAL +
                " " + String.valueOf(new BLTopic21().countExectNumberOfRozrad()) + " = " +
                String.valueOf(new BLTopic21().countNumberOfRozrad())).toString());

        tvCx.setText(("( " + String.valueOf(new BLTopic21().countXmax()) + " - "
                + String.valueOf(new BLTopic21().countXmin()) + " ) / "
                + String.valueOf(new BLTopic21().countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(new BLTopic21().countCxWithoutRound())
                + " = " + String.valueOf(new BLTopic21().countCx()) + " см;").toString());

        tvCy.setText(("( " + String.valueOf(new BLTopic21().countYmax()) + " - "
                + String.valueOf(new BLTopic21().countYmin()) + " ) / "
                + String.valueOf(new BLTopic21().countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(new BLTopic21().countCyWithoutRound())
                + " = " + String.valueOf(new BLTopic21().countCy()) + " м;").toString());

        tvX1.setText(("X1 = " + String.valueOf(new BLTopic21().countX1()) + " см;").toString());
        tvY1.setText(("Y1 = " + String.valueOf(new BLTopic21().countY1()) + " м;").toString());

        tvNgranX.setText((String.valueOf(new BLTopic21().countX1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " = " + String.valueOf(new BLTopic21().countNgranX()) + " см;").toString());

        tvNgranY.setText((String.valueOf(new BLTopic21().countY1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " = " + String.valueOf(new BLTopic21().countNgranY()) + " м;").toString());

        tvVgranX.setText((String.valueOf(new BLTopic21().countX1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " - 0,1 = " + String.valueOf(new BLTopic21().countVgranX()) + " см;").toString());

        tvVgranY.setText((String.valueOf(new BLTopic21().countY1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " - 0,1 = " + String.valueOf(new BLTopic21().countVgranY()) + " м;").toString());


    }


   // @SuppressLint("SetTextI18n")
    private void fillTableLayout() {
        fillData();
        for (int i = 0; i < 5; i++) {
            TableRow localRow = new TableRow(getContext());
            localRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
            //fillLocalRow(localRow, arrayList.get(i));
            //TextView textView = new TextView(getActivity());
            TextView tv1 = new TextView(getContext());
         /* TextView tv2 = new TextView(getActivity());
            TextView tv3 = new TextView(getActivity());
            TextView tv4 = new TextView(getActivity());
            TextView tv5 = new TextView(getActivity());*/
            tv1.setText(pojoTableAdapter.getTextOne());
         /* tv2.setText("r2rr");
            tv3.setText("rr3r");
            tv4.setText("rrr4");
            tv5.setText("rrr5");*/

            //textView.setLayoutParams(new ViewGroup.LayoutParams(200, 100));
            //textView.setText(arrayList.get(i).toString());
            localRow.addView(tv1);
       /*   localRow.addView(tv2);
            localRow.addView(tv3);
            localRow.addView(tv4);
            localRow.addView(tv5);
            */
            //Log.d("log apartm", arrayList.get(i).toString());
            //Log.d("log apartm", "Table chield " + tableLayout.getChildCount());
            localRow.setBackgroundColor(Color.GREEN);
           tableLayout21.addView(localRow, i);
        }
    }


    private void fillData() {
        arrayList = new ArrayList<>();
        arrayList.add(new POJOTableAdapter("ttt", 23, "ttt", 230000, 333));
        arrayList.add(new POJOTableAdapter("rr", 33, "www", 250000, 44));
        arrayList.add(new POJOTableAdapter("yyh", 43, "xxx", 210000, 555));
        arrayList.add(new POJOTableAdapter("vvv", 53, "ggg", 560000, 232));
        arrayList.add(new POJOTableAdapter("ywyh", 443, "xxfdx", 213000, 505));

        pojoTableAdapter = new POJOTableAdapter();
            pojoTableAdapter.setTextOne("e111ee");
            //pojoTableAdapter.setTextOne("ee2e");
           // pojoTableAdapter.setTextOne("eee");
            pojoTableAdapter.setTextThree("eeqqs");
            pojoTableAdapter.setTextThree("eeqqs");




    }
}
