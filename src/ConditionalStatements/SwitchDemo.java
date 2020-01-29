package ConditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		int x= 4;
		switch(x) 
		{
		case 1:
			System.out.println("Performance is poor");
		break;
		case 2:
			System.out.println("Slow Performance");
		break;
		case 3:
			System.out.println("Meeting Expectations");
		break;
		case 4:
			System.out.println("Well done keep rocking");
		break;
		case 5:
			System.out.println("Employe of the year");
		break;
		
		default:
			System.out.println("you are fired");
		}
		

	}

}
