public class OuterClass
{
    interface Inner
    {
        public String getName();
        public void saySomething();
        
    }
    public Inner instantiateFirst()
    {
        Inner i=new InnerClassFirst();
        return i;
    }
    class InnerClassFirst implements Inner
    {
        public String s;
        InnerClassFirst()
        {
            s="first";
            System.out.println("Tworze klase wewnetrzna pierwsza");
        }
        public String getName()
        {
            return s;
        }
        public void saySomething()
        {
            System.out.println("Say something first");
        }
    }
    public Inner instantiateSecond()
    {
        Inner i=new InnerClassSecond();
        return i;
    }
    static class InnerClassSecond implements Inner
    {
        public String s;
        InnerClassSecond()
        {
            s="second";
            System.out.println("Tworze klase wewnetrzna druga");
        }
        public String getName()
        {
            return s;
        }
        public void saySomething()
        {
            System.out.println("Say something second");
        }
    }
}