import java.util.Scanner;
public class MaxrepChar {
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		//String s=scan.nextLine();
	    String s="Satti Raju Yerramsetti";
		System.out.println(s);
		s=s.replace(" ", "").toLowerCase();
		System.out.println(s);		
		int[] arr=new int[127];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<127;i++){
			if(arr[i]>1){
                 System.out.println("Repeated  Characters is [ "+(char)(i)+" ] count = "+arr[i]);
			}
		}	
		for(int i=0;i<s.length();i++) {
			if(max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				ch=s.charAt(i); 
			}
		}
		System.out.println("Maximum Repeated Characters is [ "+ch+" ]  count = "+max);
	}
}
