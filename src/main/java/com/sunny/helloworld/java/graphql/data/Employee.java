package com.sunny.helloworld.java.graphql.data;

/**
 * This class represents the corresponding java type for Employee type , defined in schema.
 *
 * Created by sundas on 12/14/2017.
 */
public class Employee {

  /*
  type Employee{
     id: String!
     firstName: String
     lastName: String
     primaryEmailAddress: String
     dateOfBirth: String
}
   */

  private String id;

  private String firstName;

  @Override
  public String toString() {
    return "Employee{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", primaryEmailAddress='" + primaryEmailAddress + '\'' +
        ", dateOfBirth='" + dateOfBirth + '\'' +
        '}';
  }

  private String lastName;

  private String primaryEmailAddress;

  private String dateOfBirth;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Employee employee = (Employee) o;

    if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null) return false;
    if (getFirstName() != null ? !getFirstName().equals(employee.getFirstName()) : employee.getFirstName() != null)
      return false;
    if (getLastName() != null ? !getLastName().equals(employee.getLastName()) : employee.getLastName() != null)
      return false;
    if (getPrimaryEmailAddress() != null ? !getPrimaryEmailAddress().equals(employee.getPrimaryEmailAddress()) : employee.getPrimaryEmailAddress() != null)
      return false;
    return !(getDateOfBirth() != null ? !getDateOfBirth().equals(employee.getDateOfBirth()) : employee.getDateOfBirth() != null);

  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
    result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
    result = 31 * result + (getPrimaryEmailAddress() != null ? getPrimaryEmailAddress().hashCode() : 0);
    result = 31 * result + (getDateOfBirth() != null ? getDateOfBirth().hashCode() : 0);
    return result;
  }

  public String getId() {

    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPrimaryEmailAddress() {
    return primaryEmailAddress;
  }

  public void setPrimaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = primaryEmailAddress;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
