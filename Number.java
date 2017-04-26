
public class Number {
	Number()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    Number(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    Number(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    { //invoke default constructor first
        Number obj=new Number();
    }

}
