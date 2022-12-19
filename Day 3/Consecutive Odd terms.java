import java.util.*;

public class Hello {

public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
String a =sc.nextLine();
int n=Integer.parseInt(a.charAt(0)+"");
    if(n%2==0){
    for (int i=0;i<a.length();i++)
{
    int n1 = Integer.parseInt(a.charAt(i)+"");
if(n1%2==0)
{ 
System.out.print(n1); 
}
else
{ 
break;
 }


}

}
    else{
    for (int i=0;i<a.length();i++)
{
    int n1 = Integer.parseInt(a.charAt(i)+"");
if(n1%2!=0)
{ 
System.out.print(n1); 
}
else
{ 
return;
 }


}

}
    
}
}
