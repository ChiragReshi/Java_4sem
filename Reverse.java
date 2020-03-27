class Reverse
{
    static int rev(int num)
    {
        int r=0;
        while(num>0)
        {
            r=r*10+num%10;
            num=num/10;
        }
        return r;
    }
    
    public static void main (String[] args) 
    { 
        int n=62745;
        System.out.println("The no. is " +n);
        System.out.println("Reverse of no. is " +rev(n));
    }
}