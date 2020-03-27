class Fibo
{
    static void printFibo(int n)
    {
        int x=0,y=1,i;
        if (n < 1)
            return;
        for (i = 1; i <= n; i++)
        {
            System.out.print(y+" ");
            int r=x+y;
            x=y;
            y=r;
        }
    }
    public static void main(String[] args)
    {
        printFibo(7);
    }
}