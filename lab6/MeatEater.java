abstract class MeatEater extends Animal
{
    MeatEater(String i, int wag, int w)
    {
        super(i, wag, w);
    }
    public void eatMeat()
    {
        System.out.println("Lew je mieso");
    }
}