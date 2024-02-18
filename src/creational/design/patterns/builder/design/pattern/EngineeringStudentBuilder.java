package creational.design.patterns.builder.design.pattern;

public class EngineeringStudentBuilder extends StudentBuilder {
    EngineeringStudentBuilder(){
        super();
    }

    @Override
    public StudentBuilder setCourse(){
       this.student.course = "Engineering";
       System.out.println("Course has been set for Engineer");
       return this;
    }
}
