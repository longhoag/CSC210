package finalExam;

public class Artwork {

	private Artist artist;
	private String title;
	private int yearCreated;

	public Artwork(Artist artist, String title, int yearCreated) {
	this.artist = artist;
	this.title = title;
	this.yearCreated = yearCreated;
	}

	public Artwork(String title, int yearCreated) {
	this.title = title;
	this.yearCreated = yearCreated;
	artist = new Artist();
	}

	public Artwork() {
	title = "None";
	yearCreated = 0;
	artist = new Artist();
	}

	public String getTitle() {
	return title;
	}

	public int getYearCreated() {
	return yearCreated;
	}

	public Artist getArtist() {
	return artist;
	}

	public void printInfo()
	{
	artist.printInfo();
	System.out.println("Title: " + getTitle() + ", " + getYearCreated());
	  
	}

}

