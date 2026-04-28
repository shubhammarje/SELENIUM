package S3_Encapsulation;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Ex1_Encapsulation
{

    //declearing global variable with PRIVATE Access specifier >>we cannot call private variable out of class
    private int num1;
    private int num2;

    //Initilaizing Varibles with constructor with public scope
    public Ex1_Encapsulation()
    {
        num1=10;
        num2=20;
    }

    //use global variable method in public scope
    public void add()
    {
        System.out.println(num1+num2);
    }
}
