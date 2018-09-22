package main.java.InterfaceCasting;

public class Student implements Person {
    String id;
    String name;
    int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public boolean equalTo(Person other) {
        Student otherStudent = (Student) other;
        return (id.equals(otherStudent.getId()));
    }

    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "{ ID=" + this.id + ",name=" +this.name +"}";
    }
}
