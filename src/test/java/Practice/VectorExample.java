package Practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample
{
    static void main()
    {
        Vector v = new Vector();
        v.add("SHUBHAM");
        v.add('A');
        v.add(101);
        v.add(23.55f);
        v.add(null);
        v.add(101);
        v.add(null);

        System.out.println(v.size());

        System.out.println(v.isEmpty());

        System.out.println(v.capacity());

        v.get(1);
        System.out.println(v);

        v.set(4,"AMAN");
        System.out.println(v);

        v.remove(6);
        System.out.println(v);

        v.add(6,'C');
        System.out.println(v);


        System.out.println("-------Enumeration------");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        System.out.println("-------------Itrator-----------");

        Iterator itr = v.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("-----------ListItrator----------");

        ListIterator litr = v.listIterator();
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("------for each loop ------------");
        for(Object S1:v)
        {
            System.out.println(S1);
        }

    }
}
