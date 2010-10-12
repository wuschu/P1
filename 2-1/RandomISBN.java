/*

*/

import java.text.DecimalFormat;
import java.util.Random;

public class RandomISBN{
	private String laendercode;
	private String bandnr;
	private String verlagsnr;
	private String checksum;

	/** Constructor */
	public RandomISBN(){
		makeNumber();
	}

	/** Returns the ISBN in its string representation XX-XXX-XX-C */
	public String toString(){
		return laendercode+"-"+bandnr+"-"+verlagsnr+"-"+checksum;
	}

	/** generates the ISBN using random numbers */
	private void makeNumber(){
		//TODO
		Random makeNumber = new Random();
		int num1;
		num1 = makeNumber.nextInt(10);
		DecimalFormat twoDigits = new DecimalFormat(00);
		
		System.out.println(twoDigits.format(num1));
	}

	/** multiplies i with 2 and subtracts 9 if result is >= 10 */
	private int hashOp(int i){
		int doubled = 2 * i;
		if (doubled >= 10){
			doubled = doubled - 9;
		}
		return doubled;
	}
}
