
import java.util.*;
//https://stackoverflow.com/questions/13878437/how-to-fill-an-array-of-characters-from-user-input
public class Homework3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string a characters!");
	
		char[] in = input.next().toCharArray();
		MyString string = new MyString(in);
		String realString = string.toString();
		System.out.printf("Printout of String is %s\n" , realString);
		int length = string.length();
		System.out.printf("The length of the string is %d\n",length);
		
		System.out.printf("The 3rd letter in MyString is %c\n", string.charAt(3));
		
		MyString new_str = string.substring(2,4);
		System.out.printf("SubString is ");
		new_str.getMyString();
		MyString lower_str = string.toLowerCase();
		MyString upper_str = string.toUpperCase();
		System.out.printf("LowerCase String is ");
		lower_str.getMyString();
		System.out.printf("UpperCase String is ");
		upper_str.getMyString();
		
		
		System.out.println("\nEnter a string a numbers!");
		int j =0;
		j = input.nextInt();
		MyString number = MyString.valueOf(j);
		System.out.printf("ValueOf String is ");
		number.getMyString();
		
	}	
}

class MyString{
	
		private char[] data  = null;
		
		public MyString(char[] chars){
			//https://stackoverflow.com/questions/7882074/how-do-you-set-one-arrays-values-to-another-arrays-values-in-java
			data = chars.clone();
		}
		public char  charAt(int index){
			return data[index-1];
		}
		public int length(){
			return data.length;
		}
		public MyString substring(int begin, int end){
			
			int length = (end - begin);
			char[] sub_str = new char[length];
			
			for( int i = 0; i<length; i++){
				sub_str[i]  = data[begin+i];
			}
			MyString newstr = new MyString(sub_str);
			return newstr;
		}
		public MyString toLowerCase(){
			
			int length = length();
			MyString newstr = new MyString(data);
			
			for(int i =0; i<length; i++){
				newstr.data[i] = Character.toLowerCase(data[i]);
			}
			
			return newstr;
		}
		public MyString toUpperCase(){
			int length = length();
			MyString newstr = new MyString(data);
			for(int i =0; i<length; i++){
				newstr.data[i] = Character.toUpperCase(data[i]);
			}
			return newstr;
		}
		public boolean equals(MyString s){
			if (this.length() != s.length()){
				return false;
			}
			else{
				for(int i = 0; i< s.length()-1; i++){
					if(this.data[i] != s.data[i]){
						return false;
					}
				}
			}
			return true;
		}
		public MyString getMyString(){
			
			MyString getString = new MyString(data);
			for(int i = 0 ; i< this.length(); i++){
				getString.data[i] = this.data[i];
			}
			for(int i = 0; i< getString.length(); i++){
					System.out.printf("%c", getString.charAt(i+1));
			}
			System.out.printf("\n");
			return getString;
			
		}
		public String toString(){
			String str = new String();
			
			for(int i = 0; i< data.length;i++){
			//System.out.println(charAt(i+1));
				str += this.charAt(i+1);
			}
			System.out.printf("\n");
			return str;
		}	
		public static MyString valueOf(int i){
			char[] number = ("" + i).toCharArray();
			MyString valueString = new MyString(number);
			return valueString;			
		}
		

}