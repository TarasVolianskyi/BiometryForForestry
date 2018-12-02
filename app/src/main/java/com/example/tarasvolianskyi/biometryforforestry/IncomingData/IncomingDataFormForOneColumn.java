package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.tarasvolianskyi.biometryforforestry.FireBaseAdapter.CellPojo;
import com.example.tarasvolianskyi.biometryforforestry.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class IncomingDataFormForOneColumn extends Fragment implements View.OnClickListener {

    public static final String USER_NAME = "userName";
    public static final String USER_ID = "userId";

    public static final String DIAMETR = "Diameter";
    public static final String HEIGHT = "Height";
    public static final String VOLUME = "Volume";

    private Button btnSentDataToFB;
    private View view;
    private EditText editTextTask;

    private ArrayList <Double> arrayListColumnOne;
    private ArrayList <Double> arrayListColumnTwo;
    private ArrayList <Double> arrayListColumnThree;

    private ArrayList <Double> arrayListOfDataDiameter;
    private ArrayList <Double> arrayListOfDataHeight;
    private ArrayList <Double> arrayListOfDataValue;
    private DatabaseReference databaseReferenceUsers;
    private TableLayout tableLayout;


    private String userId;
    int myBundleFromPreviousPage;
    // Bundle bundle;


    private EditText etR1C1;
    private EditText etR2C1;
    private EditText etR3C1;
    private EditText etR4C1;
    private EditText etR5C1;
    private EditText etR6C1;
    private EditText etR7C1;
    private EditText etR8C1;
    private EditText etR9C1;
    private EditText etR10C1;
    private EditText etR11C1;
    private EditText etR12C1;
    private EditText etR13C1;
    private EditText etR14C1;
    private EditText etR15C1;
    private EditText etR16C1;
    private EditText etR17C1;
    private EditText etR18C1;
    private EditText etR19C1;
    private EditText etR20C1;
    private EditText etR21C1;
    private EditText etR22C1;
    private EditText etR23C1;
    private EditText etR24C1;

    private EditText etR1C2;
    private EditText etR2C2;
    private EditText etR3C2;
    private EditText etR4C2;
    private EditText etR5C2;
    private EditText etR6C2;
    private EditText etR7C2;
    private EditText etR8C2;
    private EditText etR9C2;
    private EditText etR10C2;
    private EditText etR11C2;
    private EditText etR12C2;
    private EditText etR13C2;
    private EditText etR14C2;
    private EditText etR15C2;
    private EditText etR16C2;
    private EditText etR17C2;
    private EditText etR18C2;
    private EditText etR19C2;
    private EditText etR20C2;
    private EditText etR21C2;
    private EditText etR22C2;
    private EditText etR23C2;
    private EditText etR24C2;

    private EditText etR1C3;
    private EditText etR2C3;
    private EditText etR3C3;
    private EditText etR4C3;
    private EditText etR5C3;
    private EditText etR6C3;
    private EditText etR7C3;
    private EditText etR8C3;
    private EditText etR9C3;
    private EditText etR10C3;
    private EditText etR11C3;
    private EditText etR12C3;
    private EditText etR13C3;
    private EditText etR14C3;
    private EditText etR15C3;
    private EditText etR16C3;
    private EditText etR17C3;
    private EditText etR18C3;
    private EditText etR19C3;
    private EditText etR20C3;
    private EditText etR21C3;
    private EditText etR22C3;
    private EditText etR23C3;
    private EditText etR24C3;

    private Double aDoubleR1C1;
    private Double aDoubleR2C1;
    private Double aDoubleR3C1;
    private Double aDoubleR4C1;
    private Double aDoubleR5C1;
    private Double aDoubleR6C1;
    private Double aDoubleR7C1;
    private Double aDoubleR8C1;
    private Double aDoubleR9C1;
    private Double aDoubleR10C1;
    private Double aDoubleR11C1;
    private Double aDoubleR12C1;
    private Double aDoubleR13C1;
    private Double aDoubleR14C1;
    private Double aDoubleR15C1;
    private Double aDoubleR16C1;
    private Double aDoubleR17C1;
    private Double aDoubleR18C1;
    private Double aDoubleR19C1;
    private Double aDoubleR20C1;
    private Double aDoubleR21C1;
    private Double aDoubleR22C1;
    private Double aDoubleR23C1;
    private Double aDoubleR24C1;

    private Double aDoubleR1C2;
    private Double aDoubleR2C2;
    private Double aDoubleR3C2;
    private Double aDoubleR4C2;
    private Double aDoubleR5C2;
    private Double aDoubleR6C2;
    private Double aDoubleR7C2;
    private Double aDoubleR8C2;
    private Double aDoubleR9C2;
    private Double aDoubleR10C2;
    private Double aDoubleR11C2;
    private Double aDoubleR12C2;
    private Double aDoubleR13C2;
    private Double aDoubleR14C2;
    private Double aDoubleR15C2;
    private Double aDoubleR16C2;
    private Double aDoubleR17C2;
    private Double aDoubleR18C2;
    private Double aDoubleR19C2;
    private Double aDoubleR20C2;
    private Double aDoubleR21C2;
    private Double aDoubleR22C2;
    private Double aDoubleR23C2;
    private Double aDoubleR24C2;

    private Double aDoubleR1C3;
    private Double aDoubleR2C3;
    private Double aDoubleR3C3;
    private Double aDoubleR4C3;
    private Double aDoubleR5C3;
    private Double aDoubleR6C3;
    private Double aDoubleR7C3;
    private Double aDoubleR8C3;
    private Double aDoubleR9C3;
    private Double aDoubleR10C3;
    private Double aDoubleR11C3;
    private Double aDoubleR12C3;
    private Double aDoubleR13C3;
    private Double aDoubleR14C3;
    private Double aDoubleR15C3;
    private Double aDoubleR16C3;
    private Double aDoubleR17C3;
    private Double aDoubleR18C3;
    private Double aDoubleR19C3;
    private Double aDoubleR20C3;
    private Double aDoubleR21C3;
    private Double aDoubleR22C3;
    private Double aDoubleR23C3;
    private Double aDoubleR24C3;

    int value;
    Bundle bundle;
    int myInt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.incoming_data_form_for_one_column_fragment, container, false);
        arrayListColumnOne = new ArrayList <>();

        Bundle bundle = getArguments();
        if (bundle != null) {

            myInt = bundle.getInt("ttt", 77);
        }
        // initView();
        tableLayout = view.findViewById(R.id.tlDataIncomingFragment);
        btnSentDataToFB = view.findViewById(R.id.btn_sent_data_to_fb_fragment);
        btnSentDataToFB.setOnClickListener(this);

        return view;
    }

    private void initView() {
        databaseReferenceUsers = FirebaseDatabase.getInstance().getReference("biometry");
        //  btnSentDataToFB = view.findViewById(R.id.btn_sent_data_to_fb_fragment);
        userId = databaseReferenceUsers.push().getKey();
        // tableLayout=view.findViewById(R.id.tlDataIncomingFragment);

        etR1C1 = view.findViewById(R.id.et_r1c1);
        etR2C1 = view.findViewById(R.id.et_r2c1);
        etR3C1 = view.findViewById(R.id.et_r3c1);
        etR4C1 = view.findViewById(R.id.et_r4c1);
        etR5C1 = view.findViewById(R.id.et_r5c1);
        etR6C1 = view.findViewById(R.id.et_r6c1);
        etR7C1 = view.findViewById(R.id.et_r7c1);
        etR8C1 = view.findViewById(R.id.et_r8c1);
        etR9C1 = view.findViewById(R.id.et_r9c1);
        etR10C1 = view.findViewById(R.id.et_r10c1);
        etR11C1 = view.findViewById(R.id.et_r11c1);
        etR12C1 = view.findViewById(R.id.et_r12c1);
        etR13C1 = view.findViewById(R.id.et_r13c1);
        etR14C1 = view.findViewById(R.id.et_r14c1);
        etR15C1 = view.findViewById(R.id.et_r15c1);
        etR16C1 = view.findViewById(R.id.et_r16c1);
        etR17C1 = view.findViewById(R.id.et_r17c1);
        etR18C1 = view.findViewById(R.id.et_r18c1);
        etR19C1 = view.findViewById(R.id.et_r19c1);
        etR20C1 = view.findViewById(R.id.et_r20c1);
        etR21C1 = view.findViewById(R.id.et_r21c1);
        etR22C1 = view.findViewById(R.id.et_r22c1);
        etR23C1 = view.findViewById(R.id.et_r23c1);
        etR24C1 = view.findViewById(R.id.et_r24c1);

        etR1C2 = view.findViewById(R.id.et_r1c2);
        etR2C2 = view.findViewById(R.id.et_r2c2);
        etR3C2 = view.findViewById(R.id.et_r3c2);
        etR4C2 = view.findViewById(R.id.et_r4c2);
        etR5C2 = view.findViewById(R.id.et_r5c2);
        etR6C2 = view.findViewById(R.id.et_r6c2);
        etR7C2 = view.findViewById(R.id.et_r7c2);
        etR8C2 = view.findViewById(R.id.et_r8c2);
        etR9C2 = view.findViewById(R.id.et_r9c2);
        etR10C2 = view.findViewById(R.id.et_r10c2);
        etR11C2 = view.findViewById(R.id.et_r11c2);
        etR12C2 = view.findViewById(R.id.et_r12c2);
        etR13C2 = view.findViewById(R.id.et_r13c2);
        etR14C2 = view.findViewById(R.id.et_r14c2);
        etR15C2 = view.findViewById(R.id.et_r15c2);
        etR16C2 = view.findViewById(R.id.et_r16c2);
        etR17C2 = view.findViewById(R.id.et_r17c2);
        etR18C2 = view.findViewById(R.id.et_r18c2);
        etR19C2 = view.findViewById(R.id.et_r19c2);
        etR20C2 = view.findViewById(R.id.et_r20c2);
        etR21C2 = view.findViewById(R.id.et_r21c2);
        etR22C2 = view.findViewById(R.id.et_r22c2);
        etR23C2 = view.findViewById(R.id.et_r23c2);
        etR24C2 = view.findViewById(R.id.et_r24c2);

        etR1C3 = view.findViewById(R.id.et_r1c3);
        etR2C3 = view.findViewById(R.id.et_r2c3);
        etR3C3 = view.findViewById(R.id.et_r3c3);
        etR4C3 = view.findViewById(R.id.et_r4c3);
        etR5C3 = view.findViewById(R.id.et_r5c3);
        etR6C3 = view.findViewById(R.id.et_r6c3);
        etR7C3 = view.findViewById(R.id.et_r7c3);
        etR8C3 = view.findViewById(R.id.et_r8c3);
        etR9C3 = view.findViewById(R.id.et_r9c3);
        etR10C3 = view.findViewById(R.id.et_r10c3);
        etR11C3 = view.findViewById(R.id.et_r11c3);
        etR12C3 = view.findViewById(R.id.et_r12c3);
        etR13C3 = view.findViewById(R.id.et_r13c3);
        etR14C3 = view.findViewById(R.id.et_r14c3);
        etR15C3 = view.findViewById(R.id.et_r15c3);
        etR16C3 = view.findViewById(R.id.et_r16c3);
        etR17C3 = view.findViewById(R.id.et_r17c3);
        etR18C3 = view.findViewById(R.id.et_r18c3);
        etR19C3 = view.findViewById(R.id.et_r19c3);
        etR20C3 = view.findViewById(R.id.et_r20c3);
        etR21C3 = view.findViewById(R.id.et_r21c3);
        etR22C3 = view.findViewById(R.id.et_r22c3);
        etR23C3 = view.findViewById(R.id.et_r23c3);
        etR24C3 = view.findViewById(R.id.et_r24c3);

    }



    private ArrayList <Double> addDataToArray(int type) {
        ArrayList <Double> arrayListResult = new ArrayList <>();
        for (int i = 0; i < tableLayout.getChildCount(); i++) {
            EditText etCurrent = (EditText) ((TableRow) tableLayout.getChildAt(i)).getChildAt(type);
            if (etCurrent.getText() != null && !etCurrent.getText().toString().equals("")) {
                arrayListResult.add(Double.valueOf(etCurrent.getText().toString()));
            }
        }
        Log.d("colomnOne", "Values: " + arrayListColumnOne);
        return arrayListResult;

    }

   /* public int bundleGetData() {

        bundle = this.getArguments();
        if (bundle != null) {
            myBundleFromPreviousPage = bundle.getInt("numberForCellIdColumn", 7);
        }
        return myBundleFromPreviousPage;
    }*/

    private void saveDataFromTableToFB(String cellT, ArrayList <Double> arrayListDouble) {


        String cellType = cellT;

        int numForId1of5Column = myInt;
        int numR;

        for (int i = 0; i < arrayListDouble.size(); i++) {
            numR = i + 1;
            String cellId;
            if (numR >= 10) {
                cellId = numForId1of5Column + "R" + numR + "C1";
            } else {
                cellId = numForId1of5Column + "R" + 0 + numR + "C1";
            }
            //String name = editTextTask.getText().toString().trim();
            double cellValue = arrayListDouble.get(i);
            CellPojo cellPojo = new CellPojo(userId, cellType, cellId, cellValue);
            databaseReferenceUsers.child(userId).child(cellType).child(cellId).setValue(cellPojo);
            Toast.makeText(getContext(), i + "GOOD " + numForId1of5Column, Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    public void onClick(View v) {
        //Toast.makeText(getContext(), "Click button add task", Toast.LENGTH_SHORT).show();
        arrayListColumnOne = addDataToArray(0);
        arrayListColumnTwo = addDataToArray(1);
        arrayListColumnThree = addDataToArray(2);
        // addDataToArrayHeight();
        //addDataToArrayValue();


        //  saveDataFromTableToFB(DIAMETR, arrayListOfDataDiameter);
        //saveDataFromTableToFB(HEIGHT, arrayListOfDataHeight);
        //saveDataFromTableToFB(VOLUME, arrayListOfDataValue);
    }
}