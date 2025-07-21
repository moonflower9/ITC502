public class Student {
    String name;
    int birthyear;
    int id;
    
    public Student(String name, int birthyear, int id) {
        this.name = name;
        this.birthyear = birthyear;
        this.id = id;
    }
    
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthyear);
        System.out.println("ID: " + id);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 2004, 001);
        Student student2 = new Student("Jane Doe", 2006, 002);
        
        student1.displayStudent();
        student2.displayStudent();
    }
}