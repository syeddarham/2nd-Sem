package huzaifaalab3;

import java.util.ArrayList;

public class Gymmember {

     static  ArrayList<String> Members=new ArrayList<>();

    void enroll(String Name){;
        Members.add(Name);
        System.out.println("Member Added Successfully");

    }
    void Register(String Name){;
        Members.add(Name);
        System.out.println("Member Added Successfully");

    }

    void Update(String oldName , String newName){
        Members.set(Members.indexOf(oldName),newName);
        System.out.println("Updated Succesfully");


    }
    void Display(){

        System.out.println("Registered Members : " + Members);
    }

    void Remove(String Name) {
        int index = Members.indexOf(Name);
        if (index != -1) {
            Members.remove(index);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Name not found in the list");
        }
    }
}
