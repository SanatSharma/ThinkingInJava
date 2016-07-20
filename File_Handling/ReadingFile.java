package File_Handling;

import java.util.Scanner;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.URL;

public class ReadingFile {

    // Yahoo finance web service documentation: http://www.jarloo.com/yahoo_finance/
    // and https://greenido.wordpress.com/2009/12/22/yahoo-finance-hidden-api/
    // Note, Yahoo claims accessing data in this way is an unintended "hack"
    // and does not approve of use in this way. 
    // Do not use for any non educational purposes.
    public static void checkStocks() {
        try {
            System.out.println("change and %, average volume, volume, "
                + "dividend yield, PE ratio, market cap, symbol");
            String urlAsString = "http://finance.yahoo.com/d/"
                + "quotes.csv?s=FB+AAPL+INTC+MSFT+AMZN&f=ca2vyrj1s";
            URL url = new URL(urlAsString);
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(IOException e) {
            System.out.println("UH OH: " + e);
        }

    }

    public static void main(String[] args ) throws FileNotFoundException  {
        Scanner sc = new Scanner(new File("weather.txt"));
        int numTemps = 0;
        double totalTemp = 0.0;
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                double temp = sc.nextDouble();
                totalTemp += temp;
                numTemps++;
                System.out.println("temp " + numTemps + ": " + temp);
            } else {
                sc.next(); // skip non double
            }
        }
        System.out.println("average temp: " + totalTemp / numTemps);
        sc.close();
    }

    public static void printWorkingDirectory() {
        System.out.println("Working Directory = " +
            System.getProperty("user.dir"));
    } 

}