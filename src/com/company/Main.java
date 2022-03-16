package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(goWalk(44, 23));
        System.out.println(goWalk(12, 12));
        System.out.println(goWalk(16, -6));
        System.out.println(goWalk(89, 21));
        System.out.println(goWalk(66, 9));

    }



    public static String goWalk(int ageHuman, int outdoorTemperature) {
        {

            if (ageHuman >= 20 && ageHuman <= 45 && outdoorTemperature >= -20 && outdoorTemperature <= 30)

                return "Можно идти гулять";

            else if (ageHuman < 20 && outdoorTemperature >= 0 && outdoorTemperature <= 28)

                return "Можно идти гулять";

            else if (ageHuman > 45 && outdoorTemperature >= -10 && outdoorTemperature <= 25)

                return "Можно идти гулять";

            else
                return "Отсавайтесь дома";


        }


    }

}
