package com.sunny.helloworld.java.graphql.endpoints;

import com.coxautodev.graphql.tools.SchemaParser;
import com.sunny.helloworld.java.graphql.mutation.EmployeeMutation;
import com.sunny.helloworld.java.graphql.query.EmployeeQuery;
import com.sunny.helloworld.java.graphql.repositories.EmployeeRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import javax.management.Query;
import javax.servlet.annotation.WebServlet;

/**
 * This class represents the Employee endpoint of this graphql server.
 *
 * Created by sundas on 12/14/2017.
 */
@WebServlet(urlPatterns = "/sunnygraphql")
public class EmployeesEndpoint extends SimpleGraphQLServlet{

  public EmployeesEndpoint() {
    super(buildSchema());
  }

  private static GraphQLSchema buildSchema() {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    return SchemaParser.newParser()
        .file("schema.graphqls")
        .resolvers(new EmployeeQuery(employeeRepository), new EmployeeMutation(employeeRepository))
        .build()
        .makeExecutableSchema();
  }
}
