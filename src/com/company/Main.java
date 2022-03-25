package com.company;

public class Main
{

    public static void main(String[] args)
    {

        //Number of Children
        int n = 4;
        
        Child[] Children = new Child[n];
        Children[0] = new Child();
        Children[1] = new Child();
        Children[2] = new Child();
        Children[3] = new Child();

        Guardian[] Parents = new Guardian[n * 2];
        Parents[0] = new Guardian();
        Parents[1] = new Guardian();
        Parents[2] = new Guardian();
        Parents[3] = new Guardian();
        Parents[4] = new Guardian();
        Parents[5] = new Guardian();
        Parents[6] = new Guardian();
        Parents[7] = new Guardian();

        //Parent Info
        Parents[0].setFirstName("");
        Parents[0].setLastName("");
        Parents[0].setPhone("");
        Parents[1].setFirstName("");
        Parents[1].setLastName("");
        Parents[1].setPhone("");

        Parents[2].setFirstName("");
        Parents[2].setLastName("");
        Parents[2].setPhone("");
        Parents[3].setFirstName("");
        Parents[3].setLastName("");
        Parents[3].setPhone("");

        Parents[4].setFirstName("");
        Parents[4].setLastName("");
        Parents[4].setPhone("");
        Parents[5].setFirstName("");
        Parents[5].setLastName("");
        Parents[5].setPhone("");

        Parents[6].setFirstName("");
        Parents[6].setLastName("");
        Parents[6].setPhone("");
        Parents[7].setFirstName("");
        Parents[7].setLastName("");
        Parents[7].setPhone("");

        //Child Info
        Children[0].setAge(5);
        Children[0].setFirstName("");
        Children[0].setLastName("");
        Children[0].setFather(Parents[0]);
        Children[0].setMother(Parents[1]);
        Children[1].setAge(5);
        Children[1].setFirstName("");
        Children[1].setLastName("");
        Children[1].setFather(Parents[2]);
        Children[1].setMother(Parents[3]);
        Children[2].setAge(5);
        Children[2].setFirstName("");
        Children[2].setLastName("");
        Children[2].setFather(Parents[4]);
        Children[2].setMother(Parents[5]);
        Children[3].setAge(5);
        Children[3].setFirstName("");
        Children[3].setLastName("");
        Children[3].setFather(Parents[6]);
        Children[3].setMother(Parents[7]);
    }
}