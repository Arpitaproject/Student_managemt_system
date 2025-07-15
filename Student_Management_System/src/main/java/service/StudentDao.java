package service;
import java.util.List;
import org.hibernate.Session;
import com.example.sms.entity.Student;
import com.example.sms.util.HibernateUtil;

public class StudentDao {
    public void insert(Student s) {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            var tx = session.beginTransaction();
            session.persist(s);  // INSERT
            tx.commit();
        }
    }

    public Student find(Long id) {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            return session.find(Student.class, id);
        }
    }

    public List<Student> findAll() {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

    public void update(Student s) {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            var tx = session.beginTransaction();
            session.merge(s);   // UPDATE
            tx.commit();
        }
    }

    public void delete(Long id) {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            var tx = session.beginTransaction();
            session.createQuery("delete from Student where id = :id")
                   .setParameter("id", id)
                   .executeUpdate();  // DELETE
            tx.commit();
        }
    }
}
