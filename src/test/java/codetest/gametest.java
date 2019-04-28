package codetest;
import org.junit.*;
import static junit.framework.Assert.*;
import codetest.Game;

public class gametest {


	@Test public void testprintgame1() {
		int size =100;	
		int j = 2;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5);
		assertEquals("Fizz",array1[j]);
	}
	
	@Test public void testprintgame2() {
		int size =100;	
		int j = 4;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5);
		assertEquals("Buzz",array1[j]);
	}

}
