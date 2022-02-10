class EmailService
{
    EmailService(){}
    public void generateEmailForNewEmployee(Employee e, String d)
    {
        String help=e.getName()+"."+e.getSurname()+"@"+d+".com";
        Email m=new Email(help);
        e.setEmail(m);
    }
    public void sendMail(Employee e1, Employee e2, String s)
    {
        e2.getEmail().setMessage(s);
        e2.getEmail().setEmployee(e1);
    }
}