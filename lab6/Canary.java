public class Canary extends PlantEater
{
    private String nazwa="Kanarek";
    Canary(String n)
    {
        super(n,1,5);
    }
    void setName(String s)
    {
        imie=s;
    }
    public void eatPlant()
    {
        System.out.println(nazwa+" je ziarna");
    }
    public void createEgg()
    {
        System.out.println(nazwa+" znosi jajko");
    }
}