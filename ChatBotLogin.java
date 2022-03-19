package netflix;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChatBotLogin {
	Scanner sc= new Scanner(System.in);
	Stack<ChatBotDatas> layerSelection = new Stack<ChatBotDatas>(); 
	
	void print(int layer ,int choice) {
		for(String printChoice : getChoice(layer,choice)) {
			System.out.println(printChoice);	
		}
	}
	
	void assign() {
		System.out.println();
	}
	
	ArrayList<String> getChoice(int layer ,int choice){
		ArrayList<String> showList = new ArrayList<>();
		if(layer==0) {
			showList.add(Layer1.OUTPUT.toString());
			showList.add(Layer1.CHOICE_1.toString());
			showList.add(Layer1.CHOICE_2.toString());
			showList.add(Layer1.CHOICE_X.toString());
		}
		if(layer==1) {
			switch(choice) {
			case 1:
				showList.add(LayerA2.OUTPUT.toString());
				showList.add(LayerA2.CHOICE_1.toString());
				showList.add(LayerA2.CHOICE_2.toString());
				showList.add(LayerA2.CHOICE_X.toString());
				showList.add(LayerA2.CHOICE_BACK.toString());
				break;
			case 2:
				showList.add(LayerB2.OUTPUT.toString());
				showList.add(LayerB2.CHOICE_1.toString());
				showList.add(LayerB2.CHOICE_2.toString());
				showList.add(LayerB2.CHOICE_3.toString());
				showList.add(LayerB2.CHOICE_X.toString());
				showList.add(LayerB2.CHOICE_BACK.toString());
				break;
			}
			
		}
		if(layer==2) {
			switch(choice) {
			case 1:
				showList.add(LayerA3.OUTPUT.toString());
				showList.add(LayerA3.CHOICE_1.toString());
				showList.add(LayerA3.CHOICE_2.toString());
				showList.add(LayerA3.CHOICE_X.toString());
				showList.add(LayerA3.CHOICE_BACK.toString());
				break;
			case 2:
				showList.add(LayerB3.OUTPUT.toString());
				showList.add(LayerB3.CHOICE_1.toString());
				showList.add(LayerB3.CHOICE_2.toString());
				showList.add(LayerB3.CHOICE_X.toString());
				showList.add(LayerB3.CHOICE_BACK.toString());
				break;
			}
		}
		return showList;
	}
	
	
	
	
	
	

	public void initialStep() {
		System.out.println("Hi Buddy");
		
		while(true) {
			System.out.println("1.Login\n2.Create Account\n3.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:
					break;
			case 2:
				break;
			case 3:
				System.out.println("Thank You Have a Nice Day");
				System.exit(0);
			
			}
		}
	}
	
	
	
	
}
