package com.example.tarasvolianskyi.biometryforforestry.FireBaseAdapter;


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

import com.example.tarasvolianskyi.biometryforforestry.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class IncomingDataFragment extends Fragment  {

    public static final String USER_NAME = "userName";
    public static final String USER_ID = "userId";


    private View view;
    private EditText editTextTask;
    private Button btnSentDataToFB;



    DatabaseReference databaseReferenceUsers;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.incoming_data_form_for_one_column_fragment, container, false);
        initView();
        return view;
    }

    private void initView() {
        databaseReferenceUsers = FirebaseDatabase.getInstance().getReference("tasks");
        editTextTask = (EditText) view.findViewById(R.id.et_r1c1);
        btnSentDataToFB = (Button) view.findViewById(R.id.btn_sent_data_to_fb);
        btnSentDataToFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Click button add task", Toast.LENGTH_SHORT).show();
                //saveDataFromTableToFB();
            }
        });
    }

   /* @Override
    public void onStart() {
        super.onStart();
        databaseReferenceUsers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                tasksPojoList.clear();
                for (DataSnapshot taskSnapshot : dataSnapshot.getChildren()) {
                    TasksPojo tasksPojo = taskSnapshot.getValue(TasksPojo.class);
                    tasksPojoList.add(tasksPojo);
                }
                TasksList adapterForTask = new TasksList(getActivity(), tasksPojoList);
                listViewTasks.setAdapter(adapterForTask);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

    /*   listViewUsers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UsersPojo usersPojo = usersPojoList.get(position);
                Intent intent = new Intent(getApplicationContext(), AddOptionActivity.class);
                intent.putExtra(USER_ID, usersPojo.getUserId());
                intent.putExtra(USER_NAME, usersPojo.getUserName());
                startActivity(intent);
            }
        });*/

     /*   listViewTasks.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                TasksPojo tasksPojo = tasksPojoList.get(position);
                showUpdateDialog(tasksPojo.getUserId(), tasksPojo.getUserName());
                Toast.makeText(getContext(), "showUpdateDialog", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        }
*/


    private void saveDataFromTableToFB() {
        String name = editTextTask.getText().toString().trim();
        //String category = spinnerCategoryOfTasks.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name)) {
            String userId = databaseReferenceUsers.push().getKey();
            String cellType = "Diametd";
            String cellId = "R1C1";
            double cellValue = 2;
            CellPojo cellPojo = new CellPojo(userId, cellType, cellId, cellValue);
            databaseReferenceUsers.child(userId).child(cellType).child(cellId).setValue(cellPojo);
            Toast.makeText(getContext(), "GOOD", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "Write the name", Toast.LENGTH_SHORT).show();
        }

    }




   /* @Override
    public void onClick(View v) {

        Toast.makeText(getContext(), "Click button add task", Toast.LENGTH_SHORT).show();
        //saveDataFromTableToFB();
    }*/

}
