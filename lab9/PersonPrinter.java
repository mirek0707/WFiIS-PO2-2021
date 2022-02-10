interface Obliczanie 
{ 
    int printO(Person p1, Person p2);
}
public class PersonPrinter
{
    static public void print(Person ... p)
    {
        for(int i = 0; i < p.length; i++) 
        {
            System.out.print(p[i]);
        }
        System.out.println();
    }
    public void printOperation(Person p1, Person p2, Obliczanie o)
    {
        System.out.println(o.printO(p1, p2));
    }
    Obliczanie sum=(p1, p2)->{return p1.getAge()+p2.getAge();}; 
    Obliczanie multiply=(p1, p2)->{return p1.getAge()*p2.getAge();};
    static public void pelnoletni(Person p1) throws PersonException
    {
        if (p1.getAge()<18)
            throw new PersonException(p1+" cannot drink alcohol");
        else
            System.out.println("Can drink"); 
    }
    public static void checkIfCanDrinkWithExceptionCatch(Person p1)
    {
        try{
            pelnoletni(p1);
        }catch(PersonException pe){}
    }

}
class PersonException extends Exception
{
    PersonException(String s)
    {
        System.out.println(s);
    }
}