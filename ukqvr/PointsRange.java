class PointsRange{
	public static void main (String[] args) {
	float grade = 17f;
	float pointsMin;
	float pointsMax;
	
	if (grade==50){pointsMin = 0f; pointsMax = 19.5f;}
	else if (grade==40){pointsMin = 20f; pointsMax = 21.5f;}
	else if (grade==37){pointsMin = 22f; pointsMax = 23.5f;}
	else if (grade==33){pointsMin = 24f; pointsMax = 25.5f;}
	else if (grade==30){pointsMin = 26f; pointsMax = 27.5f;}
	else if (grade==27){pointsMin = 28f; pointsMax = 29.5f;}
	else if (grade==23){pointsMin = 30f; pointsMax = 31.5f;}
	else if (grade==20){pointsMin = 32f; pointsMax = 33.5f;}
	else if (grade==17){pointsMin = 34f; pointsMax = 35.5f;}
	else if (grade==13){pointsMin = 36f; pointsMax = 37.5f;}
	else if (grade==10){pointsMin = 38f; pointsMax = 40.5f;}
	else {pointsMin = 0f; pointsMax = 0f; System.out.println("Error");}
	
	
	System.out.println(pointsMin+" "+pointsMax);
	}
}