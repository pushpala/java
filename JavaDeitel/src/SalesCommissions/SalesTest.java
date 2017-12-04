package SalesCommissions;

/**
 * Created by smrithi on 11/30/17.
 */
public class SalesTest {
    public static void main(String[] args) {
        String [] names = {"Smi", "thi"};
        int [] salary = {3000, 4000};

        Sales sale_obj = new Sales(names, salary);
        sale_obj.displayIndividualSalary();
        sale_obj.collectSales();
        sale_obj.calCommission();
        sale_obj.displayFinalSalary();
        sale_obj.salaryChart();
    }
}
