package creational.design.patterns.builder.design.pattern;

public class Director {
    private StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent(){
        if(this.studentBuilder instanceof EngineeringStudentBuilder)
            return studentBuilder.setAge(22).setRollNumber(1).setName("Ram").setCourse().build();
        if(this.studentBuilder instanceof MBAStudentBuilder)
            return studentBuilder.setAge(25).setName("Shyam").setCourse().build();
        else
            return null;
    }

    public void printStudent(){
        studentBuilder.student.printStudentDetails();
    }

}
