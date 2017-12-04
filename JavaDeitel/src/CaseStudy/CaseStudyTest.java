package CaseStudy;

/**
 * Created by smrithi on 11/28/17.
 */
public class CaseStudyTest {
    public static void main(String[] args) {
     int [] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
     GradeBook gb_obj = new GradeBook("Science", grades);
     gb_obj.displayGrades();
     gb_obj.getAvg();
     gb_obj.getMin();
     gb_obj.getMax();
     gb_obj.gradeChart();
    }
}
