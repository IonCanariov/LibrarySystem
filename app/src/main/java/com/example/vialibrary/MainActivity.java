package com.example.vialibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phone;
    Spinner role;
    Button submit;
    DatabaseReference borrowerRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        borrowerRef= FirebaseDatabase.getInstance().getReference().child("Borrower");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertBorrowerData();
            }

            private void insertBorrowerData() {
                String bName=name.getText().toString();
                String bemail=email.getText().toString();
                int bPhone=Integer.parseInt(phone.getText().toString());
                String bRole=role.getSelectedItem().toString();


                Borrower borrower=new Borrower(bName,bemail,bRole,bPhone);

                borrowerRef.push().setValue(borrower);
                Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();

            }
        });
    }
}