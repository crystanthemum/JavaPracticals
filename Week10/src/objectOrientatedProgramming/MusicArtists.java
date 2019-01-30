package objectOrientatedProgramming;

public class MusicArtists {
	//instance variables
	
	private String stageName;
	private int age;
	private String genre; 
	//constructor(s0
	MusicArtists(){
	}
	//methods 
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
