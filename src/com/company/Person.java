package com.company;

public class Person
{
    String lastName;
    String firstName;

    public void setFirstName(String first)
    {
        firstName = first;
    }

    public String getFirstName()
    {
        return firstName.toString();
    }

    public void setLastName(String last)
    {
        lastName = last;
    }

    public String getLastName()
    {
        return lastName.toString();
    }
}