package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1
{
    static void main()
    {
        //Linked list is Implementation class
        //Duplicate value is acceptable
        //null value is acceptable
        //No default capacity

        LinkedList l = new LinkedList();
        l.add("SHUBHAM");
        l.add(101);
        l.add('A');
        l.add(22.34f);
        l.add(null);
        l.add(null);

        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.size());
        System.out.println(l.isEmpty());

        l.add(4,"AMIT");
        System.out.println(l);

        l.set(0,101.7);
        System.out.println(l);

        l.remove(0);
        System.out.println(l);

        l.add(0,"SHUBHAM");
        System.out.println(l);

        System.out.println("==================================");

        //print all
        for (int i = 0 ; i<=l.size()-1 ; i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("--------ITRATOR------------");

        Iterator itr = l.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


        System.out.println("--------LIST Itrator-------");

        ListIterator litr = l.listIterator();
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("====+++=for each loop+++++++");

        for(Object S1:l)
        {
            System.out.println(S1);
        }



    }
}
