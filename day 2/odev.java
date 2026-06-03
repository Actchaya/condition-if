import java.util.Scanner;
class odev{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
if(num%2!=0)
{
System.out.println("number is odd");
}
else
{
System.out.println("number is even");
}
sc.close();
}
}