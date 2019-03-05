package com.example.tarasvolianskyi.biometryforforestry.presentView;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic21;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic3;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter;
import com.example.tarasvolianskyi.biometryforforestry.presentView.POJOTableAdapters.POJOTableAdapter3;

import java.util.ArrayList;

import static com.example.tarasvolianskyi.biometryforforestry.R.layout.topic_3_view_frament;

public class ViewTopic3 extends Fragment {
    private TextView tvX2;
    private TextView tvTest3;
    View view;
    BLTopic3 blTopic3 = new BLTopic3();
    private TableLayout tableLayout3;
    private ArrayList<Integer> arrayListTopic3 = blTopic3.createArrayColomn3();
    private POJOTableAdapter3 pojoTableAdapter3 = new POJOTableAdapter3();
    private ArrayList<POJOTableAdapter3> arrayList;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(topic_3_view_frament, container, false);
        initView();
        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void initView() {
        tableLayout3 = view.findViewById(R.id.tl_topic3_view_fragment);

        tvX2 = (TextView) view.findViewById(R.id.x2);
        //tvX2.setText(Html.fromHtml("x<sup>2</sup>"));
        tvX2.setText(Html.fromHtml("  A<sup>2</sup>+B<sup>2</sup> = C<sup>2</sup>"));
        tvTest3 = (TextView) view.findViewById(R.id.testTopic3);
        tvTest3.setText(blTopic3.getSumColomn4Topic3() + "");

        //blTopic3.showListInTable();
        fillTableLayout();

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void fillTableLayout() {
        fillData();
        for (int i = 0; i < arrayList.size(); i++) {
            pojoTableAdapter3 = arrayList.get(i);
            int width = 150;
            TableRow localRow = new TableRow(getActivity());
            localRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));

            TextView tv1 = new TextView(getActivity());
            TextView tv2 = new TextView(getActivity());
            TextView tv3 = new TextView(getActivity());
            TextView tv4 = new TextView(getActivity());
            TextView tv5 = new TextView(getActivity());
            TextView tv6 = new TextView(getActivity());
            TextView tv7 = new TextView(getActivity());
            TextView tv8 = new TextView(getActivity());
            TextView tv9 = new TextView(getActivity());

            tv1.setWidth(width);
            tv2.setWidth(width);
            tv3.setWidth(width);
            tv4.setWidth(width);
            tv5.setWidth(width);
            tv6.setWidth(width);
            tv7.setWidth(width);
            tv8.setWidth(width);
            tv9.setWidth(width);

/*          tv1.setText(pojoTableAdapter3.getColomn1());
            tv2.setText(pojoTableAdapter3.getColomn2());
            tv3.setText(pojoTableAdapter3.getColomn3());
            tv4.setText(pojoTableAdapter3.getColomn4());
            tv5.setText(pojoTableAdapter3.getColomn5());
            tv6.setText(pojoTableAdapter3.getColomn6());
            tv7.setText(pojoTableAdapter3.getColomn7());
            tv8.setText(pojoTableAdapter3.getColomn8());
            tv9.setText(pojoTableAdapter3.getColomn9());
*/
            tv1.setText("w1");
            tv2.setText("w2");
            tv3.setText(pojoTableAdapter3.getColomn3() + "");
            tv4.setText(pojoTableAdapter3.getColomn4() + "");
            tv5.setText(pojoTableAdapter3.getColomn5() + "");
            tv6.setText(pojoTableAdapter3.getColomn6() + "");
            tv7.setText(pojoTableAdapter3.getColomn7() + "");
            tv8.setText("w8");
            tv9.setText("w9");

            //textView.setLayoutParams(new ViewGroup.LayoutParams(200, 100));
            //textView.setText(arrayList.get(i).toString());

            localRow.addView(tv1);
            localRow.addView(tv2);
            localRow.addView(tv3);
            localRow.addView(tv4);
            localRow.addView(tv5);
            localRow.addView(tv6);
            localRow.addView(tv7);
            localRow.addView(tv8);
            localRow.addView(tv9);

            localRow.setBackgroundColor(Color.GREEN);
            tableLayout3.addView(localRow, i);
        }
    }


    private void fillTableLayout2() {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void fillData() {
        arrayList = new BLTopic3().showListInTable();
    }
}
