package studentController;

import exception.ResourceNotFoundException;
import model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studentRepo.StudentRepo;

import java.util.List;

//point to local server for react app, "the frontend is here!"
@CrossOrigin(origins = "http:/localhost:3000")

//defining this controller gonna be a REST kind
@RestController

//if you do http:/localhost:3000/api/ in the browser it will go to here
@RequestMapping("/api/")

//controller handle all the functions
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    //    get all students request
    @GetMapping("/allstudents")
    public List<StudentModel> getAllStudent() {
        return studentRepo.findAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentModel> getStudentById(String id){
        StudentModel s1 = StudentRepo.findByName(id).orElseThrow(()->new ResourceNotFoundException());

        return ResponseEntity.ok(s1);
    }
//    put request

//    delete request
}
