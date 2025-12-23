import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
                       
    void input() {  
        Scanner sc = new Scanner(System.in);  
    
        System.out.print("Enter Student ID: ");       
        id = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Student Name: ");  
        name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Student s = new Student();
        s.input();
        s.display();

        System.out.println("\nProgram executed successfully.");
    }
}








