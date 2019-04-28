package codetest;
import org.junit.*;
import static junit.framework.Assert.*;
import codetest.Game;

public class gametest {


	@Test public void testprintgamemMod3() {
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
	
	@Test public void testprintgameMod5() {
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
	
	@Test public void testprintgameMod35() {
		int size =100;	
		int j = 14;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5);
		assertEquals("FizzBuzz",array1[j]);
	}
	
	@Test public void testprintgameFirstValue() {
		int size =100;	
		int j = 0;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5);
		assertEquals("1",array1[j]);
	}
	
	@Test public void testprintgameLastValue() {
		int size =100;	
		int j = 99;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5);
		assertEquals("Buzz",array1[j]);
	}
	
	@Test public void testprintgame2Mod35() {
		int size =100;	
		int j = 89;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("FizzBuzz",array1[j]);
	}
	
	@Test public void testprintgame2Mod3Has5() {
		int size =100;	
		int j = 53;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("FizzBuzz",array1[j]);
	}
	
	@Test public void testprintgame2Has3Mod5() {
		int size =100;	
		int j = 29;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("FizzBuzz",array1[j]);
	}
	
	@Test public void testprintgame2Has3Has5() {
		int size =100;	
		int j = 53;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("FizzBuzz",array1[j]);
	}
	
	@Test public void testprintgame2FirstValue() {
		int size =100;	
		int j = 0;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("1",array1[j]);
	}
	
	@Test public void testprintgame2LastValue() {
		int size =100;	
		int j = 99;
		String [] array1 = new String[size];

		int [] array2 = new int[100];
		for (int i=0; i < size; i++) {
			array2[i] = i+1;
			
		}
		Game game = new Game();
		array1 = game.printgame(array2, 3, 5, "3", "5");
		assertEquals("Buzz",array1[j]);
	}
	
	

}
