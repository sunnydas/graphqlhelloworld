package com.sunny.helloworld.java.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.sunny.helloworld.java.graphql.data.Employee;
import com.sunny.helloworld.java.graphql.repositories.EmployeeRepository;

/**
 * This class models the Employee mutation behavior from the schema
 *
 * Created by sundas on 12/14/2017.
 */
public class EmployeeMutation implements GraphQLRootResolver{

  /*type EmployeeMutation {
    createEmployee(id: String!, description: String!, firstName: String!, lastName: String!, primaryEmailAddress: String!,dateOfBirth: String!): Employee
  }*/

   private final EmployeeRepository employeeRepository;


  /**
   *
   * @param employeeRepository
   */
  public EmployeeMutation(EmployeeRepository employeeRepository){
    this.employeeRepository = employeeRepository;
  }


  /**
   * Persist employee
   *
   * @return
   */
  public Employee createEmployee(String id,String description,String firstName,String lastName,String primaryEmailAddress,String dateOfBirth){
    Employee employee = new Employee();
    employee.setId(id);
    employee.setFirstName(firstName);
    employee.setLastName(lastName);
    employee.setDateOfBirth(dateOfBirth);
    employee.setPrimaryEmailAddress(primaryEmailAddress);
    this.employeeRepository.saveEmployee(employee);
    return employee;
  }


}
