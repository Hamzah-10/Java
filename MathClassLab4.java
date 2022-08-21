public class MathClassLab4{
	public static void main(String[ ] argrs){

		int anyNumber;
		anyNumber = 2020;
		int log;
		log = (int) Math.log10(anyNumber);

		int lastDigit;
		lastDigit = anyNumber%10;
		int firstDigit;
		firstDigit = anyNumber / (int)Math.pow(10, log);

		System.out.println("Given Number is: " + anyNumber);
		System.out.println("Last Digit of Given Number is: " + lastDigit);
		System.out.println("First Digit of Given Number is: " + firstDigit);
		

	}//main
 
}//class