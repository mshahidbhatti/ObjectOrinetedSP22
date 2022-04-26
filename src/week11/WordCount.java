package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    // Function to count frequency of
    // words in the given string
    static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();

        // Splitting to find the word
        String arr[]=str.split(" ");

        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        String str = TextResource.text;

        // Function Call
        count_freq(str);
    }
}

