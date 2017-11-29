
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class abcMultiThread {

	public static void main(String[] args) {
		char[] abc1 = {'a','e','i','m','q','u','y'};
		char[] abc2 = {'b','f','j','n','r','v','z'};
		char[] abc3 = {'c','g','k','o','s','w'};
		char[] abc4 = {'d','h','l','p','t','x'};
		
		
		printArray pA1 = new printArray(abc1);
		printArray pA2 = new printArray(abc2);
		printArray pA3 = new printArray(abc3);
		printArray pA4 = new printArray(abc4);
		
		Thread t1 = new Thread(pA1);
		Thread t2 = new Thread(pA2);
		Thread t3 = new Thread(pA3);
		Thread t4 = new Thread(pA4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();	

	}

}

class printArray implements Runnable{
	public int count = 0;
	Printer printLetter;

	char[] letterSet;
	char x;
	printArray(char[] letterSet){

		printLetter = new Printer(letterSet);
		this.letterSet = new char[letterSet.length];
		for(int i = 0; i<letterSet.length; i++ ) {
			this.letterSet[i] = letterSet[i];
		}
	}
	public void run(){
		while(x != letterSet[letterSet.length-1]) {

			x = printLetter.print();
			//System.out.println(x);
		}
	}	
}

class Printer{
	Lock L = new ReentrantLock();
	private static int count =0;
	
	char[] letterSet;

	Printer(char[] letterSet){
		this.letterSet = new char[letterSet.length];
		for(int i = 0; i<letterSet.length; i++) {
			this.letterSet[i] = letterSet[i];
		}
	}

	public char print() {
		L.lock();
		try {

			while(!containsNext(letterSet, nextletter(count))){
				Thread.sleep(10);
			}
			
			char x =nextletter(count);
			System.out.print(x);
			count++;
			return x;
		}catch(Throwable t) {}

		finally {
			L.unlock();
		}
		return 0;
	}

	public char nextletter(int count) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		return alphabet.charAt(count);
	}
	public boolean containsNext(char[] letterSet, char nextLetter){
		for(int i = 0; i<letterSet.length; i++) {
			if(letterSet[i]==nextLetter){
				return true;
			}
		}
		return false;
	}
	public void findChar(char[]letterSet, char nextLetter){
		for(int i = 0; i<letterSet.length; i++) {
			if(letterSet[i]==nextLetter){
				System.out.print(letterSet[i]);
				count++;
			}
		}

	}
}