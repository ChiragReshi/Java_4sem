class Swap { 
  
    public static void main(String a[]) 
    { 
        int x = 15; 
        int y = 5;
        System.out.println("Before swaping:" + " x = " + x + ", y = " + y);         //Prints values of x and y before swaping.
        x = x + y;      // Here x=20(15+5).
        y = x - y;      //Here y=15(20-5).
        x = x - y;      //Here x=5(20-15).
        System.out.println("After swaping:" + " x = " + x + ", y = " + y);          //Prints values of x and y after swaping.
    } 
} 
  