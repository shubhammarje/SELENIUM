package ArrayList;

import java.util.ArrayList;

public class Arraylist1
{
    static void main()
    {
        ArrayList Al = new ArrayList();
        Al.add("SHUBHAM");
        Al.add(101);
        Al.add('A');
        Al.add(72.8f);

        System.out.println(Al);
        System.out.println(Al.size());  //4
        System.out.println(Al.isEmpty()); //false



    }
}
