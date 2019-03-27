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

import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.tarasvolianskyi.biometryforforestry.MainActivity;
import com.example.tarasvolianskyi.biometryforforestry.R;
import com.example.tarasvolianskyi.biometryforforestry.businessLogic.BLTopic3;
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


    private TextView tvM1topic3;
    private TextView tvM2topic3;
    private TextView tvM3topic3;
    private TextView tvM4topic3;
    private TextView tvControlLeftTopic3;
    private TextView tvControlRightTopic3;
    private TextView tvMu2topic3;
    private TextView tvMu3topic3;
    private TextView tvMu4topic3;
    private TextView tvMu3controlTopic3;
    private TextView tvMu4controlTopic3;
    private TextView tvChapt3Form1TopTopic3;
    private TextView tvChapt3Form1DownTopic3;
    private TextView tvR3Topic3;
    private TextView tvChapt3Form2TopTopic3;
    private TextView tvChapt3Form2DownTopic3;
    private TextView tvR4Topic3;

    private TextView tvCh34Res1Topic3;
    private TextView tvCh34Res2Topic3;
    private TextView tvCh34Res3Topic3;
    private TextView tvCh34Res4Topic3;
    private TextView tvCh34Res5Topic3;
    private TextView tvCh34Res6Topic3;
    private TextView tvCh34Res7Topic3;
    private TextView tvCh34Res8Topic3;
    private TextView tvCh34Res9Topic3;
    private TextView tvCh34Res10Topic3;
    private TextView tvCh34Res11Topic3;

    private TextView tvCh35Res1Topic3;
    private TextView tvCh35Res2Topic3;
    private TextView tvCh35Res3Topic3;
    private TextView tvCh35Res4Topic3;
    private TextView tvCh35Res5Topic3;
    private ImageView mImageView;


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

        //3.1
        tvM1topic3 = view.findViewById(R.id.tv_chapter_31_M1_view_fragment);
        tvM2topic3 = view.findViewById(R.id.tv_chapter_31_M2_view_fragment);
        tvM3topic3 = view.findViewById(R.id.tv_chapter_31_M3_view_fragment);
        tvM4topic3 = view.findViewById(R.id.tv_chapter_31_M4_view_fragment);
        tvControlLeftTopic3 = view.findViewById(R.id.tv_chapter_31_control_left_view_fragment);
        tvControlRightTopic3 = view.findViewById(R.id.tv_chapter_31_control_right_view_fragment);

        //3.2
        tvMu2topic3 = view.findViewById(R.id.tv_chapter_32_Mu2_view_fragment);
        tvMu3topic3 = view.findViewById(R.id.tv_chapter_32_Mu3_view_fragment);
        tvMu4topic3 = view.findViewById(R.id.tv_chapter_32_Mu4_view_fragment);
        tvMu3controlTopic3 = view.findViewById(R.id.tv_chapter_32_Mu3_control_view_fragment);
        tvMu4controlTopic3 = view.findViewById(R.id.tv_chapter_32_Mu4_control_view_fragment);

        //3.3
        tvChapt3Form1TopTopic3 = view.findViewById(R.id.tv_chapter_33_form1_top_view_fragment);
        tvChapt3Form1DownTopic3 = view.findViewById(R.id.tv_chapter_33_form1_down_view_fragment);
        tvR3Topic3 = view.findViewById(R.id.tv_chapter_33_form1_res_view_fragment);
        tvChapt3Form2TopTopic3 = view.findViewById(R.id.tv_chapter_33_form2_top_view_fragment);
        tvChapt3Form2DownTopic3 = view.findViewById(R.id.tv_chapter_33_form2_down_view_fragment);
        tvR4Topic3 = view.findViewById(R.id.tv_chapter_33_form2_res_view_fragment);

        //3.4
        tvCh34Res1Topic3 = view.findViewById(R.id.tv_chapter_34_res1_view_fragment);
        tvCh34Res2Topic3 = view.findViewById(R.id.tv_chapter_34_res2_view_fragment);
        tvCh34Res3Topic3 = view.findViewById(R.id.tv_chapter_34_res3_view_fragment);
        tvCh34Res4Topic3 = view.findViewById(R.id.tv_chapter_34_res4_view_fragment);
        tvCh34Res5Topic3 = view.findViewById(R.id.tv_chapter_34_res5_view_fragment);
        tvCh34Res6Topic3 = view.findViewById(R.id.tv_chapter_34_res6_view_fragment);
        tvCh34Res7Topic3 = view.findViewById(R.id.tv_chapter_34_res7_view_fragment);
        tvCh34Res8Topic3 = view.findViewById(R.id.tv_chapter_34_res8_view_fragment);
        tvCh34Res9Topic3 = view.findViewById(R.id.tv_chapter_34_res9_view_fragment);
        tvCh34Res10Topic3 = view.findViewById(R.id.tv_chapter_34_res10_view_fragment);
        tvCh34Res11Topic3 = view.findViewById(R.id.tv_chapter_34_res11_view_fragment);

        //3.5
        tvCh35Res1Topic3 = view.findViewById(R.id.tv_chapter_35_res1_view_fragment);
        tvCh35Res2Topic3 = view.findViewById(R.id.tv_chapter_35_res2_view_fragment);
        tvCh35Res3Topic3 = view.findViewById(R.id.tv_chapter_35_res3_view_fragment);
        tvCh35Res4Topic3 = view.findViewById(R.id.tv_chapter_35_res4_view_fragment);
        tvCh35Res5Topic3 = view.findViewById(R.id.tv_chapter_35_res5_view_fragment);
