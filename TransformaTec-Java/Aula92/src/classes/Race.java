package classes;

import java.util.ArrayList;
import java.util.List;

public class Race {
    
    public static void main(String[] args) {
        
        List<RaceCar> raceCars = new ArrayList<RaceCar>();

        raceCars.add(new RaceCar("Uno de escada","FIAT",10));
        raceCars.add(new RaceCar("Marea bomba","FIAT",193));

        RaceCar uno = raceCars.get(0);
        System.out.println(uno.getModel());
        uno.sound("Vrooooooooooooooooooooooooooooooooooooom");
        uno.accelerate();

        RaceCar marea = raceCars.get(1);
        System.out.println(marea.getModel());
        marea.sound("BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!");


    }

}
