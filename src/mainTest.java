import java.util.ArrayList;

public class mainTest {
    public static void main(String args[]) throws EmptyStringException, StudentNotFoundException {
        // checkStudent();
        checkLabClass();
    }

    public static void checkStudent(){
        Student student = new Student(22,154624,"Mac Mie");
        student.information();
    }

    public static void checkLabClass() throws EmptyStringException, StudentNotFoundException {
        LabClass labClass = mainTest.createList();
         // labClass.listOfStudent();
         ArrayList<Student> list = labClass.searchStudent();
         list.forEach(a -> a.information());
    }

    public static LabClass createList() throws EmptyStringException, StudentNotFoundException {
        LabClass labClass = new LabClass();
        labClass.addStudent(new Student(22,154624, "Mac"));
        labClass.addStudent(new Student(25,278149, "Tom"));
        labClass.addStudent(new Student(23,146723, "Henrry"));
        labClass.addStudent(new Student(20,548356, "Lily"));
        labClass.addStudent(new Student(18,227490, "Toast"));
        // labClass.addStudent(new Student()); // exception
        return labClass;
    }


}
