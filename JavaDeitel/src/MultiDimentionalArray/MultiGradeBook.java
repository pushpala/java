package MultiDimentionalArray;

/**
 * Created by smrithi on 11/30/17.
 */
public class MultiGradeBook {

    String course;
    int [][] grades;

    public MultiGradeBook(String course, int [][]grades){
        setCourse(course);
        setGrades(grades);
    }

    public void displayGrades(){
        for(int student = 0 ; student< grades.length; student++){
            System.out.printf("student %2d: %3d%n", student+1 , grades[student]);
        }
    }


    public void getMin(){
        int min = grades[0][0];
        for(int [] studentGrades: grades){
            for(int grade : studentGrades){
                if(grade < min ){
                    min = grade;
                }
            }

        }
        System.out.printf("Minimum is %d%n", min);
    }
    public void getMax(){
        int max = grades[0][0];
        for(int [] studentGrades: grades){
            for(int grade: studentGrades){
                if(grade > max ){
                    max = grade;
                }
            }

        }
        System.out.printf("Minimum is %d%n", max);
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

}
