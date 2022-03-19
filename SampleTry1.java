import java.util.Scanner;
public class SampleTry1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int row=0,column=0;
		row=5;column=5;
		
		char [][] arr=new char  [row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]='-';
			}	
		}
		
		
	
		
		
		while(true) {
			System.out.print("Enter the colum to drop :");
			int drop = sc.nextInt();
			drop=drop-1;
			System.out.print("Enter B-(baloon) or S- (Stone):");
			char element=sc.next().charAt(0);
			for(int i=0;i<row;i++) {
				 int count =0;
					for(int j=0;j<column;j++) {
						if(j==drop && i==4 && count==0)
						{
							arr[i][j]=element;
							count++;
						}
						else {
							if(j==drop && count!=0 && (arr[i][j]=='s'|| arr[i][j]=='b')) {
								arr[i-1][j]=element;
								
							}
						}
						
					System.out.print(arr[i][j]);	
					}
					
				 System.out.println("");
			}			
				
				
			System.out.println("Do you wish to Continue");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				continue;
			}
			else {
				System.out.println("Bye Bye");
				System.exit(0);				
			
			}
		}


	}

}
