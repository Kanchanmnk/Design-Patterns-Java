package creational.design.patterns.builder.design.pattern;

import static java.lang.System.*;

public abstract class StudentBuilder {

    protected Student student;

    StudentBuilder(){
        this.student = new Student();
    }

    public StudentBuilder setAge(int age){
        out.println("Age has been set for Student");
        this.student.age = age;
        return this;
    }
    public StudentBuilder setName(String name){
        out.println("Name has been set for Student");
        this.student.name = name;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber){
        out.println("Roll-number has been set for Student");
        this.student.rollNumber = rollNumber;
        return this;
    }

    abstract public StudentBuilder setCourse();

    public Student build(){
        out.println("Student object created successfully");
        return this.student;
    }

}
