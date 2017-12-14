package com.sunny.helloworld.java.graphql.repositories;

import com.sunny.helloworld.java.graphql.data.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Thsi class represents the DAO class to the back end (database etc)
 *
 * Created by sundas on 12/14/2017.
 */
public class EmployeeRepository {

  private final List<Employee> employees;

  public EmployeeRepository() {
    this.employees = new ArrayList<>();
    //Some basic seeding
    Employee employee1 = new Employee();
    employee1.setId("1");
    employee1.setFirstName("Lord");
    employee1.setLastName("Voldemort");
    employee1.setPrimaryEmailAddress("voldemort@somewhere.com");
    employee1.setDateOfBirth("11-JAN-1124");
    Employee employee2 = new Employee();
    employee2.setId("2");
    employee2.setFirstName("Harry");
    employee2.setLastName("Potter");
    employee2.setPrimaryEmailAddress("harry@somewhere.com");
    employee2.setDateOfBirth("27-MAY-1929");
    employees.add(employee1);
    employees.add(employee2);
  }

  /**
   * Query for employees
   *
   * @return
   */
  public List<Employee> getAllEmployees(){
    return this.employees;
  }

  /**
   * Adds an employee to the repository
   *
   * @param employee
   */
  public void saveEmployee(Employee employee){
    employees.add(employee);
  }
}
