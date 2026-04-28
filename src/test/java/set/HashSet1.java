package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet1

{
    static void main()
    {
        //accept only single null value
        //no Duplicate value
        //Storage  content - HashTable
        //Iterator courcer is applicable
        //no incertion

        HashSet hs = new HashSet();
        hs.add("SHUBHAM");
        hs.add(101);
        hs.add('A');
        hs.add(null);
        hs.add(null);
        hs.add(45.76f);
        hs.add("SHUBHAM");

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("SHUBHAM"));


        hs.remove("SHUBHAM");
        System.out.println(hs);


        System.out.println("-----PRINT ALL---------");
        for(Object S1 :hs)
        {
            System.out.println(S1);
        }

        System.out.println("-----Print by Itrator-----");

        Iterator itr = hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("-----------------");

        hs.clear();
        System.out.println(hs);



    }
}
