package aeroplanPcg;

import java.util.ArrayList;
import java.util.List;

public class TestAeroplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var p1 = new Person("male", 184, 38);
        var a1 = new Animal("savci");
        var t1 = new Thing(50, 50, 50);
        
        List<IGetWeight> nakladLetadla = new ArrayList<IGetWeight>();
        // list in c#
        // List<IGetWeight> nakladLetadla = new List<IGetWeight>();
        nakladLetadla.add(p1);
        nakladLetadla.add(a1);
        nakladLetadla.add(t1);
        
        
        //{p1, a1, t1 };
        double celkovaHmotnost = 0;    
        
        for(IGetWeight item : nakladLetadla) {
        	
        	celkovaHmotnost += item.GetWeight();
        	System.out.println(item.GetWeight());
        	}
        // in c# foreach
      //  foreach (IGetWeight item in nakladLetadla)
     //   {
     //       celkovaHmotnost += item.GetWeight();
           // System.out.println(item.GetWeight());
   //     }

        System.out.println("Celkova hmotnost je:"+ celkovaHmotnost);
        
	}

}
