package com.sunny.helloworld.java.graphql.query;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.sunny.helloworld.java.graphql.data.Employee;
import com.sunny.helloworld.java.graphql.repositories.EmployeeRepository;

import java.util.List;

/**
 * This class models the query bheavior defined in the schema
 *
 * Created by sundas on 12/14/2017.
 */
public class EmployeeQuery implements GraphQLRootResolver {

  /*type EmployeeQuery{
    allEmployees: [Employee]
  }*/

  private final EmployeeRepository employeeRepository;

  public EmployeeQuery(EmployeeRepository employeeRepository){
    this.employeeRepository = employeeRepository;
  }


  /**
   * Actual query
   *
   * @return
   */
  public List<Employee> allEmployees(){
    return this.employeeRepository.getAllEmployees();
  }

}
