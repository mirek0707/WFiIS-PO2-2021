class Employee
{
    private int ID;
    private String name;
    private String surname;
    private Email mail;
    Employee(int id, String n, String s)
    {
        this.ID=id;
        this.name=n;
        this.surname=s;
    }
    public int getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public Email getEmail()
    {
        return mail;
    }
    public void setEmail(Email e)
    {
        mail=e;
    }
   
    public Email getLastEmailMessage()
    {
        return mail;
    }
}