//initImagesView();
        setTexts();
        setStyle();
        fillTableLayout();
    }

    private void setStyle() {
    }

    private void initImagesView() {

        //  mImageView = (ImageView) view.findViewById(R.id.imageViewId);
        //   mImageView.setImageResource(R.drawable.math312);
    }

    private void setTexts() {
        //3.1
        tvM1topic3.setText(blTopic3.getSumColomn4Topic3() + " / " + blTopic3.getNumberOfTrees() + " = " + blTopic3.getM1());
        tvM2topic3.setText(blTopic3.getSumColomn5Topic3() + " / " + blTopic3.getNumberOfTrees() + " = " + blTopic3.getM2());
        tvM3topic3.setText(blTopic3.getSumColomn6Topic3() + " / " + blTopic3.getNumberOfTrees() + " = " + blTopic3.getM3());
        tvM4topic3.setText(blTopic3.getSumColomn7Topic3() + " / " + blTopic3.getNumberOfTrees() + " = " + blTopic3.getM4());
        tvControlLeftTopic3.setText("1 + 4 * " + blTopic3.getM1() + " + 6 * " + blTopic3.getM2() + " + 4 * "
                + blTopic3.getM3() + " + " + blTopic3.getM4() + " = " + blTopic3.getControlLeft() + " ;");
        tvControlRightTopic3.setText("а з правої - " + blTopic3.getSumColomn9Topic3() + " / " +
                blTopic3.getNumberOfTrees() + " = " + blTopic3.getControlRight() + " .");

        //3.2
        tvMu2topic3.setText(Html.fromHtml(blTopic3.getM2() + " - ( " +
                blTopic3.getM1() + " )<sup>2</sup> = " + blTopic3.getMu2() + " ;"));
        tvMu3topic3.setText(Html.fromHtml(blTopic3.getM3() + " - 3 * " +
                blTopic3.getM1() + " * " + blTopic3.getM2() + " + 2 * ( " + blTopic3.getM1() +
                " )<sup>3</sup> = " + blTopic3.getMu3()));
        tvMu4topic3.setText(Html.fromHtml(blTopic3.getM4() + " - 4 * " +
                blTopic3.getM1() + " * " + blTopic3.getM3() + " + 6 * ( " + blTopic3.getM1() +
                " )<sup>2</sup>  * " + blTopic3.getM2() + " - 3 * ( " + blTopic3.getM1() +
                " )<sup>4</sup> = " + blTopic3.getMu4()));
        tvMu3controlTopic3.setText(Html.fromHtml(blTopic3.getM3() + " - 3 * " +
                blTopic3.getM1() + " * " + blTopic3.getMu2() + " - ( " + blTopic3.getM1() +
                " )<sup>3</sup> = " + blTopic3.getMu3Control() + " ;"));
        tvMu4controlTopic3.setText(Html.fromHtml(blTopic3.getM4() + " - 4 * " +
                blTopic3.getM1() + " * " + blTopic3.getMu3() + " - 6 * ( " + blTopic3.getM1() +
                " )<sup>2</sup> * " + blTopic3.getMu2() + " - ( " + blTopic3.getM1() +
                " )<sup>4</sup> = " + blTopic3.getMu4Control() + " ."));

        //3.3
        tvChapt3Form1TopTopic3.setText(blTopic3.getMu3() + "");
        tvChapt3Form1DownTopic3.setText(Html.fromHtml("( " + blTopic3.getMu2() + " )<sup>3/2</sup> "));
        tvR3Topic3.setText(blTopic3.getR3() + " ;");
        tvChapt3Form2TopTopic3.setText(blTopic3.getMu4() + "");
        tvChapt3Form2DownTopic3.setText(Html.fromHtml("( " + blTopic3.getMu2() + " )<sup>2</sup> "));
        tvR4Topic3.setText(blTopic3.getR4() + " √ ." + blTopic3.getChapter34X0());

        //3.4
        tvCh34Res1Topic3.setText(blTopic3.getChapter34Res1() + "");
        tvCh34Res2Topic3.setText(blTopic3.getChapter34Res2() + "");
        tvCh34Res3Topic3.setText(blTopic3.getChapter34Res3() + "");
        tvCh34Res4Topic3.setText(blTopic3.getChapter34Res4() + "");
        tvCh34Res5Topic3.setText(blTopic3.getChapter34Res5() + "");
        tvCh34Res6Topic3.setText(blTopic3.getChapter34Res6() + "");
        tvCh34Res7Topic3.setText(blTopic3.getChapter34Res7() + "");
        tvCh34Res8Topic3.setText(blTopic3.getChapter34Res8() + "");
        tvCh34Res9Topic3.setText(blTopic3.getChapter34Res9() + "");
        tvCh34Res10Topic3.setText(blTopic3.getChapter34Res10() + "");
        tvCh34Res11Topic3.setText(blTopic3.getChapter34Res11() + "");

        //3.5
        tvCh35Res1Topic3.setText(blTopic3.getChapter34Res1() + " ± " +
                blTopic3.getKvantul() + " * " + blTopic3.getChapter34Res6() + " = " +
                blTopic3.getLimitRes1Min() + " ÷ " + blTopic3.getLimitRes1Max() + " см;");

        tvCh35Res2Topic3.setText(blTopic3.getChapter34Res2() + " ± " +
                blTopic3.getKvantul() + " * " + blTopic3.getChapter34Res7() + " = " +
                blTopic3.getLimitRes2Min() + " ÷ " + blTopic3.getLimitRes2Max() + " см;");

        tvCh35Res3Topic3.setText(blTopic3.getChapter34Res3() + " ± " +
                blTopic3.getKvantul() + " * " + blTopic3.getChapter34Res8() + " = " +
                blTopic3.getLimitRes3Min() + " ÷ " + blTopic3.getLimitRes3Max() + " %;");

        tvCh35Res4Topic3.setText(blTopic3.getChapter34Res4() + " ± " +
                blTopic3.getKvantul() + " * " + blTopic3.getChapter34Res9() + " = " +
                blTopic3.getLimitRes4Min() + " ÷ " + blTopic3.getLimitRes4Max() + " ;");

        tvCh35Res5Topic3.setText(blTopic3.getChapter34Res5() + " ± " +
                blTopic3.getKvantul() + " * " + blTopic3.getChapter34Res10() + " = " +
                blTopic3.getLimitRes5Min() + " ÷ " + blTopic3.getLimitRes5Max() + " .");


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
            tv1.setText(pojoTableAdapter3.getColomn1() + "");
            tv2.setText(pojoTableAdapter3.getColomn2() + "");
            tv3.setText(pojoTableAdapter3.getColomn3() + "");
            tv4.setText(pojoTableAdapter3.getColomn4() + "");
            tv5.setText(pojoTableAdapter3.getColomn5() + "");
            tv6.setText(pojoTableAdapter3.getColomn6() + "");
            tv7.setText(pojoTableAdapter3.getColomn7() + "");
            tv8.setText(pojoTableAdapter3.getColomn8() + "");
            tv9.setText(pojoTableAdapter3.getColomn9() + "");

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
