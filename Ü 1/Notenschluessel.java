public class Notenschluessel {
    public static void main(String[] args) {
		int Note ;
		double Punkte = 34.5 ;
		if (Punkte <20){
			Note = 50;
		} else if (Punkte < 22){
			Note = 40;
		} else if (Punkte < 24){
			Note = 37;
		} else if (Punkte < 26){ 
			Note = 33;
		} else if (Punkte < 28){
			Note = 30;
		} else if (Punkte < 30){
			Note = 27;
		} else if (Punkte < 32){
			Note = 23;
		} else if (Punkte < 34){
			Note = 20;
		} else if (Punkte < 36){
			Note = 17;
		} else if (Punkte < 36){
			Note = 13;
		}	else {
			Note = 10;
		}	
		System.out.println(Note);
    }
}