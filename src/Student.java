public class Student{
    private Integer Age = 0;
    private Integer INN = null;
    private String Name = null;

    // constructor
    public Student(){

    }

    public Student(Integer Age, Integer INN, String Name){
        this.Age = Age;
        this.INN = INN;
        this.Name = Name;
    }

    // getter and setter
    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getINN() {
        return INN;
    }

    public void setINN(Integer INN) {
        this.INN = INN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // return information
    public void information(){
        System.out.println("------------------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("INN: " + this.getINN());
        System.out.println("------------------------------------");
    }

    // check exception
    public boolean checkEX() throws StudentNotFoundException, EmptyStringException {
        if(this.INN==null){
            throw new StudentNotFoundException("INN - Student is not found.");
        } else if(this.Name==null){
            throw new EmptyStringException("Name - Student is not found.");
        } else {
            return true;
        }
    }
}
