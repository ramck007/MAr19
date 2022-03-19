import java.util.Scanner;
public class SampleTry {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SampleTry2 st = new SampleTry2();
		st.call();
		while(true) {
			st.execute();
			st.printing();
			System.out.println("Do you wish to Continue");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				continue;
			}
			else {
				System.out.println("Bye");
				System.exit(0);
			}
			 
		}		
	}
	}		
		
	/*	
		// TODO Auto-generated method stub
		
		int r,c;
		r=5;c=5;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("Enter the colum to drop :");
			int drop = sc.nextInt();
			System.out.print("Enter B-(baloon) or S- (Stone):");
			char element=sc.next().charAt(0);
			for(int i=1;i<=r;i++) {
				 {
					for(int j=1;j<=c;j++) {
						if(j==drop && i==5)
						{
							System.out.print(element);
						}
						else {
							System.out.print("-");
						}
					}
					
						
					}
				
				
				System.out.println("");
				}
			System.out.println("Do you wish to Continue");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				continue;
			}
			else {
				System.out.println("Bye");
				System.exit(0);
			
				
				
			
			}
		}
	}

}
*/