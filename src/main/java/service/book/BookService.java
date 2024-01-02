package service.book;

import dto.request.book.*;
import dto.response.book.*;

import java.util.List;

public interface BookService {
    AddBookResponse addBook(AddBookRequest request);
    DeleteBookResponse deleteBookByName(DeleteBookRequest request);
    BorrowBookResponse borrowBook(BorrowBookRequest request);
    SearchBookResponse searchBookByTitle(SearchBooksRequest request);
    ReturnBookResponse returnBook(ReturnBookRequest request);
    List<ListBookResponse> listBook();
}