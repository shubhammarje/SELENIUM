package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor1
{
    static void main()
    {
        ArrayList Al = new ArrayList(20);

        Al.add("SHUBHAM");
        Al.add(101);
        Al.add(24.55f);
        Al.add('A');
        Al.add(null);
        Al.add(null);


        //Itrator >>
        //it is Intrface which is use to store/copy all data from Arraylist and store in Itrator
        //return type is Iterator

        //Print all data using INTRATOR courser
        System.out.println("--------------------------Iterator-----------");

        Iterator itr=Al.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

//-------------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println("------------------ -ListIterator------");

        //List Iterator
        //it is Intrface which is use to store/copy all data from Arraylist and store in ListItrator
        //return type is Iterator

        ListIterator litr = Al.listIterator();

        while(litr.hasNext())  //hasNext check the 1st position of data , if availabe then TRUE ,Not then FALSE
        {
            System.out.println(litr.next());  //print data and push to search next data to hasNext
        }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        System.out.println("====================================");

        for (int i = 0 ; i<=Al.size()-1 ; i++)
        {
            System.out.println(Al.get(i));
        }


//---------------------------------------------------------------------------------------------------------


        System.out.println("+++++++++++for each loop+++++++++ ++++");

        for(Object S1 : Al)
        {
            System.out.println(S1);
        }


    }

}
