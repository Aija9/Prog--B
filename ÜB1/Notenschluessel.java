
public class Notenschluessel {
	public static void main(String[] args) {
		int note = 17;
		double min = 0;
		double max = 40;

		switch (note) {
		case 50:
			min = 0;
			max = 19.5;
			break;
		case 40:
			min = 20;
			max = 21.5;
			break;
		case 37:
			min = 22;
			max = 23.5;
			break;
		case 33:
			min = 24;
			max = 25.5;
			break;
		case 30:
			min = 26;
			max = 27.5;
			break;
		case 27:
			min = 28;
			max = 29.5;
			break;
		case 23:
			min = 30;
			max = 31.5;
			break;
		case 20:
			min = 32;
			max = 33.5;
			break;
		case 17:
			min = 34;
			max = 35.5;
			break;
		case 13:
			min = 36;
			max = 37.5;
			break;
		case 10:
			min = 38;
			max = 40;
			break;
		default:
			System.out.println("Entered points are invalid");
		}
		
		System.out.print("Interval is from " + min + " to " + max);

	}
}
