public class Person{
    String name;
    String surname;
    int age;
    Person(String n, String s,int a)
    {
        this.name=n;
        this.surname=s;
        this.age=a;
    }
    public String toString()
    {
        return "Person{name="+name+", surname="+surname+", age="+age+"}";
    }
    public int hashCode() 
    { 
        return java.util.Objects.hash(name, surname, age); 
    }
    public boolean equals(Object anObject) 
    {
        if (this == anObject) 
            return true;
        if (anObject instanceof Person) 
        {
            Person anotherP = (Person) anObject;
            if(anotherP.name == name && anotherP.surname == surname && anotherP.age == age) 
                return true;
        }
        return false;
    }
    public int getAge()
    {
        return age;
    }

}
