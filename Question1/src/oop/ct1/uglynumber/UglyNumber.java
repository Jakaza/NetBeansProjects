
package oop.ct1.uglynumber;

public class UglyNumber 
{
   private int number;

    public UglyNumber()
    {
    }

    public UglyNumber(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
   public boolean testNumber()
   {
   boolean check=true;
   int num=0;
   if(num==2||num==3||num==5)
   {
   check=false;
   
   }
   
   return check;
   
   }
    
}
