
public class Song 
{
	private String title;
	private String artist;
	private int year;
	private String nationality;
	
	public Song() {
		title = "´í½Ì Äý";
		artist = "¾Æ¹Ù";
		year = 1978;
		nationality = "½º¿þµ§";
	}
	
	public Song(String title, String artist, int year, String nationality) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.nationality = nationality;
	}

	public void show() {
		System.out.print(year +"³â "); 
		System.out.print(nationality +" ±¹ÀûÀÇ "); 
		System.out.print(artist +"°¡ ºÎ¸¥ "); 
		System.out.println(title +"ÀÔ´Ï´Ù."); 
		
	}
	

}
