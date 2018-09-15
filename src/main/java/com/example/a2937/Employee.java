package com.example.a2937;

import java.util.Objects;

/**
 * An average employee class.
 * Consists of a first name, last name,
 * age, and department
 */
public class Employee
{
    private String firstName = "";
    private String lastName = "";

    private byte age;
    private Department department;

    /**
     * Instantiates a new Employee with default values for variables.
     */
    public Employee()
    {

    }

    /**
     * Instantiates a new Employee.
     *
     * @param firstName  the first name
     * @param lastName   the last name
     * @param age        the age
     * @param department the department
     */
    public Employee(String firstName, String lastName, byte age, Department department)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setDepartment(department);
    }

    /**
     * Instantiates a new Employee.
     *
     * @param firstName  the first name
     * @param lastName   the last name
     * @param age        the age
     * @param department the department
     */
    public Employee(String firstName, String lastName, int age, Department department)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge((byte)age);
        setDepartment(department);
    }


    /**
     * Instantiates a new Employee.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param age       the age
     */
    public Employee(String firstName, String lastName, byte age)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    /**
     * Instantiates a new Employee.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param age       the age
     */
    public Employee(String firstName, String lastName, int age)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge((byte)age);
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName)
    {
        if(firstName != null && !firstName.isEmpty())
        {
            this.firstName = firstName;
        }
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName)
    {
        if(lastName != null && !lastName.isEmpty())
        {
            this.lastName = lastName;
        }
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public byte getAge()
    {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(byte age)
    {
        if(age > 0)
        {
            this.age = age;
        }
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public Department getDepartment()
    {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
    public void setDepartment(Department department)
    {
        if(department != null)
        {
            this.department = department;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getDepartment());
    }
}
