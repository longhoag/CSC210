package finalExam;

public class Artist {
	
	private static String name;
	private static int yearBirth;
	private  static int yearDeath;
	Artist() {
		name = "none";
		yearBirth = 0;
		yearDeath = 0;
	}
	
	Artist (String name, int yearBirth, int yearDeath) {
		this.name = name;
		this.yearBirth = yearBirth;
		this.yearDeath = yearDeath;
	}
	public static void printinfo() {
		if (yearDeath == -1) {
			System.out.println(name + ", born" + yearBirth);
		}
		else {
			System.out.println(name + " (" + yearBirth + " - " + yearDeath + ")");
		}
	}
}