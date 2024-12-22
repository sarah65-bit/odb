package BOOK;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
    @Id
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    public Loan() {}

    public Loan(int id, User user, Book book) {
        this.id = id;
        this.user = user;
        this.book = book;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
}
