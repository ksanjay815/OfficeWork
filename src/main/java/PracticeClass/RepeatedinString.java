package PracticeClass;

public class RepeatedinString {

	public static void main(String[] args) {
		// find repeated characters 
	 String str= "saturday";
	int count=0;
	System.out.println("the length is "+str.length());
		System.out.println("The repeated characters are");
	char[] ch= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
			//to avoid printing the visited characters
			
	
		}
		}
		
		
	}

}
}