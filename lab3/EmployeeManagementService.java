import java.util.ArrayList;
class EmployeeManagementService
{
    ArrayList<Employee> T= new ArrayList<Employee>();
    EmployeeManagementService(){}
    public void addNewEmployee(Employee e)
    {
        System.out.println("Employee added "+e.getName()+" "+e.getSurname());
        T.add(e);
    }
    public void printAllEmployees()
    {
        for(int i=0;i<T.size();i++)
        {
            System.out.println("Employee: "+(T.get(i)).getName()+", "+(T.get(i)).getSurname());
        }
    }
    public void changeEmail(Employee e, String m)
    {
        e.getEmail().setEmail(m);
    }
    public void fireEmployee(Employee e)
    {
        T.remove(e);
    }
    public void sendMailToAllEmployees(String m)
    {
        for(int i=0;i<T.size();i++)
        {
            (T.get(i)).getEmail().setMessage(m);
        }
    }
}