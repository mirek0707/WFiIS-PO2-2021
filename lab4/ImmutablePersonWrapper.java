public class ImmutablePersonWrapper
{
    ImmutablePersonWrapper(ImmutablePerson p)
    {
        person=p;
    }
    public void printInfoAboutPerson(String s)
    {
        System.out.println("Jan is "+s);
    }
    public void printInfoAboutPerson(boolean b)
    {
        System.out.println("Jan is having good time:"+b);
    }
    private ImmutablePerson person;
}