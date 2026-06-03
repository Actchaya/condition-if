import java.util.Scanner;	
public class result{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter mark:");
int mark=sc.nextInt();
if(mark>=40){
System.out.println("Pass mark");
}
else
{
System.out.println("Fail mark");
}
sc.close();
}
}
