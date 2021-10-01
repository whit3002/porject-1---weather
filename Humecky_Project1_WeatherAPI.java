/*WHitney Humecky
 *Project 1 - Weather API
 */

import java.util.*;
import java.net.*;

public class Humecky_Project1_WeatherAPI {
    public static void main (String[] args) {
        Scanner keybd = new Scanner(System.in);

        URL url = new URL("http://api.openweathermap.org/data/2.5/
        forecast?id=524901&appid={6acb235a2706fa4e0d823622fcc194e8};");
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        boolean repeat;

        do {
            System.out.print("Howdy! Please enter the city "
                            + "you'd like to get the weather report for: ");
            String cityName = keybd.nextLine();

            String forecast = ;

            System.out.print("\n" + forecast);

            System.out.print("\nWould you like to enter another city? Y/N")

            if (keybd.nextLine == "Y" || keybd.nextLine == "y")
                repeat = true;
            else
                repeat = false;
            
        }while (repeat == true);
     }
}