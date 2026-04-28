package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1
{
    static void main()
    {

        //Duplicate data can be add in VECTOR
        //can add Multiple null
        //Order Insertion is maineted (Sequence)
        //

        Vector v = new Vector();

        v.add("SHUBHAM");
        v.add(10);
        v.add('A');
        v.add(11.44f);
        v.add(null);
        v.add(null);

        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        v.get(1);
        System.out.println(v);

        v.set(2,"RAM");
        System.out.println(v);

        v.add(2,'C');
        System.out.println(v);

        v.remove(2);
        System.out.println(v);


        System.out.println("===========Enumeration============");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        System.out.println("=======for each loop===========");

        for (Object S1:v)
        {
            System.out.println(S1);
        }


    }
}
