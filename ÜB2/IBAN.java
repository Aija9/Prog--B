import java.math.BigInteger;
public class IBAN{
	static int accountNrLength = 10;
	
    public static void main(String []args){
         
		System.out.println ("please give the Country identification ");
		String country = System.console().readLine();; 
		System.out.println ("please give the Bank code  ");
		String bankID = System.console().readLine();; 
		System.out.println ("please give the account number   ");
		String accountNr = System.console().readLine();;
		
		
		// formatting the account number 
		int NrDigits = accountNr.length() ;
		for (int i=0;i<(accountNrLength - NrDigits);i++){
        accountNr = "0"+accountNr;
		}
		// country code 
		int offset = (int) 'A' -10;
        int code1 = (int) country.charAt(0) - offset ;
		int code2 = (int) country.charAt(1) - offset ;
		String countryID = Integer.toString(code1) + Integer.toString( code2) + "00";
		
		// checksum
		String sum = bankID + accountNr + countryID ; 
	    BigInteger checksum = new BigInteger(sum);

	    BigInteger modulo = new BigInteger("97");
        BigInteger minus = new BigInteger("-98");
        
	    checksum = checksum.remainder (modulo);
	    checksum = checksum.add(minus); 
	    checksum = checksum.abs ();
	
	    String check = checksum.toString();
	    if (check.length()==1){
	        check= "0"+ check;
	    }
		// output 
		
        String IBAN = country + check+ bankID + accountNr ; 
		for (int i=0;i<=4; i++){
			System.out.print ( IBAN.substring(4*i,4*(i+1))+" ");
        }
        System.out.print ( IBAN.substring(20,22));
     }
}