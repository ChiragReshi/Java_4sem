class Greatest
{
   public static void main(String args[])
   {
      int a=39,b=54,c=36;
      if(a>b)                                               //using Nested if else
     {
         if(a>c)
        {
            System.out.println("a="+a+" is greatest");
        }
       else
       {
            System.out.println("c="+c+" is greatest");
       }
     }
     else
    {
         if(b>c)
        {
            System.out.println("b="+b+" is greatest");
        }
        else
       {
            System.out.println("c="+c+" is greatest");
        }
     }
  }
}