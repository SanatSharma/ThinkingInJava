package File_Handling;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

// display zip code locations
// file format is for zipcode.csv is:
// zip  city    state   latitude    longitude   timezone    dst
// // lattitude is the 4th field and longitude is the 5th field
// 
// File format for zipCode_49.csv is:
// Zipcode  ZipCodeType City    State   LocationType    Lat Long    Location    Decommisioned   TaxReturnsFiled EstimatedPopulation TotalWages
// latitude is the 6th field and longitude is the 7th field

public class ZipCodePlot {

    public static final String DATA_FILE = "zipcode.csv";

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;

    public static final int TOKENS_BEFORE_LAT_LONG = 3;

    public static void main(String[] args ) {
        Scanner fileScanner = createScanner();
        double minLat = 90;
        double maxLat = -90;
        double minLong = 180;
        double maxLong = -180;
        while(fileScanner.hasNextLine()) {
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            lineScanner.useDelimiter(",");
            skipTokens(lineScanner, TOKENS_BEFORE_LAT_LONG);
            double lat = lineScanner.nextDouble();
            double longi = lineScanner.nextDouble();
            minLat = Math.min(minLat, lat);
            maxLat = Math.max(maxLat, lat);
            minLong = Math.min(minLong, longi);
            maxLong = Math.max(maxLong, longi);   
        }
        
        System.out.println(minLat + " " + maxLat + " " + 
            minLong + " " + maxLong);

        drawZips(minLat, maxLat, minLong, maxLong);
    }

    public static Scanner createScanner() {
        try {
            Scanner sc = new Scanner(new File(DATA_FILE));
            // skip the first line
            sc.nextLine();
            return sc;
        }
        catch(IOException e) {
            System.out.println("Unable to create scanner. Program likely to crash.");
            return null;
        }
    }

    // skip the first 5 tokesn in the line
    public static void skipTokens(Scanner sc, int tokensToSkip) {
        for(int i = 0; i < tokensToSkip; i++) {
            sc.next();
        }
    }

    public static void drawZips(double minLat, double maxLat, 
    double minLong, double maxLong)  {

        DrawingPanel p = new DrawingPanel(WIDTH, HEIGHT);
        p.setBackground(Color.BLACK);
        Graphics g = p.getGraphics();
        g.setColor(Color.WHITE);

        double pixelsPerDegreeLat = HEIGHT / (maxLat - minLat);
        double pixelsPerDegreeLong = WIDTH / (maxLong - minLong);

        Scanner fileScanner = createScanner();

        while(fileScanner.hasNextLine()) {
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            lineScanner.useDelimiter(",");
            skipTokens(lineScanner, TOKENS_BEFORE_LAT_LONG);
            double lat = lineScanner.nextDouble();
            double longi = lineScanner.nextDouble();

            int x = (int) (pixelsPerDegreeLong * (longi - minLong));
            int y = (int) (pixelsPerDegreeLat * (lat - minLat));
            y = HEIGHT - y;
            g.fillRect(x, y, 1, 1);
        }
    }
}