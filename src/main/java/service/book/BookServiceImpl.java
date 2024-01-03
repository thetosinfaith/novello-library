package service.book;

import data.models.Book;
import data.repositories.BookRepository;
import dto.request.book.*;
import dto.request.payment.MakePaymentRequest;
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
        data.models.Book newBook = new data.models.Book();
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
    public Book borrowBook(BorrowBookRequest request) {
        Book tobeBorrowed = searchBookByTitle(request.getBookTitle());
        if (!tobeBorrowed.isCanBeBorrowed()){
            throw new RuntimeException("This book is not available at the moment! Please, try again later.");
        }
        tobeBorrowed.setBorrowed(true);
        library.save(tobeBorrowed);
        //Make Payment
        return tobeBorrowed;
    }

    @Override
    public Book buyBook(BuyBookRequest request) {
        Book forsale = MakePaymentRequest(request.)
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        Optional<Book> book = library.searchBookByTitle(title);
//        Book book = library.searchBookByTitle(request.getTitle()).orElseThrow(()->new RuntimeException("Book is not available!");
        if (book.isEmpty()){
            throw new RuntimeException("Book is not available!");
        }
        return book.get();
    }

    @Override
    public ReturnBookResponse returnBook(ReturnBookRequest request) {
         Book

        return null;
    }

    @Override
    public List<data.models.Book> getAllBooks() {
        return library.findAll();
    }
}
