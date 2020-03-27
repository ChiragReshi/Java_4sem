class DSum { 
      
    static int Sum(int n)
    {
        int s= 0;
        while (n!=0)
        {
            s=s+n % 10;
            n=n/10;
        }
        return s;
    }

    public static void main(String[] args)
    {
        int n=6587;
        System.out.println(Sum(n));
    }
}