package codetest;

public class Game {



	
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
