package myProject;

import java.util.Date;

public class Cat
{
    String name;
    Date birthDate;
    float weight;
    String ownerName;
    
    public Cat(){}
    
    public Cat(String name) 
    {
    	this(name, null, 0, "");
    }
    
    public Cat(String name, String ownerName) 
    {
    	this(name, null, 0, ownerName);
    }
    
    public Cat(String name, String ownerName, Date birthDate) 
    {
    	this(name, birthDate, 0, ownerName);
    }
    
    public Cat(String name, Date birthDate, float weight, String ownerName)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public String IntroduceYourself() {
        return "I am " + name + ", born on " + birthDate +
                ". My weight is " + weight + " and my owner is " + ownerName;
    }
}