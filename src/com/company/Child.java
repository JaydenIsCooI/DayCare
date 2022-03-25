package com.company;

public class Child extends Person
{
    int age;
    Guardian mother;
    Guardian father;

    public void setMother(Guardian p)
    {
        mother = p;
    }
    public void setFather(Guardian p)
    {
        father = p;
    }
    public String getMother()
    {
     return mother.toString();
    }
    public String getFather()
    {
        return father.toString();
    }

    public void setAge(int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
}