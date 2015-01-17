import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Course
{
	private String name;
	private String level;
	private ArrayList<Integer> firstSemesterSixWeekAverages;
	private int midterm;
	private ArrayList<Integer> secondSemesterSixWeekAverages;
	private int finalExam;

	public Course()
	{
		this.name                          = "";
		this.level                         = "";
		this.firstSemesterSixWeekAverages  = new ArrayList<Integer>();
		this.midterm                       = 0;
		this.secondSemesterSixWeekAverages = new ArrayList<Integer>();
		this.finalExam                     = 0;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLevel(String level)
	{
		switch (level.toLowerCase()) {
			case "ap": this.level                  = "AP";
				break;
			case "ib": this.level                  = "IB";
				break;
			case "gt":
			case "g/t":
			case "gifted and talented": this.level = "GT";
				break;
			case "pre ap":
			case "pre-ap":
			case "preap": this.level               = "Pre-AP";
				break;
			case "on level":
			case "on-level":
			case "onlevel": this.level             = "On Level";
				break;
			default: this.level                    = "On Level";
				break;
		}
	}

	public void setFirstSemesterSixWeeksAverages(ArrayList<Double> firstSemesterSixWeeksAverages)
	{
		for (double sixWeekAverage : firstSemesterSixWeeksAverages) {
			this.firstSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage));
		}
	}

	public void setMidterm(double midterm)
	{
		this.midterm = (int) Math.round(midterm);
	}

	public void setSecondSemesterSixWeekAverages(ArrayList<Double> secondSemesterSixWeekAverages)
	{
		for (double sixWeekAverage : secondSemesterSixWeekAverages) {
			this.secondSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage));
		}
	}

	public void setFinal(double finalExam)
	{
		this.finalExam = (int) Math.round(finalExam);
	}

	public double getFirstSemesterGPA()
	{
		double average = (2 * (this.firstSemesterSixWeekAverages.get(0) + this.firstSemesterSixWeekAverages.get(1) + this.firstSemesterSixWeekAverages.get(2)) + this.midterm) / 7;

		return GPA.getScaled(this.level, (int) Math.round(average));
	}

	public double getSecondSemesterGPA()
	{
		double average = (2 * (this.secondSemesterSixWeekAverages.get(0) + this.secondSemesterSixWeekAverages.get(1) + this.secondSemesterSixWeekAverages.get(2)) + this.finalExam) / 7;

		return GPA.getScaled(this.level, (int) Math.round(average));
	}

	public String toString()
	{
		return "Name: " + this.name + "\nLevel: " + this.level + "\n1st Semester: " + this.firstSemesterSixWeekAverages.get(0) + ", " + this.firstSemesterSixWeekAverages.get(1) + ", " + this.firstSemesterSixWeekAverages.get(2) + "\nMidterm: " + this.midterm + "\n2nd Semester: " + this.secondSemesterSixWeekAverages.get(0) + ", " + this.secondSemesterSixWeekAverages.get(1) + ", " + this.secondSemesterSixWeekAverages.get(2) + "\nFinal: " + this.finalExam + "\n\nFirst Semester GPA: " + this.getFirstSemesterGPA() + "\nSecond Semester GPA: " + this.getSecondSemesterGPA() + "\nAverage GPA: " + ((this.getFirstSemesterGPA() + this.getSecondSemesterGPA()) / 2);
	}
}
