package aeroplanPcg;


 public class Animal implements IGetWeight
{

    private String type;
   
    //getters and setters and constructors
 


    public String GetType()
    {
        return type;
    }

    public void SetType(String value)
    {
        type = value;
    }

    public Animal(String type)
    {
        this.type = type;
    }


    public double GetWeight()
    {
        double w=0;
        if (type == "savci") {w = 50;}
        if (type == "plazi") {w = 10;}
        if (type == "ryby") {w = 5;}
        if (type == "ptaci") {w = 3;}
        if (type == "hmyz") {w = 0.1;}

        return w;
    }
}
