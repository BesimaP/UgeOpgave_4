public class Student {
    String name;
    int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }


    void printInfo(){
        System.out.println("Student name: " + name + ". " + "Age: " + age);
    }
}
