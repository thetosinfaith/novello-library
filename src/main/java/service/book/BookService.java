package service.book;

import data.models.Book;
import dto.request.book.*;
import dto.response.book.*;

import java.util.List;

public interface BookService {
    AddBookResponse addBook(AddBookRequest request);
    DeleteBookResponse deleteBookByName(DeleteBookRequest request);
    Book borrowBook(BorrowBookRequest request);
    Book buyBook(BuyBookRequest request);
    Book searchBookByTitle(String title);
    ReturnBookResponse returnBook(ReturnBookRequest request);
    List<Book> getAllBooks();
}