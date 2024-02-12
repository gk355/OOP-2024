package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};
	
	public void settings()
	{
		float max = rainfall[0];
		int maxpos = 0;
		float min = rainfall[0];
		int minpos = 0;
		float average = 0;
		size(500, 500);
		for (int i = 0; i < months.length; i ++)
		{
			println("Month: " + months[i] + "\t" + rainfall[i]);
			if (rainfall[i] > max)
			{
				max = rainfall[i];
				maxpos = i;
			}
			if (rainfall[i] < min)
			{
				min = rainfall[i];
				minpos = i;
			}
			average += rainfall[i];
		}
		average /= rainfall.length;
		println("Most rainfall was in " + months[maxpos] + " - " + max + " mm");
		println("Average rainfall across the months - " + average + " mm");
		println("Least rainfall was in " + months[minpos] + " - " + min + " mm");
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
	}
}
