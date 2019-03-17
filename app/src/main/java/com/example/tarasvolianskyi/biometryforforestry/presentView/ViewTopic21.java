package com.example.tarasvolianskyi.biometryforforestry.presentView;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic21;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class ViewTopic21 extends Fragment {

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

    BLTopic21 blTopic21 = new BLTopic21();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.topic_2_1_view_frament, container, false);
        getArray();

        initView();
        fillTableLayout();
        fillTableLayout2();
makeChart21();
        makeChart21second();
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

        tvLgN.setText((Constants.K_FIRST_KOEF + String.valueOf(blTopic21.countLgN()) + " " +
                Constants.NEAR_EQUAL +
                " " + String.valueOf(blTopic21.countExectNumberOfRozrad()) + " = " +
                String.valueOf(blTopic21.countNumberOfRozrad())));

        tvCx.setText(("( " + String.valueOf(blTopic21.countXmax()) + " - "
                + String.valueOf(blTopic21.countXmin()) + " ) / "
                + String.valueOf(blTopic21.countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(blTopic21.countCxWithoutRound())
                + " = " + String.valueOf(blTopic21.countCx()) + " см;"));

        tvCy.setText(("( " + String.valueOf(blTopic21.countYmax()) + " - "
                + String.valueOf(blTopic21.countYmin()) + " ) / "
                + String.valueOf(blTopic21.countExectNumberOfRozrad())
                + Constants.NEAR_EQUAL + String.valueOf(blTopic21.countCyWithoutRound())
                + " = " + String.valueOf(blTopic21.countCy()) + " м;").toString());

        tvX1.setText(("X1 = " + String.valueOf(blTopic21.countX1()) + " см;").toString());
        tvY1.setText(("Y1 = " + String.valueOf(blTopic21.countY1()) + " м;").toString());

        tvNgranX.setText((String.valueOf(blTopic21.countX1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " = " + String.valueOf(blTopic21.countNgranX()) + " см;").toString());

        tvNgranY.setText((String.valueOf(blTopic21.countY1()) + " - 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " = " + String.valueOf(blTopic21.countNgranY()) + " м;").toString());

        tvVgranX.setText((String.valueOf(blTopic21.countX1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCx())
                + " - 0,1 = " + String.valueOf(blTopic21.countVgranX()) + " см;").toString());

        tvVgranY.setText((String.valueOf(blTopic21.countY1()) + " + 1/2 * " + String.valueOf(new BLTopic21().countCy())
                + " - 0,1 = " + String.valueOf(blTopic21.countVgranY()) + " м;").toString());


        blTopic21.showListInTable();


    }


    // @SuppressLint("SetTextI18n")
    private void fillTableLayout() {
        fillData();
        for (int i = 0; i < arrayList.size(); i++) {
            //pojoTableAdapter = arrayList.get(i);

            TableRow localRow = new TableRow(getActivity());
            localRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));

            TextView tv1 = new TextView(getActivity());
            TextView tv2 = new TextView(getActivity());
            TextView tv3 = new TextView(getActivity());
            TextView tv4 = new TextView(getActivity());
            TextView tv5 = new TextView(getActivity());

            tv1.setWidth(300);
            tv2.setWidth(300);
            tv3.setWidth(300);
            tv4.setWidth(300);
            tv5.setWidth(300);

          /*  tv1.setText(pojoTableAdapter.getTextOne() + "");
            tv2.setText(pojoTableAdapter.getNum2() + "");
            tv3.setText(pojoTableAdapter.getTextThree() + "");
            tv4.setText(pojoTableAdapter.getNum4() + "");
            tv5.setText(pojoTableAdapter.getNum5() + "");
            */

            tv1.setText("w1");
            tv2.setText("w2");
            tv3.setText("w3");
            tv4.setText("w4");
            tv5.setText("w5");


            //textView.setLayoutParams(new ViewGroup.LayoutParams(200, 100));
            //textView.setText(arrayList.get(i).toString());

            localRow.addView(tv1);
            localRow.addView(tv2);
            localRow.addView(tv3);
            localRow.addView(tv4);
            localRow.addView(tv5);

            localRow.setBackgroundColor(Color.GREEN);
            tableLayout21.addView(localRow, i);
        }
    }


    private void fillTableLayout2() {
    }


    private void fillData() {
        arrayList = new BLTopic21().showListInTable();
    }

    private void makeChart21(){
        DataPoint[] dataPoint = new DataPoint[]{//LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 15),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 2),
                new DataPoint(5, 3),
                new DataPoint(6, 2),
                new DataPoint(7, 7),
                new DataPoint(8, 2),
                new DataPoint(9, 6)};


        GraphView graph = (GraphView) view.findViewById(R.id.graph_topic_2_1_view_fragment);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(
                dataPoint
        );
        graph.addSeries(series);

        LineGraphSeries<DataPoint> seriesLine = new LineGraphSeries<DataPoint>(
                dataPoint
        );
        series.setColor(Color.BLACK);
        graph.addSeries(seriesLine);
        graph.animate();
        graph.setTitle("Рис. 1. Гістограма");
    }

    private void makeChart21second(){
        DataPoint[] dataPoint2 = new DataPoint[]{//LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 2),
                new DataPoint(2, 3),
                new DataPoint(3, 5),
                new DataPoint(4, 6),
                new DataPoint(5, 14),
                new DataPoint(6, 20),
                new DataPoint(7, 37)};


        GraphView graph = (GraphView) view.findViewById(R.id.graph2_topic_2_1_view_fragment);


        LineGraphSeries<DataPoint> seriesLine2 = new LineGraphSeries<DataPoint>(
                dataPoint2
        );
        graph.addSeries(seriesLine2);
        graph.animate();
        graph.setTitle("Рис. 2. Кумулята");
    }
}
