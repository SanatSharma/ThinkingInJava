package Minesweeper;

import java.util.ArrayList;
import java.util.Scanner;

public class Minesweeper 
{
    private static Scanner s;

	public static void main(String[] args) 
    {
        runMinesweeper();
        // System.out.println(f(3));
        // Random r = new Random();
    } 
    
    public static void runMinesweeper() 
    {
        Board b = new Board(15, 25, .10);
        System.out.println(b.showAll());
        
        System.out.println("\n" + b);
        s = new Scanner(System.in);

        while (!b.gameOver()) 
        {
            System.out.print("Enter row: ");
            int r = s.nextInt();
            System.out.print("Enter col: ");
            int c = s.nextInt();
            b.reveal(r, c);
            System.out.println(b);
        }
    }
    
    public static int f(int x) 
    {
        if (x == 0)
            return 2;
        else
            return f(x - 2) + x * 2;
    } 
    
    public static void runKnapsack() 
    {
     // first row value, second row weight, parallel arrays
        int[][] items1 = {{4, 2, 2, 1, 10}, {12, 2, 1, 1, 4}}; 
        int[][] items2 = {{11, 6, 6}, {11, 7, 7}};
        
        Item[] items = buildItemArray(items1);
        System.out.println(getBestValue(items, 15));
        
        items = buildItemArray(items2);
        System.out.println(getBestValue(items, 15));       
    }
    
    // pre: valuesAnrWeights != null, valuesAndWeights is a rectangular array
    // first rows is values, second row is parallel array of weights
    public static Item[] buildItemArray(int[][] valuesAndWeights) 
    {
        Item[] result = new Item[valuesAndWeights[0].length];
        for (int i = 0; i < valuesAndWeights[0].length; i++)
            result[i] = new Item(valuesAndWeights[0][i], valuesAndWeights[1][i]);
        return result;
    }
    
    public static int getBestValue(Item[] items, int capacity) {
        return bestHelper(items, 0, capacity);
    }
    
    private static int bestHelper(Item[] items, int index, int capacity) 
    {
        if (index == items.length) // no more items to consider
            return 0;
        
        Item curItem = items[index];
        // choices are don't take item and take item if it fits
        int valueWithout = bestHelper(items, index + 1, capacity);
        
        int valueWith = 0;
        if (curItem.weight <= capacity) 
            valueWith = curItem.value + bestHelper(items, index + 1, capacity - curItem.weight);
        
        return Math.max(valueWith, valueWithout);
    }
        
    public static int fact(int n) 
    {
        if (n == 0)
            return 1;
        else
            // assume n > 0
            return n * fact(n - 1);
    }
    
    public static ArrayList<Item> getBestItems(Item[] items, int capacity) {
        return bestHelperItems(items, 0, capacity, new ArrayList<Item>());
    }

    private static ArrayList<Item> bestHelperItems(Item[] items, int index,int capacity, ArrayList<Item> currentItems) 
    {        
        if (index == items.length)
            return new ArrayList<Item>(currentItems);
        
        ArrayList<Item> without = bestHelperItems(items, index + 1, capacity, currentItems);
        
        ArrayList<Item> with = new ArrayList<Item>();
        Item currentItem = items[index];
        if (currentItem.weight < capacity) 
        {
            currentItems.add(currentItem);
            with = bestHelperItems(items, index + 1, capacity - currentItem.weight, currentItems);
            // take it out!!!
            currentItems.remove(currentItems.size() - 1);
        }
        return (moreValue(with, without)) ? with : without;
    }

    private static boolean moreValue(ArrayList<Item> first, ArrayList<Item> second)
    {
        int firstTotal = 0;
        for (Item i : first)
            firstTotal += i.value;
        
        int secondTotal = 0;
        for (Item i : second)
            secondTotal += i.value;
        
        return firstTotal > secondTotal;
    }

    private static class Item 
    {
        private final int weight;
        private final int value;
        
        // pre: w >= 0, v >= 0
        public Item(int v, int w) 
        {
            value = v;
            weight = w;
        }
        
        public String toString() 
        {
            return "(value: " + value + ", weight: " + weight + ")";
        }
    }
}