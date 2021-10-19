package studentRepo;

import model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//methods we need to interact with data
@Repository
public interface StudentRepo extends JpaRepository <StudentModel, Integer> {
//    specify what type of data can it use
//    it's custom method
    List<StudentModel> findByName(String name);

}
