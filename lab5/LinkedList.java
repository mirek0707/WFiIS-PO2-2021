public class LinkedList
{
    public static void main(String[] args)
    {
        int[] T={0,1,2,3,4,5};
        LinkedList lista=new LinkedList(T);
        lista.display();
        int n=6;
        lista.add(n);
        lista.display();
        lista.remove();
        lista.display();
        int[] T1={7, 8, 9};
        LinkedList lista1=new LinkedList(T1);
        lista1.display();
        lista.merge(lista1);
        lista.display();
        lista.contains(9);
        lista.contains(13);
        lista.clear();
        lista.display();
    }
    private Node head;
    LinkedList(int[] T)
    {
        for (int i=0;i<T.length;i++)
        {
            if (this.head==null)
            {
                head=new Node(T[i]);
            }
            else
            {
                this.head.add(T[i]);
            }
        }
    }
    void display()
    {
        if (head!=null)
        {
            Node p=head;
            while (p!=null)
            {
                System.out.print(p.getWar()+", ");
                p=p.next();
            }
            System.out.println();
        }
        else
        {
            System.out.println("lista jest pusta");
        }
        
    }
    void add(int n)
    {
        head.add(n);
    }
    void remove()
    {
        head=head.next();
    }
    void merge(LinkedList l)
    {            System.out.print(head.getWar()+", ");
        Node p=head;
        while (p.next()!=null)
        {
            p=p.next();
        }
        p.setNext(l.head);
    }
    void clear()
    {
        while (head!=null)
        {
            head=head.next();
        }
    }
    void contains(int n)
    {
        if (head!=null)
        {
            Node p=head;
            while (p!=null)
            {
                if (p.getWar()==n)
                {
                    System.out.println("lista posiada element "+n);
                    return;
                }
                p=p.next();
            }
            System.out.println("lista nie posiada elementu "+n);
            return;
        }
        else
        {
            System.out.println("lista jest pusta, nie posiada elementu "+n);
        }
        
    }
}
class Node
{
    Node(){}
    Node(int n)
    {
        this.w=n;
        this.next=null;
    }
    Node next()
    {
        return next;
    }
    int getWar()
    {
        return w;
    }
    void setNext(Node n)
    {
        next=n;
    }
    void add(int n)
    {
        Node p=this;
        while (p.next()!=null)
        {
            p=p.next();
        }
        p.next=new Node(n);
    }
    private int w;
    private Node next;
}