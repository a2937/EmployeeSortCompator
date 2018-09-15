package com.example.a2937;

import org.junit.Assert;
import org.junit.Test;

public class DepartmentComparisonTests
{

    @Test
    public void DepartmentFieldsDefaultInitializedProperly()
    {
        Department department1 = new Department();
        Assert.assertEquals("",department1.getDepartmentName());
        Assert.assertEquals(0,department1.getId());
    }

    @Test
    public void DepartmentFieldsInitializedProperly()
    {
        Department department1 = new Department(1,"Engineering");
        Assert.assertEquals("Engineering",department1.getDepartmentName());
        Assert.assertEquals(1,department1.getId());
    }

    @Test
    public void DepartmentsAreEqual()
    {
        Department department1 = new Department(1,"Engineering");
        Department department2 = new Department(1,"Engineering");
        Assert.assertEquals(department1, department2);
    }

    @Test
    public void DepartmentsAreNotEqual()
    {
        Department department1 = new Department(1,"Engineering");
        Department department2 = new Department(2,"Engineering");

        Assert.assertNotEquals(department1, department2);
    }

    @Test
    public void DepartmentsAreLessThan()
    {
        Department department1 = new Department(1,"Engineering");
        Department department2 = new Department(2,"Engineering");
        Assert.assertTrue(department1.compareTo(department2) < 0);
    }

    @Test
    public void DepartmentsAreGreaterThan()
    {
        Department department1 = new Department(3,"Engineering");
        Department department2 = new Department(2,"Engineering");
        Assert.assertTrue(department1.compareTo(department2) > 0);
    }

}
