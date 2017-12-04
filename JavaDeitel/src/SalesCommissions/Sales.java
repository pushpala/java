package SalesCommissions;

import java.util.Scanner;

/**
 * Created by smrithi on 11/30/17.
 */
public class Sales {

    int [] frequency = new int[11];

    String[] salesPerson;
    int [] salary;
    int [] sales = new int[2];
    int [] commissions = new int[2];


    public Sales(String [] salesPerson, int[] salary){
        setSalesPerson(salesPerson);
        setSalary(salary);
    }

    public void displayIndividualSalary(){
       for(String person: getSalesPerson()){
           System.out.printf("SalesPerson Name: %s%n", person);
       }
        for(int salary: getSalary() ){
            System.out.printf("Salary %d%n", salary);
        }
    }

    public void collectSales(){
        Scanner input = new Scanner(System.in);
        for(int i=0; i< getSalesPerson().length;i++){
            System.out.printf("Enter Sales made by %s%n", getSalesPerson()[i] +":");
            sales[i] = input.nextInt();
        }
    }

    public void calCommission(){
        for(int i=0; i<sales.length; i++ ){
            commissions[i] = (int) (200 + 0.9 * sales[i]);
        }
    }

    public void displayFinalSalary(){
        for(int i=0; i<commissions.length;i++){
            salary[i] = salary[i] + commissions[i];
            System.out.println(salary[i]);
        }
    }
    public void salaryChart(){
        for(int sal: salary){
            ++frequency[sal/1000];
        }
        for(int i = 0; i< frequency.length; i++){
            if(i == 10){
                System.out.printf("%d:", 100);
            }
            else{
                System.out.printf("%d-%d:", i*100 , i*100+99);
            }
            for(int plus = 0; plus< frequency[i]; plus++){
                System.out.print("+");
            }
            System.out.println();
        }

    }


    public String[] getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String [] salesPerson) {
        this.salesPerson = salesPerson;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }


}
