import java.util.ArrayList;

public class Students {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    // constructor
    public Students(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId (){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    public double getGradeAverage(){
        int total = 0;
        int size = grades.size();
        for (int grade : grades){
            total+=grade;
        }
        return (double) total / size;
    }
}
