package maksimya.springlibrary.dao.interfaces;


import maksimya.springlibrary.entities.Author;
import maksimya.springlibrary.entities.Book;
import maksimya.springlibrary.entities.Genre;

import java.util.List;

public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
