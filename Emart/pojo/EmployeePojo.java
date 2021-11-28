/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.pojo;

/**
 *
 * @author User
 */
public class EmployeePojo {

    @Override
    public String toString() {
        return "EmployeePojo{" + "empName=" + empName + ", empID=" + empID + ", job=" + job + ", sal=" + sal + '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }


    private String empName;
    private  String empID;
    private  String job;
    private Double sal;
}
