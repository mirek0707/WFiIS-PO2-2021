abstract class PlantEater extends Animal
{
    PlantEater(String i, int wag, int w)
    {
        super(i, wag, w);
    }
    public void eatPlant()
    {
        System.out.println(" je ziarna");
    }
    public void createEgg()
    {
        System.out.println(" znosi jajko");
    }
}