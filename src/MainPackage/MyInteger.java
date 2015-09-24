/**
 * 
 */
package MainPackage;

/**
 * @author GE60
 *
 */
public class MyInteger {
	private int value; //int data field to store the int value for this object

	public int getValue() {
		return value;
	}
	private void setValue(int value){
		this.value = value;
	}
	
	public MyInteger(int value){
		setValue(value);
	}
	public boolean isEven() {
		if(this.getValue()%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isEven(int value){
		if(value%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isEven(MyInteger myInt){
		if(myInt.getValue()%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd() {
		if(this.getValue()%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int value){
		if(value%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(MyInteger myInt){
		if(myInt.getValue()%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime() {
		if(this.getValue()==2){
			return true;
		}
		if(this.getValue()%2==0){
			return false;
		}
		for(int i=3;i*i<this.getValue();i+=2){
			if(this.getValue()%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(int value){
		if(value==2){
			return true;
		}
		if(value%2==0){
			return false;
		}
		for(int i=3;i*i<value;i+=2){
			if(value%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(MyInteger myInt){
		if(myInt.getValue()==2){
			return true;
		}
		if(myInt.getValue()%2==0){
			return false;
		}
		for(int i=3;i*i<myInt.getValue();i+=2){
			if(myInt.getValue()%i==0){
				return false;
			}
		}
		return true;
	}
	public boolean equals(int number){
		if(value==number){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getValue());
	}
	public static int parseInt(char[] c){
		return Integer.parseInt(new String(c));
	}
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
	
}
