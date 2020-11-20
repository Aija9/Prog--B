public class Kreisumfang {
	private boolean defaultOptionalFlagValue = true;
	
    public static void main(String[] args) {
		
		double radius = 2.0 ; 
		double pi = 3.14 ;
		
		radius = Double.parseDouble(args[0]);
		double Umfang = pi * radius *radius ;
		
        System.out.println(Umfang); 
    }
}