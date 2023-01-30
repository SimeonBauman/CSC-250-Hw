
public class Driver {
	
	public static void main(String[] args) {
		
		String s = "yes";
		String s2 = "no";
		String con = s2 + ' ' + s;
		String Final = "";
		for(int i = con.length() - 1; i >= 0; i-- ) {
			Final += con.charAt(i);
		}
		System.out.println(Final);
	}
	
	
}


