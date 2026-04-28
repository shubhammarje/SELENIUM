package Collection;

import java.util.ArrayList;

public class ArrayList1
{
    static void main()
    {

        //Arraylist defalut Index is 10
        //arraylist Accept Null value
        //Duplicate Data is Accepted
        //Arraylist is resizable
        //Arraylist storage >> (current cout /2)*3 + 1

        ArrayList Al = new ArrayList(20);

        Al.add("SHUBHAM");
        Al.add(101);
        Al.add(24.55f);
        Al.add('A');
        Al.add('A');
        Al.add(null);
        Al.add(null);

        System.out.println(Al);
        System.out.println(Al.size());  //6

        System.out.println(Al.isEmpty());  //False //to verify the value in arraylist is empty or not //return type is Boolean - Tru or False

        //to get all data form arrylist object
        System.out.println(Al.get(2));

        //update Array index data
        Al.set(5,"AMIT");
        System.out.println(Al);

        //to Add Array list in existing
        Al.add(2,"null");
        System.out.println(Al);

        //remove Arry list from Existing
        Al.remove(0);
        System.out.println(Al);


        System.out.println("----Print All Arraylist Index-----");

        for (int i = 0 ; i <=Al.size()-1 ; i++)
        {
            System.out.println(Al.get(i));
        }




    }
}
