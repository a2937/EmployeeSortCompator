package com.example.a2937;

import java.util.Objects;

/**
 * A standard department class with an id and
 * an name
 */
public class Department implements Comparable<Department>
{
    private int id = 0;

    private String departmentName = "";

    /**
     * Instantiates a new Department and sets the id to zero
     * and the name to an empty string.
     */
    public Department()
    {
    }

    /**
     * Instantiates a new Department
     * and sets the id and the name.
     *
     * @param id             the id
     * @param departmentName the department name
     */
    public Department(int id, String departmentName)
    {
        setId(id);
        setDepartmentName(departmentName);
    }

    /**
     * Gets the department id.
     *
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the departments id.
     *
     * @param id the id
     */
    public void setId(int id)
    {
        if(id > 0)
        {
            this.id = id;
        }
    }

    /**
     * Gets the department name.
     *
     * @return the department name
     */
    public String getDepartmentName()
    {
        return departmentName;
    }

    /**
     * Sets the department name.
     *
     * @param departmentName the department name
     */
    public void setDepartmentName(String departmentName)
    {
        if(departmentName != null && !departmentName.isEmpty())
        {
            this.departmentName = departmentName;
        }

    }

    /**
     * Compares this department with the specified department for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * Only the department ids are being used to compare the departments.
     *
     * @param o the Department to be compared
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Department o)
    {
        if(this.equals(o))
        {
            return 0;
        }
        else
        {
            return id - o.getId();
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getId() == that.getId() &&
                Objects.equals(getDepartmentName(), that.getDepartmentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDepartmentName());
    }
}
