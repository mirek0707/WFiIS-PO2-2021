import java.util.ArrayList;
public class Plansza{
    private char [][]T;
    private int n;
    private double prawd;
    private int x=0;
    private int y=0;
    Plansza(int r, double pr)
    {
        n=r;
        prawd=pr;
        T=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                //if( (i!=0 && i!=0) )    
                    if(Math.random()<pr)
                    {
                        T[i][j]='W';
                    }
                    else{
                        T[i][j]='*';
                    }
                //}
            }
        }
        T[0][0]='G';
        T[n-1][n-1]='S';
    }
    public void print()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(""+T[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public Boolean poruszanie(char z) throws Exception
    {
        if(z=='l')
        {

                if(y-1<0)
                {
                    throw new PozaPlanszaException("Probujesz wyjsc poza plansze");
                }
                else
                {
                    T[x][y]='*';
                    y=y-1;

                        if (T[x][y]=='W')
                        {
                            throw new WejscieWWode("Wszedłeś w wodę, koniec gry");
                        }
                        else if (T[x][y]=='S')
                        {
                            throw new KoniecGry("Koniec gry, wygrales");
                        }
                        else
                        {
                            T[x][y]='G';
                        }
                    
                }
            
        }
        else if(z=='p')
        {
            
                if(y+1>=n)
                {
                    throw new PozaPlanszaException("Probujesz wyjsc poza plansze");
                }
                else
                {
                    T[x][y]='*';
                    y=y+1;
                    
                        if (T[x][y]=='W')
                        {
                            throw new WejscieWWode("Wszedłeś w wodę, koniec gry");
                        }
                        else if (T[x][y]=='S')
                        {
                            throw new KoniecGry("Koniec gry, wygrales");
                        }
                        else
                        {
                            T[x][y]='G';
                        }
                    
                }
            
        }
        else if(z=='g')
        {
            
                if(x-1<0)
                {
                    throw new PozaPlanszaException("Probujesz wyjsc poza plansze");
                }
                else
                {
                    T[x][y]='*';
                    x=x-1;
                    
                        if (T[x][y]=='W')
                        {
                            throw new WejscieWWode("Wszedłeś w wodę, koniec gry");
                        }
                        else if (T[x][y]=='S')
                        {
                            throw new KoniecGry("Koniec gry, wygrales");
                        }
                        else
                        {
                            T[x][y]='G';
                        }
                    
                }
            
        }
        else
        {
            
                if(x+1>=n)
                {
                    throw new PozaPlanszaException("Probujesz wyjsc poza plansze");
                }
                else
                {
                    T[x][y]='*';
                    x=x+1;
                    
                        if (T[x][y]=='W')
                        {
                            throw new WejscieWWode("Wszedłeś w wodę, koniec gry");
                        }
                        else if (T[x][y]=='S')
                        {
                            throw new KoniecGry("Koniec gry, wygrales");
                        }
                        else
                        {
                            T[x][y]='G';
                        }
                    
                }
            
            
        }
        return true;
    }

}
class PozaPlanszaException extends Exception
{
    PozaPlanszaException(String s)
    {
        System.out.println(s);
    }
}
class WejscieWWode extends Exception
{
    WejscieWWode(String s)
    {
        System.out.println(s);
    }
}
class KoniecGry extends Exception
{
    KoniecGry(String s)
    {
        System.out.println(s);
    }
}