import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int ch1=0,ch2=0;
		for(int i=0;i<s1.length();i++){
		    char c1=s1.charAt(i);
		    if(c1=='a'||c1=='e'||c1=='o'||c1=='i'||c1=='u'){
		        //System.out.print("");
                ch1++;
		    }
            //else{
		        //ch1++;
		    //}
		}
		for(int i=0;i<s2.length();i++){
		    char c2=s2.charAt(i);
		    if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'){
		       // System.out.print("");
                ch2++;
		    }
            /*else{
		        ch2++;
		    }*/
		}
		if(ch1>ch2){
		    System.out.println(s2);
		}else{
		    System.out.println(s1);
		}

	}
}
