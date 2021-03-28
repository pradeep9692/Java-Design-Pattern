
public class MakeACaptain {

	private static MakeACaptain captain;
	
	private MakeACaptain() {
		
	}
	
	public static MakeACaptain getCaptain() {
		// lazy initialization
		if(captain==null) {
			captain = new MakeACaptain();
			System.out.println("new captain has been selected for team");
		}else {
			System.out.println("caption already selected for team");
		}
		return captain;
	}
}
