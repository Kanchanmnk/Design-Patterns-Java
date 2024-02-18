package creational.design.patterns.builder.design.pattern;

import static java.lang.System.*;

public class Client {

    public static void main(String[] args){
        out.println("Example for builder design pattern");
        out.println("-------------------------------------------");
        out.println("Creating engineering student");
        Director director1 = new Director(new EngineeringStudentBuilder());
        director1.createStudent();
        out.println("-------------------------------------------");
        out.println("Creating MBA student");
        Director director2 = new Director(new MBAStudentBuilder());
        director2.createStudent();
        out.println("-------------------------------------------");
        out.println("Printing engineering student");
        director1.printStudent();
        out.println("-------------------------------------------");
        out.println("Printing MBA student");
        director2.printStudent();
    }
}
