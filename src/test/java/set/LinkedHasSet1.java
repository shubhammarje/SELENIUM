package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHasSet1

{
    static void main()
    {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("SHUBHAM");
        lhs.add("SHUBHAM");
        lhs.add(101);
        lhs.add('A');
        lhs.add(45.67f);
        lhs.add(null);
        lhs.add(null);

        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.contains(101));

        lhs.remove('A');
        System.out.println(lhs);

        System.out.println("-----PRINT Fpr Each Loop----");

        for (Object S1 : lhs)
        {
            System.out.println(S1);
        }

        System.out.println("---------Itrator_________");

        Iterator itr = lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
