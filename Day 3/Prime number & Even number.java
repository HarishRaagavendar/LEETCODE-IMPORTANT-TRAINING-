import java.util.*; 
public class Hello {

public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
int a sc.nextInt(); int flag=0;

for(int i=2;i<=a/2;i++){ 
if(a%i==0){

flag=1;


break;

}

}

if(a%2==0 || flag==0){

System.out.println("valid");

}

else{

System.out.println("invalid");

 }

}
