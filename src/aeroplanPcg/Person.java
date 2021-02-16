package aeroplanPcg;

public class Person implements IGetWeight
{
    private String gender;
    private double height;
    private int age;

    //getters and setters and constructors
    
    public int GetAge()
    {
        return age;
    }

    public void SetAge(int value)
    {
        age = value;
    }

    public double GetHeight()
    {
        return height;
    }

    public void SetHeight(double value)
    {
        height = value;
    }

    public String GetGender()
    {
        return gender;
    }

    public void SetGender(String value)
    {
        gender = value;
    }

    public Person(String gender, double height, int age)
    {
        this.gender = gender;
        this.height = height;
        this.age = age;
    }
    

    public double GetWeight() {

        return height - 100;
    }

}