package com.company;

public class Guardian extends Person
{
    String phone;

    public void setPhone(String num)
    {
        phone = num.toString();
    }

    public String getPhone()
    {
        return phone.toString();
    }
}