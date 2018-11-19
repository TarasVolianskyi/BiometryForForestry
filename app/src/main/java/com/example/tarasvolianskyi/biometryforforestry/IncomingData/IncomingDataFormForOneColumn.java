package com.example.tarasvolianskyi.biometryforforestry.IncomingData;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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
    private ArrayList<Double> arrayListOfDataDiameter;
    private ArrayList<Double> arrayListOfDataHeight;
    private ArrayList<Double> arrayListOfDataValue;
    private DatabaseReference databaseReferenceUsers;

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


        Bundle bundle = getArguments();
        if (bundle != null) {

            myInt = bundle.getInt("ttt", 77);
        }
        initView();
        return view;
    }

    private void initView() {
        databaseReferenceUsers = FirebaseDatabase.getInstance().getReference("biometry");
        btnSentDataToFB = view.findViewById(R.id.btn_sent_data_to_fb_fragment);
        btnSentDataToFB.setOnClickListener(this);
        userId = databaseReferenceUsers.push().getKey();

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

    private void addDataToArrayValue() {
        aDoubleR1C3 = Double.valueOf(etR1C3.getText().toString());
        aDoubleR2C3 = Double.valueOf(etR2C3.getText().toString());
        aDoubleR3C3 = Double.valueOf(etR3C3.getText().toString());
        aDoubleR4C3 = Double.valueOf(etR4C3.getText().toString());
        aDoubleR5C3 = Double.valueOf(etR5C3.getText().toString());
        aDoubleR6C3 = Double.valueOf(etR6C3.getText().toString());
        aDoubleR7C3 = Double.valueOf(etR7C3.getText().toString());
        aDoubleR8C3 = Double.valueOf(etR8C3.getText().toString());
        aDoubleR9C3 = Double.valueOf(etR9C3.getText().toString());
        aDoubleR10C3 = Double.valueOf(etR10C3.getText().toString());
        aDoubleR11C3 = Double.valueOf(etR11C3.getText().toString());
        aDoubleR12C3 = Double.valueOf(etR12C3.getText().toString());
        aDoubleR13C3 = Double.valueOf(etR13C3.getText().toString());
        aDoubleR14C3 = Double.valueOf(etR14C3.getText().toString());
        aDoubleR15C3 = Double.valueOf(etR15C3.getText().toString());
        aDoubleR16C3 = Double.valueOf(etR16C3.getText().toString());
        aDoubleR17C3 = Double.valueOf(etR17C3.getText().toString());
        aDoubleR18C3 = Double.valueOf(etR18C3.getText().toString());
        aDoubleR19C3 = Double.valueOf(etR19C3.getText().toString());
        aDoubleR20C3 = Double.valueOf(etR20C3.getText().toString());
        aDoubleR21C3 = Double.valueOf(etR21C3.getText().toString());
        aDoubleR22C3 = Double.valueOf(etR22C3.getText().toString());
        aDoubleR23C3 = Double.valueOf(etR23C3.getText().toString());
        aDoubleR24C3 = Double.valueOf(etR24C3.getText().toString());

        arrayListOfDataValue = new ArrayList<>();
        arrayListOfDataValue.add(aDoubleR1C3);
        arrayListOfDataValue.add(aDoubleR2C3);
        arrayListOfDataValue.add(aDoubleR3C3);
        arrayListOfDataValue.add(aDoubleR4C3);
        arrayListOfDataValue.add(aDoubleR5C3);
        arrayListOfDataValue.add(aDoubleR6C3);
        arrayListOfDataValue.add(aDoubleR7C3);
        arrayListOfDataValue.add(aDoubleR8C3);
        arrayListOfDataValue.add(aDoubleR9C3);
        arrayListOfDataValue.add(aDoubleR10C3);
        arrayListOfDataValue.add(aDoubleR11C3);
        arrayListOfDataValue.add(aDoubleR12C3);
        arrayListOfDataValue.add(aDoubleR13C3);
        arrayListOfDataValue.add(aDoubleR14C3);
        arrayListOfDataValue.add(aDoubleR15C3);
        arrayListOfDataValue.add(aDoubleR16C3);
        arrayListOfDataValue.add(aDoubleR17C3);
        arrayListOfDataValue.add(aDoubleR18C3);
        arrayListOfDataValue.add(aDoubleR19C3);
        arrayListOfDataValue.add(aDoubleR20C3);
        arrayListOfDataValue.add(aDoubleR21C3);
        arrayListOfDataValue.add(aDoubleR22C3);
        arrayListOfDataValue.add(aDoubleR23C3);
        arrayListOfDataValue.add(aDoubleR24C3);
    }


    private void addDataToArrayHeight() {
        aDoubleR1C2 = Double.valueOf(etR1C2.getText().toString());
        aDoubleR2C2 = Double.valueOf(etR2C2.getText().toString());
        aDoubleR3C2 = Double.valueOf(etR3C2.getText().toString());
        aDoubleR4C2 = Double.valueOf(etR4C2.getText().toString());
        aDoubleR5C2 = Double.valueOf(etR5C2.getText().toString());
        aDoubleR6C2 = Double.valueOf(etR6C2.getText().toString());
        aDoubleR7C2 = Double.valueOf(etR7C2.getText().toString());
        aDoubleR8C2 = Double.valueOf(etR8C2.getText().toString());
        aDoubleR9C2 = Double.valueOf(etR9C2.getText().toString());
        aDoubleR10C2 = Double.valueOf(etR10C2.getText().toString());
        aDoubleR11C2 = Double.valueOf(etR11C2.getText().toString());
        aDoubleR12C2 = Double.valueOf(etR12C2.getText().toString());
        aDoubleR13C2 = Double.valueOf(etR13C2.getText().toString());
        aDoubleR14C2 = Double.valueOf(etR14C2.getText().toString());
        aDoubleR15C2 = Double.valueOf(etR15C2.getText().toString());
        aDoubleR16C2 = Double.valueOf(etR16C2.getText().toString());
        aDoubleR17C2 = Double.valueOf(etR17C2.getText().toString());
        aDoubleR18C2 = Double.valueOf(etR18C2.getText().toString());
        aDoubleR19C2 = Double.valueOf(etR19C2.getText().toString());
        aDoubleR20C2 = Double.valueOf(etR20C2.getText().toString());
        aDoubleR21C2 = Double.valueOf(etR21C2.getText().toString());
        aDoubleR22C2 = Double.valueOf(etR22C2.getText().toString());
        aDoubleR23C2 = Double.valueOf(etR23C2.getText().toString());
        aDoubleR24C2 = Double.valueOf(etR24C2.getText().toString());

        arrayListOfDataHeight = new ArrayList<>();
        arrayListOfDataHeight.add(aDoubleR1C2);
        arrayListOfDataHeight.add(aDoubleR2C2);
        arrayListOfDataHeight.add(aDoubleR3C2);
        arrayListOfDataHeight.add(aDoubleR4C2);
        arrayListOfDataHeight.add(aDoubleR5C2);
        arrayListOfDataHeight.add(aDoubleR6C2);
        arrayListOfDataHeight.add(aDoubleR7C2);
        arrayListOfDataHeight.add(aDoubleR8C2);
        arrayListOfDataHeight.add(aDoubleR9C2);
        arrayListOfDataHeight.add(aDoubleR10C2);
        arrayListOfDataHeight.add(aDoubleR11C2);
        arrayListOfDataHeight.add(aDoubleR12C2);
        arrayListOfDataHeight.add(aDoubleR13C2);
        arrayListOfDataHeight.add(aDoubleR14C2);
        arrayListOfDataHeight.add(aDoubleR15C2);
        arrayListOfDataHeight.add(aDoubleR16C2);
        arrayListOfDataHeight.add(aDoubleR17C2);
        arrayListOfDataHeight.add(aDoubleR18C2);
        arrayListOfDataHeight.add(aDoubleR19C2);
        arrayListOfDataHeight.add(aDoubleR20C2);
        arrayListOfDataHeight.add(aDoubleR21C2);
        arrayListOfDataHeight.add(aDoubleR22C2);
        arrayListOfDataHeight.add(aDoubleR23C2);
        arrayListOfDataHeight.add(aDoubleR24C2);
    }

    private void addDataToArrayDiameter() {
        if (etR1C1.getText().toString() != "") {
            aDoubleR1C1 = Double.valueOf(etR1C1.getText().toString());
        }
        aDoubleR2C1 = Double.valueOf(etR2C1.getText().toString());
        aDoubleR3C1 = Double.valueOf(etR3C1.getText().toString());
        aDoubleR4C1 = Double.valueOf(etR4C1.getText().toString());
        aDoubleR5C1 = Double.valueOf(etR5C1.getText().toString());
        aDoubleR6C1 = Double.valueOf(etR6C1.getText().toString());
        aDoubleR7C1 = Double.valueOf(etR7C1.getText().toString());
        aDoubleR8C1 = Double.valueOf(etR8C1.getText().toString());
        aDoubleR9C1 = Double.valueOf(etR9C1.getText().toString());
        aDoubleR10C1 = Double.valueOf(etR10C1.getText().toString());
        aDoubleR11C1 = Double.valueOf(etR11C1.getText().toString());
        aDoubleR12C1 = Double.valueOf(etR12C1.getText().toString());
        aDoubleR13C1 = Double.valueOf(etR13C1.getText().toString());
        aDoubleR14C1 = Double.valueOf(etR14C1.getText().toString());
        aDoubleR15C1 = Double.valueOf(etR15C1.getText().toString());
        aDoubleR16C1 = Double.valueOf(etR16C1.getText().toString());
        aDoubleR17C1 = Double.valueOf(etR17C1.getText().toString());
        aDoubleR18C1 = Double.valueOf(etR18C1.getText().toString());
        aDoubleR19C1 = Double.valueOf(etR19C1.getText().toString());
        aDoubleR20C1 = Double.valueOf(etR20C1.getText().toString());
        aDoubleR21C1 = Double.valueOf(etR21C1.getText().toString());
        aDoubleR22C1 = Double.valueOf(etR22C1.getText().toString());
        aDoubleR23C1 = Double.valueOf(etR23C1.getText().toString());
        aDoubleR24C1 = Double.valueOf(etR24C1.getText().toString());

        arrayListOfDataDiameter = new ArrayList<>();
        arrayListOfDataDiameter.add(aDoubleR1C1);
        arrayListOfDataDiameter.add(aDoubleR2C1);
        arrayListOfDataDiameter.add(aDoubleR3C1);
        arrayListOfDataDiameter.add(aDoubleR4C1);
        arrayListOfDataDiameter.add(aDoubleR5C1);
        arrayListOfDataDiameter.add(aDoubleR6C1);
        arrayListOfDataDiameter.add(aDoubleR7C1);
        arrayListOfDataDiameter.add(aDoubleR8C1);
        arrayListOfDataDiameter.add(aDoubleR9C1);
        arrayListOfDataDiameter.add(aDoubleR10C1);
        arrayListOfDataDiameter.add(aDoubleR11C1);
        arrayListOfDataDiameter.add(aDoubleR12C1);
        arrayListOfDataDiameter.add(aDoubleR13C1);
        arrayListOfDataDiameter.add(aDoubleR14C1);
        arrayListOfDataDiameter.add(aDoubleR15C1);
        arrayListOfDataDiameter.add(aDoubleR16C1);
        arrayListOfDataDiameter.add(aDoubleR17C1);
        arrayListOfDataDiameter.add(aDoubleR18C1);
        arrayListOfDataDiameter.add(aDoubleR19C1);
        arrayListOfDataDiameter.add(aDoubleR20C1);
        arrayListOfDataDiameter.add(aDoubleR21C1);
        arrayListOfDataDiameter.add(aDoubleR22C1);
        arrayListOfDataDiameter.add(aDoubleR23C1);
        arrayListOfDataDiameter.add(aDoubleR24C1);


        Toast.makeText(getContext(), "add data to array D", Toast.LENGTH_SHORT).show();


    }

   /* public int bundleGetData() {

        bundle = this.getArguments();
        if (bundle != null) {
            myBundleFromPreviousPage = bundle.getInt("numberForCellIdColumn", 7);
        }
        return myBundleFromPreviousPage;
    }*/

    private void saveDataFromTableToFB(String cellT, ArrayList<Double> arrayListDouble) {


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
        addDataToArrayDiameter();
        addDataToArrayHeight();
        addDataToArrayValue();


        saveDataFromTableToFB(DIAMETR, arrayListOfDataDiameter);
        saveDataFromTableToFB(HEIGHT, arrayListOfDataHeight);
        saveDataFromTableToFB(VOLUME, arrayListOfDataValue);
    }
}