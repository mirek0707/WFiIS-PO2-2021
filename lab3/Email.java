class Email
{
    private String email;
    private String message;
    private Employee e;
    Email(String m)
    {
        email=m;
    }
    public void setEmail(String m)
    {
        email=m;
    }
    public String getEmail()
    {
        return email;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String m)
    {
        message=m;
    }
    public void setEmployee(Employee e1)
    {
        e=e1;
    }
    public Employee getFrom()
    {
        return e;
    }

}