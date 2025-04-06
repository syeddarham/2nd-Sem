package huzaifaalab3;

import java.util.ArrayList;


public class question1Main {

    public static void main(String[] args) {
        Stadium nationalStadium = new Stadium("National Stadium ", "Karachi", 35000);
        Stadium gaddafiStadium = new Stadium("Gaddafi Stadium", "Lahore", 2100);
        Stadium lahorStadium = new Stadium("Lahore Stadium", "Quetta", 1500);


        nationalStadium.matching("Pakistan Vs India");
        nationalStadium.matching("Afganistan Vs England");

        gaddafiStadium.matching("Palestine Vs Iraq");

        nationalStadium.printDetails();
        gaddafiStadium.printDetails();
        lahorStadium.printDetails();
    }

}


