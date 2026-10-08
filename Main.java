class Student{
    String name;
    int rollno;
    String branch;
    Student(String name, int rollno, String branch){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + branch);
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Varshitha", 101, "CSE");
        Student s2 = new Student("Harshini", 102, "ECE");
        
        s1.display();
        System.out.println();
        s2.display();
    }
}