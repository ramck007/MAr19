import java.util.Scanner;

public class SampleTry2 {


	Scanner sc= new Scanner(System.in);	
	int row =5,column=5;
	char[][] arr= new char[row][column];

	void call() {
		System.out.println("hello");
				for(int i=0;i<row ;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]='-';
			}
		}
	}
	
	void execute() {
		System.out.print("Enter the colum to drop :");
		int drop = sc.nextInt();
		drop=drop-1;
		System.out.print("Enter B-(baloon) or S- (Stone):");
		char element=sc.next().charAt(0);
		int count =0;
		for(int i=0;i<row;i++) {
			 
				for(int j=0;j<column;j++) {
					if(j==drop && i==4 && arr[4][j]=='-')
					{
						arr[i][j]=element;
					
					}
					else {
						if(j==drop && count==0 && (arr[i][j]=='s'|| arr[i][j]=='b')) {
							arr[i-1][j]=element;
							count++;
							
						}
					}					
				}
		}
	}
	
	void printing() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	

}
