package JavaClass;

public class ReverseofNo {
	public static void main(String[] args) {

		// reverse of string using Logic
				String str = "sanjay";
				String str1 = "welcome";
				String str2 = "hello";
				String reverse = "";

				for (int i = str.length() - 1; i >= 0; i--)

					reverse = reverse + str.charAt(i);
				System.out.println("Reverse of sanjay is : " + reverse);

		//reverse of string using StringBuilder
				StringBuilder sb = new StringBuilder(str1);
				sb.reverse();
				System.out.println("Reverse of welcome is : " + sb);

		//reverse of string using StringBuffer
				StringBuffer s = new StringBuffer(str2);
				s.reverse();
				System.out.println("Reverse of hello is : " + s);

		// reverse of number using Logic
				int a = 12345;
				int r, rev = 0;

				while (a > 0) { // 12345>0 // 1234>0 //123>0 // 12>0 // 1>0

					rev = rev * 10 + a % 10;
					a = a / 10;
				}
				System.out.println(rev);

		//reverse of number using StringBuilder		
				StringBuilder s1 = new StringBuilder("4567");
				s1.reverse();
				System.out.println(s1);

		//reverse of number using StringBuffer
				StringBuffer s2 = new StringBuffer("78904");
				s2.reverse();
				System.out.println(s2);

			}
		}