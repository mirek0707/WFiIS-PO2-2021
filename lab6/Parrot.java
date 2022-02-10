public class Parrot extends PlantEater
{
    private String nazwa="Papuga";
    Parrot()
    {
        super("Troy",19,72);
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