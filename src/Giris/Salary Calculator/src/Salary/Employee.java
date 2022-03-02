package Salary;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        // Maaşa uygulanan vergiyi hesaplayacaktır.
        if(this.salary>1000){
            return (this.salary*3/100);
        }
        return 0;
    }

    public int bonus(){
        int overTime = workHours-40;

        if(overTime>0){
            return overTime*30;
        }
        return 0;
    }

    public int raiseSalary(){

        int workyear = 2021-hireYear;

        if(workyear<10){
            return salary*5/100;
        }
        else if(workyear>=10 && workyear<20){
            return salary*10/100;
        }
        else{
            return salary*15/100;
        }
    }

    @Override
    public String toString(){
        return "Employee Name : " + name + "\n" + "Employee Salary : " + Integer.toString(salary) + "\n" +"Employee Work Hours : "
                + Integer.toString(workHours) + "\n"+"Employee Hire Year : " + Integer.toString(hireYear) + "\n" +
                "Employee Tax : " + Integer.toString(tax()) + "\n" + "Employee Bonus : " + Integer.toString(bonus()) + "\n"+
                "Employee Increasing of the Salary : " + Integer.toString(raiseSalary()) + "\n"+
                "Employee Salary with Taxes and Bonuses : " + Integer.toString(this.salary-this.tax()+this.bonus()) + "\n"+
                "Employee Total Salary : " + Integer.toString(this.salary+raiseSalary()) + "\n";
    }
}
