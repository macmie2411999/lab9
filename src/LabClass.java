import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LabClass {
    ArrayList<Student> list;

    public  LabClass(){
        list = new ArrayList<Student>();
    }

    public void addStudent(Student student) throws EmptyStringException, StudentNotFoundException {
        if(student.checkEX()==true){
            this.list.add(student);
        }
    }

    public ArrayList<Student> searchStudent() throws EmptyStringException {
        boolean flag = false;
        ArrayList<Student> rsList = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        for(Student element : this.list){
            if(element.getName().equals(name)){
                rsList.add(element);
                flag = true;
            }
        }
        sc.close();
        if(flag==false) {
            throw new EmptyStringException("Name - Student is not found.");
        }
        return  rsList;
    }

    public void listOfStudent(){
        System.out.println("-------------------LIST OF STUDENTS--------------------");
        this.list.forEach(a -> a.information());
    }
}
