package BOOK;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class DatabaseOperations {
    private EntityManagerFactory emf;
    private EntityManager em;

    public DatabaseOperations() {
        emf = Persistence.createEntityManagerFactory("bookPU");
        em = emf.createEntityManager();
    }

    public void saveEntity(Object entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public Author findAuthorById(int id) {
        return em.find(Author.class, id);
    }

    public User findUserById(int id) {
        return em.find(User.class, id);
    }

    public Book findBookById(int id) {
        return em.find(Book.class, id);
    }

    public Loan findLoanById(int id) {
        return em.find(Loan.class, id);
    }

    public void close() {
        em.close();
        emf.close();
    }
}
