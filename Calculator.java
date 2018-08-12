
package calculator;

public class Calculator{

    public int addNumber(int a,int b)
    {
        return a+b;
    }
    
    public int subNumber(int a,int b)
    {
        return a-b;
    }
    
    public int multiNumber(int a,int b)
    {
        return a*b;
    }
    
    public double divNumber(double a,double b) 
    {      
        double r = 0;
        
        if(b==0)
        {
            System.out.println("Dividing by 0 (zero)...");
        }
        else
        {
            r = a/b;
        }
        
        return r;
    }

}
