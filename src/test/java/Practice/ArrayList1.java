package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1
{
    static void main()
    {
        ArrayList al = new ArrayList();

        al.add("SHUBHAM");
        al.add(101);
        al.add('A');
        al.add(234.768f);
        al.add(null);
        al.add(null);

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());

        System.out.println(al.get(1));

        al.set(1,777);
        System.out.println(al); //update the data

        al.add(0,"RAM");
        System.out.println(al);

        al.remove(0);
        System.out.println(al);


        System.out.println("------------------");

        ListIterator Litr = al.listIterator();
        while(Litr.hasNext())
        {
            System.out.println(Litr.next());
        }

        System.out.println("-----------------------");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("---------for each loop--------------");

        for(Object s1 : al)
        {
            System.out.println(s1);
        }

    }
}
