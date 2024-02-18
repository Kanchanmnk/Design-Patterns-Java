package creational.design.patterns.builder.design.pattern;

import static java.lang.System.*;

public class Student {
    String name;
    int age;
    int rollNumber;
    String course;

    public void printStudentDetails(){
        out.println(this.name);
        out.println(this.age);
        out.println(this.rollNumber);
        out.println(this.course);
    }
}
