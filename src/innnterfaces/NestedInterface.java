package innnterfaces;

interface criesandlaughs {
	void cry();
	void laugh();
}


interface babyact extends criesandlaughs{
	void eat();
	void drink();
}


class Baby implements babyact{
	public void cry() {
		for(int i = 0;i<5;i++)
			System.out.println(":'(");
	}
	
	public void laugh() {
		for(int i = 0;i<5;i++)
			System.out.println("hahahaha");
	}
	public void eat() {
		for(int i = 0;i<5;i++)
			System.out.println("Nom Nom !!");
	}
	
	public void drink() {
		for(int i = 0;i<5;i++)
			System.out.println("Nashe Si Chad Gayii Pyee");
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		Baby b = new Baby();
		b.cry();
		b.drink();

	}

}
