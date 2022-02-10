public class PersonBuilder
{
    String name;
    String surname;
    int age;
    public PersonBuilder name(String n)
    {
        this.name=n;
        return this;
    }
    public PersonBuilder surname(String s)
    {
        this.surname=s;
        return this;
    }
    public PersonBuilder age(int a)
    {
        this.age=a;
        return this;
    }
    public Person build()
    {
        return new Person(name, surname, age);
    }
}