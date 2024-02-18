package creational.design.patterns.builder.design.pattern;

public class MBAStudentBuilder extends StudentBuilder {

    MBAStudentBuilder(){
        super();
    }

    @Override
    public StudentBuilder setCourse(){
        this.student.course= "MBA";
        System.out.println("Course has been set for MBA");
        return this;
    }
}
