package service.book;

import data.models.Book;
import data.repositories.BookRepository;
import dto.request.book.*;
import dto.response.book.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository library;
    @Override
    public AddBookResponse addBook(AddBookRequest request) {
        Book newBook = new Book();
        newBook.setTitle(request.getTitle());
        newBook.setAuthor(request.getAuthor());
        newBook.setGenre(request.getGenre());
        newBook.setPublisher(request.getPublisher());
        newBook.setPublicationDate(request.getPublicationDate());
        newBook.setISBN(request.getISBN());
        newBook.setBought(request.isBought());
        newBook.setBorrowed(request.isBorrowed());
        newBook.setCanBeBorrowed(request.isCanBeBorrowed());
        newBook.setCanBeBought(request.isCanBeBought());

        Book savedBook = library.save(newBook);
        AddBookResponse response = new AddBookResponse();
        response.setMessage("Book added successfully!");
        return response;
    }

    @Override
    public DeleteBookResponse deleteBookByName(DeleteBookRequest request) {
        return null;
    }

    @Override
    public BorrowBookResponse borrowBook(BorrowBookRequest request) {
        return null;
    }

    @Override
    public SearchBookResponse searchBookByTitle(SearchBooksRequest request) {
        Optional<Book> foundBook = library.searchBookByTitle(request.getTitle());

        if (foundBook.isEmpty()){
            throw new RuntimeException("Book is not available!")
        }
        if (foundBook.get().isBorrowed()

        return null;
    }

    @Override
    public ReturnBookResponse returnBook(ReturnBookRequest request) {
        return null;
    }

    @Override
    public List<ListBookResponse> listBook() {
        return null;
    }
}
