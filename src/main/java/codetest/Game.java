package codetest;

public class Game {

    /**
     * A number is Fizz if it's divisible by 3
     * A number is Buzz if it's divisibel by 5
     * A number is FizzBuzz if it satisfy above 2 criterias together

     *
     * @param number array for the numbers
     * @param div1 the first divisor
     * @param div2 the second divisor
     * @return array for the converted values

     * @version1.00 2019-4-28 author Ellie Guo
     */

	
	public String [] printgame(final int[] number, final int div1, final int div2) {
		String[] array = new String[number.length];
		for(int i = 0;i < number.length; i++) {
			if ((Math.floorMod(number[i], div1)==0)&&(Math.floorMod(number[i], div2)==0)) {
				//System.out.println("FizzBuzz");
				array[i] = "FizzBuzz";
			}else if (Math.floorMod(number[i], div1)==0) {
				//System.out.println("Fizz");
				array[i] = "Fizz";
			}else if (Math.floorMod(number[i], div2)==0) {
				//System.out.println("Buzz");
				array[i] = "Buzz";
			}else {
				//System.out.println(number[i]);
				array[i] = String.valueOf(number[i]);
			}
		}
		return array;
	}

	
    /**
     * A number is Fizz if it's divisible by 3 or if it has a 3 in it
     * A number is Buzz if it's divisibel by 5 or if it has a 5 in it
     * A number is FizzBuzz if it satisfy above 2 criterias together

     *
     * @param number array for the numbers
     * @param div1 the first divisor
     * @param div2 the second divisor
     * @param digit1 the first contained digit
     * @param digit2 the second contained digit
     * @return array for the converted values

     * @version1.00 2019-4-28 author Ellie Guo
     */
	
	public String[] printgame(final int[] number, final int div1, final int div2, final String digit1, final String digit2) {
		String flagMsg;
		String[] array = new String[number.length];
		for(int i=0;i<number.length;i++) {
			flagMsg = String.valueOf(number[i]);
			if((Math.floorMod(number[i], div1)==0)&&(Math.floorMod(number[i],div2)==0)) {
				//System.out.println("FizzBuzz");
				array[i] = "FizzBuzz";
				
			}else if((Math.floorMod(number[i], div1)==0)&&flagMsg.contains(digit2)) {
				//System.out.println("FizzBuzz");
				array[i] = "FizzBuzz";
			}else if(flagMsg.contains(digit1)&&(Math.floorMod(number[i],div2)==0)) {
				//System.out.println("FizzBuzz");
				array[i] = "FizzBuzz";
			}else if(flagMsg.contains(digit1)&&flagMsg.contains(digit2)) {
				//System.out.println("FizzBuzz");
				array[i] = "FizzBuzz";
			}else if(Math.floorMod(number[i], div1)==0 || flagMsg.contains(digit1)) {
				//System.out.println("Fizz");
				array[i] = "Fizz";
			}else if((Math.floorMod(number[i], div2)==0)|| flagMsg.contains(digit2)){
				//System.out.println("Buzz");
				array[i] = "Buzz";
			}else {
				//System.out.println(number[i]);
				array[i] = String.valueOf(number[i]);
			}
		}
		return array;
	}
	


}
