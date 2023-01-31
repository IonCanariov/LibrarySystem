package com.example.vialibrary.Contracts;

import java.util.List;

public interface IBook {
List<String> getAllBook();
void searchBook();
void addBook();
void updateBookByIsbn();
void removeBook();

}
