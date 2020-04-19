

	
// Creating Own Exception class by Extending Exception class
class AnirudhsException extends Exception{
		
    // Overriding toString method originally defined in Throwable class
	public String toString(){
		return "You're not Anirudh";
	}
}


public class CreatingOwnExceptions {
	public static void main(String args[]) {
		String name  = "AnirudhK";
		
		try {
			if(name == "Anirudh") {
				System.out.println("Welcome Anirudh");
			}else {
				throw new AnirudhsException();
			}
		} catch(AnirudhsException e) {
			System.out.println(e);
			System.out.println("Handling Anirudhs Exception");
		}
		
	}
	
}
