package app;
import com.example.sms.dao.StudentDao;
import com.example.sms.entity.Student;

public class App {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        // INSERT
        dao.insert(new Student("Alice", "alice@example.com"));
        dao.insert(new Student("Bob", "bob@example.com"));

        // SELECT ALL
        System.out.println("All Students:");
        dao.findAll().forEach(s -> System.out.println(s.getId() + ": " + s.getName()));

        // UPDATE
        var s = dao.find(1L);
        s.setEmail("alice123@example.com");
        dao.update(s);
        System.out.println("After update → " + dao.find(1L).getEmail());

        // DELETE
        dao.delete(2L);
        System.out.println("After deletion, total count = " + dao.findAll().size());
    }
}
