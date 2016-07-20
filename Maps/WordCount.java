package Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class WordCount {

    public static void main(String[] args) {
        performExp();
        // countWordsViaGUI();
    }

    // perform a series of experiments on files. Determine average time to
    // count words in files of various sizes
    private static void performExp() {
        String[] smallerWorks = {"2BR02B.txt", "Alice.txt", "SherlockHolmes.txt"};;
        String[] bigFile = {"CIA factbook.txt"};
        //timingExpWithArrayList(smallerWorks, 1);
        //timingExpWithArrayList(bigFile, 1);
        timingExpWithMap(smallerWorks, 3);
        timingExpWithMap(bigFile, 3);
    }


    // allow user to pick file to exam via GUI.
    // allow multiple picks
    public static void countWordsViaGUI() {
        setLookAndFeel();
        try {
            Scanner key = new Scanner(System.in);
            do {
                System.out.println("Opening GUI to choose file.");
                Scanner fileScanner = new Scanner(getFile());
                Stopwatch st = new Stopwatch();
                st.start();
                Map<String, Integer> words = countWordsWithMap(fileScanner);
                st.stop();
                System.out.println("time to count: " + st);
                System.out.print("Enter number of words to display: ");
                int numWordsToShow = Integer.parseInt(key.nextLine());
                showWords(words, numWordsToShow);
                fileScanner.close();
                System.out.print("Perform another count? ");
            } while(key.nextLine().toLowerCase().charAt(0) == 'y');
            key.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Problem reading the data file. Exiting the program." + e);
        }
    }


    // determine distinct words in a file using an array list
    private static ArrayList<WordFreq> 
            countWordsWithArrayList(Scanner fileScanner) {
        
        ArrayList<WordFreq> result = new ArrayList<WordFreq>();
        int totalWords = 0;
        
        WordFreq temp = new WordFreq("", 0);
        
        while (fileScanner.hasNext()) {
            temp.word = fileScanner.next();
            totalWords++; 
            int indexOfWord = result.indexOf(temp);
            if (indexOfWord == -1) {
                // first time we have seen temp.word in file
                result.add(new WordFreq(temp.word, 1));
            } else {
                result.get(indexOfWord).freq++;
            }
        }
        

        System.out.println("Total number of words: " + totalWords);
        System.out.println("number of distinct words: " + result.size());
        return result;
    }

    private static class WordFreq {
        private String word;
        private int freq;

        public WordFreq(String s, int f) {
            word = s;
            freq = f;
        }

        public String toString() {
            return word + " " + freq;
        }

        public boolean equals(Object o) {
            if(!(o instanceof WordFreq))
                return false;
            return this.word.equals(((WordFreq) o).word);
        }
    }


    // determine distinct words in a file and frequency of each word with a Map
    private static Map<String, Integer> 
            countWordsWithMap(Scanner fileScanner) {

        int totalWords = 0;
        Map<String, Integer> result = new TreeMap<String, Integer>();
        
        while (fileScanner.hasNext()) {
            totalWords++;
            String word = fileScanner.next();
            Integer freq = result.get(word);
            if (freq == null) {
                // first time I have seen word
                result.put(word, 1);
            } else {
                result.put(word, freq + 1); // result.put(word, new Integer(freq.valueOf() + 1));
            }
        }
        

        showWords(result, 100);
        
        System.out.println("Total number of words: " + totalWords);
        System.out.println("number of distinct words: " + result.size());

        return result;
    }

    private static void printAll(Map<String, Integer> result) {
        //        Iterator<String> keyIt = result.keySet().iterator();
        //        while(keyIt.hasNext()) {
        //            String key = keyIt.next();
        //            System.out.println(key + " " + result.get(key));
        //        }
        for(String key : result.keySet()) {
            System.out.println(key + " " + result.get(key));
        }
    }

    // return number of words in map with frequency >= freq
    public static ArrayList<String> numWordsAboveFreq
    (Map<String, Integer> map, int cutoff) {

        ArrayList<String> frequentWords = 
            new ArrayList<String>();
        // Set<String> keys = map.keySet();
        for(String word : map.keySet()) {
            int freq = map.get(word);
            if(freq >= cutoff)
                frequentWords.add(word);
        }


        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= cutoff)
                frequentWords.add(entry.getKey());
        }


        return frequentWords;
    }


    private static void showWords(ArrayList<WordFreq> words, int numWordsToShow) {
        for(int i = 0; i < words.size() && i < numWordsToShow; i++)
            System.out.println(words.get(i));
    }


    private static void showWords(Map<String, Integer> words, int numWordsToShow) {
        Iterator<String> it = words.keySet().iterator();
        int count = 0;
        while(it.hasNext() && count < numWordsToShow) {
            count++;
            String key = it.next();
            System.out.println(key + " " + words.get(key));
        }
    }





    // pre: titles != null, elements of titles refer to files in the
    // same path as this program, numExp >= 0
    // read words from files and print average time to cound words.
    private static void timingExpWithMap(String[] titles, int numExp) {
        try {
            double[] times = new double[titles.length];
            for(int i = 0; i < numExp; i++) {
                for(int j = 0; j < titles.length; j++) {
                    Scanner fileScanner = new Scanner(new File(titles[j]));
                    Stopwatch st = new Stopwatch();
                    st.start();
                    Map<String, Integer> words = countWordsWithMap(fileScanner);
                    int x = words.size();
                    st.stop();
                    // System.out.println(words.size());
                    times[j] += st.time();
                    fileScanner.close();
                    showWords(words, 100);
                }

            }
            for(double a : times)
                System.out.println(a / numExp);
        }
        catch(FileNotFoundException e) {
            System.out.println("Problem reading the data file. Exiting the program." + e);
        }
    }


    // pre: titles != null, elements of titles refer to files in the
    // same path as this program, numExp >= 0
    // read words from files and print average time to cound words.
    private static void timingExpWithArrayList(String[] titles, int numExp) {
        try {
            ArrayList<WordFreq> words = null;
            double[] times = new double[titles.length];
            for(int i = 0; i < numExp; i++) {
                for(int j = 0; j < titles.length; j++) {
                    Scanner fileScanner = new Scanner(new File(titles[j]));
                    Stopwatch st = new Stopwatch();
                    st.start();
                    words = countWordsWithArrayList(fileScanner);
                    st.stop();
                    times[j] += st.time();
                    fileScanner.close();
                }
            }
            for(int i = 0; i < titles.length; i++)
                System.out.println("Average time for " + titles[i] + ": " + (times[i] / numExp));
            words = words == null ? new ArrayList<WordFreq>() : words;
            showWords(words, 100);
        }
        catch(FileNotFoundException e) {
            System.out.println("Problem reading the data file. Exiting the program." + e);
        }
    }


    // try to set look and feel to same as system
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            System.out.println("Unable to set look at feel to local settings. " +
            "Continuing with default Java look and feel.");
        }
    }


    /** Method to choose a file using a window.
     * @return the file chosen by the user. Returns null if no file picked.
     */
    private static File getFile() {
        // create a GUI window to pick the text to evaluate
        JFileChooser chooser = new JFileChooser(".");
        chooser.setDialogTitle("Select File To Count Words:");
        int retval = chooser.showOpenDialog(null);
        File f =null;
        chooser.grabFocus();
        if (retval == JFileChooser.APPROVE_OPTION)
            f = chooser.getSelectedFile();
        return f;
    }



    //    private static class WordFreq implements Comparable<WordFreq>{
    //        private int count;
    //        private String word;
    //        
    //        public WordFreq(int count, String word) {
    //            this.count = count;
    //            this.word = word;
    //        }
    //        
    //        public String toString() {
    //            return word + " " + count;
    //        }
    //        
    //        public boolean equals(Object other) {
    //            if(other == null 
    //                    || other.getClass() != this.getClass() )
    //                return false;
    //            WordFreq temp = (WordFreq) other;
    //            return this.word.equals(temp.word);
    //        }
    //        
    //        // calling object "smaller" than other
    //        // if this.count > other.count
    //        public int compareTo(WordFreq other) {
    //            int result = other.count - this.count;
    //            if(result == 0)
    //                result = this.word.compareTo(other.word);
    //            return result;
    //        }
    //    }

}