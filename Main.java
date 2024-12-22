package BOOK;

public class Main {
    public static void main(String[] args) {
        DatabaseOperations dbOps = new DatabaseOperations();

        Author author = new Author(1, "George Orwell");
        User user = new User(1, "John Doe");
        Book book = new Book(1, "1984", author);
        Loan loan = new Loan(1, user, book);

        dbOps.saveEntity(author);
        dbOps.saveEntity(user);
        dbOps.saveEntity(book);
        dbOps.saveEntity(loan);

        Loan retrievedLoan = dbOps.findLoanById(1);
        if (retrievedLoan != null) {
            System.out.println("Loan details:");
            System.out.println("User: " + retrievedLoan.getUser().getName());
            System.out.println("Book: " + retrievedLoan.getBook().getTitle());
        }

        dbOps.close();
    }
}
