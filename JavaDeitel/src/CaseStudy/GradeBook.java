package CaseStudy;

/**
 * Created by smrithi on 11/28/17.
 */
public class GradeBook {

    private String course;
    private int[] grades;


    public GradeBook(String course, int[] grades){
        this.setCourse(course);
        this.setGrades(grades);
    }

    public void displayGrades(){
        for(int student = 0 ; student< grades.length; student++){
            System.out.printf("student %2d: %3d%n", student+1 , grades[student]);
        }
    }

    public double getAvg(){
        int total = 0;
        for(int grade: grades){
            total += grade;
        }
        double avg = (double) total/grades.length;
        System.out.printf("Class Avg is %.2f%n", avg);
        return avg;
    }

    public void getMin(){
        int min = grades[0];
        for(int grade: grades){
            if(grade < min ){
                min = grade;
            }
        }
        System.out.printf("Minimum is %d%n", min);
    }
    public void getMax(){
        int max = grades[0];
        for(int grade: grades){
            if(grade > max ){
                max = grade;
            }
        }
        System.out.printf("Minimum is %d%n", max);
    }
    public void gradeChart(){
        int [] frequency = new int[11];
        for(int grade: grades){
            ++frequency[grade/10];
        }

        for(int count = 0; count<frequency.length;count++){
            if(count == 10){
                System.out.printf("%d:", 100);
            }
            else{
                System.out.printf("%d-%d:", count*10 , count*10+9);
            }
            for(int star = 0; star< frequency[count]; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


}
