
import java.util.*;
public class Hello { 






public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); 
    int a[]=new int[n]; 
    int m1=0,m2=0, sum1=0,sum2=0;

    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

} 
    for(int i=0;i<n;i++){

        m1=a[i]/10; 
        sum1+=m1;


}

System.out.print(sum1+" "); 
for(int i=0;i<n;i++){

    m2=a[i]%10;
    sum2+=m2;

} 
    System.out.print(sum2);
}
}

