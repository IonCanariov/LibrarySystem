package com.example.vialibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vialibrary.entity.Books;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddBookActivity extends AppCompatActivity {
    EditText bookName;
    EditText bookAuthor;
    EditText bookISBN;
    EditText publicationYear;
    Button submitBook;
    DatabaseReference bookRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        bookName = findViewById(R.id.bookName);
        bookAuthor = findViewById(R.id.bookAuthor);
        bookISBN = findViewById(R.id.bookISBN);
        publicationYear = findViewById(R.id.bookPublicationYear);
        submitBook = findViewById(R.id.submitBook);

        bookRef = FirebaseDatabase.getInstance().getReference().child("Books");
        submitBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertBookData();
            }

            private void insertBookData() {
                String bName = bookName.getText().toString();
                String bAuthor = bookAuthor.getText().toString();
                String bISBN = bookISBN.getText().toString();
                int pubYear = Integer.parseInt(publicationYear.getText().toString());

                Books book = new Books(bName, bAuthor, bISBN, pubYear);

                bookRef.push().setValue(book);
                Toast.makeText(AddBookActivity.this, "Book Data Inserted", Toast.LENGTH_SHORT).show();
            }
        });
}}