//Factorial Using For Loop
class Factorial
{
    static int factorial(int n)
    {
        int r=1,i;
        for (i=2; i<=n; i++)
            r=r*i;
        return r;
    }

    public static void main(String[] args)
    {
        int num = 6;
        System.out.println("Factorial of "+ num + " is " + factorial(num));
    }
}