package HashTable;
import java.util.*;
import java.util.Map.Entry;
public class GettingEntrySet {
	public static void main(String a[]){
        Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from Hashtable
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
	}
}
