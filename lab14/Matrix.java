import java.util.*;
public class Matrix{
    int [][]M;
     int x;
     int y;
    Matrix(int m, int n)
    {
        this.x=m;
        this.y=n;
        M=new int[this.x][this.y];
        for (int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                M[i][j]= (int)(Math.random()*1000);
            }
        }
    }
    void print()
    {
        if(x<10 | y<10)    
        {
            for (int i=0;i<x;i++)
            {
                for (int j=0;j<y;j++)
                {
                    System.out.print(""+M[i][j]+"\t");
                }
                System.out.println();
            }
        }
        
    }
    Matrix mnoz(Matrix M2)
    {
        Matrix M3=new Matrix(this.y, M2.x);
        for (int i=0;i<this.x;i++)
        {
            for (int j=0;j<M2.y;j++)
            {
                int suma=0;
                for (int k=0;k<this.y;k++)
                {
                    suma+=this.M[i][k]*M2.M[k][j];
                }
                M3.M[i][j]=suma;
            }
        }
        return M3;
    }

    Matrix mnoz2(Matrix M2)
    {
        Matrix M3=new Matrix(this.y, M2.x);
        ArrayList threads = new ArrayList<>();
        for (int i=0;i<this.x;i++)
        {
            Wiersze w =new Wiersze(this, M2, M3, i);
            Thread thread=new Thread();
            thread.start();
            threads.add(thread);
            if(threads.size()%10==0)
            {
                waitForThreads(threads);
            }
            /* for (int j=0;j<M2.y;j++)
            {
                int suma=0;
                for (int k=0;k<this.y;k++)
                {
                    suma+=this.M[i][k]*M2.M[k][j];
                }
                M3.M[i][j]=suma;
            } */
        }
        return M3;
    }
    private static void waitForThreads(List<Thread> threads)
    {
        for(Thread thread:threads)
        {
            try{
                thread.join();
            }catch(Exception e)
            {
                
            }
        }
        threads.clear();
    }
}
class Wiersze implements Runnable{
    private Matrix M1; 
    private Matrix M2;
    private Matrix M3;
    int w;
    Wiersze(Matrix M1, Matrix M2, Matrix M3, int w)
    {
        this.M1=M1;
        this.M2=M2;
        this.M3=M3;
        this.w=w;
    }
    @Override
    public void run()
    {
        for (int j=0;j<M2.y;j++)
        {
            int suma=0;
            for (int k=0;k<M1.y;k++)
            {
                suma+=M1.M[w][k]*M2.M[k][j];
            }
            M3.M[w][j]=suma;
        }
    }

}