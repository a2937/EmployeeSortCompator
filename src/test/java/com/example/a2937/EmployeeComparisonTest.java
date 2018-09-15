package com.example.a2937;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeComparisonTest
{

    @Test
    public void EmployeeFieldsDefaultInitializedProperly()
    {
        Employee employee = new Employee();
        Assert.assertEquals("",employee.getFirstName());
        Assert.assertEquals("",employee.getLastName());
        Assert.assertEquals(0,employee.getAge());
        Assert.assertNull(employee.getDepartment());
    }

    @Test
    public void EmployeeFieldsInitializedProperly()
    {
        Department department1 = new Department(1,"Engineering");
        Employee employee = new Employee("FirstName","LastName",21,department1);
        Assert.assertEquals("FirstName",employee.getFirstName());
        Assert.assertEquals("LastName",employee.getLastName());
        Assert.assertEquals(21,employee.getAge());
        Assert.assertEquals(department1,employee.getDepartment());
    }

    @Test
    public void EmployeesAreEqual()
    {
        Employee employee1 = new Employee("FirstName","LastName",21);
        Employee employee2 = new Employee("FirstName","LastName",21);
        Assert.assertEquals(employee1,employee2);
    }

    @Test
    public void EmployeesAreNotEqual()
    {
        Employee employee1 = new Employee("FirstName","LastName",21);
        Employee employee2 = new Employee("FirstName","LastName",26);
        Assert.assertNotEquals(employee1, employee2);
    }

    @Test
    public void EmployeesAreGreaterThan()
    {
        EmployeeComparator comparator = new EmployeeComparator();
        Employee employee1 = new Employee("FirstName","LastName",26);
        Employee employee2 = new Employee("FirstName","LastName",21);
        Assert.assertTrue(comparator.compare(employee1,employee2) > 0);

        Employee employee3 = new Employee("FirstNameFirst","LastName",21);
        Employee employee4 = new Employee("FirstName","LastName",21);
        Assert.assertTrue(comparator.compare(employee3,employee4) > 0);

        Employee employee5 = new Employee("FirstName","LastNameLast",21);
        Employee employee6 = new Employee("FirstName","LastName",21);
        Assert.assertTrue(comparator.compare(employee5,employee6) > 0);

        Department department1 = new Department(3,"Engineering");
        Department department2 = new Department(2,"Engineering");
        Employee employee7 = new Employee("FirstName","LastName",21,department1);
        Employee employee8 = new Employee("FirstName","LastName",21,department2);
        Assert.assertTrue(comparator.compare(employee7,employee8) > 0);
    }
}
