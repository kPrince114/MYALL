package day1_ass1.Day1;

class Employee {

    int empId;
    String empName;
    String address;
    int salary;

    Employee(int empId,String empName,String address,int salary){
        this.empId=empId;
        this.empName=empName;
        this.address=address;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "EmployeeDetails{"+"Emp Id : "+empId+" Emp Name :"+empName+" Address : "+address+" Salary : "+salary+"}";
    }
}