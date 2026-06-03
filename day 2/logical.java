//logical operators
import java.util.Scanner;	
public class logical {
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age:");
int age=sc.nextInt();
System.out.println("Enter mark:");
int mark=sc.nextInt();
System.out.println((age>=18)&&(mark>=50));
System.out.println((age>=18)||(mark>=50));

}

}
