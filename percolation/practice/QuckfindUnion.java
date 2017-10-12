package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuckfindUnion {
	
	private int[] id;

	public QuckfindUnion(int n){
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
		}
	}
	

	public boolean findConnected(int p,int q){
		return id[p]==id[q];
	}
	
	public void union(int p,int q){
		if(id[p]==id[q]){
			return;
		}else{
			int idToChanged=id[q];
			int fromChange = id[p];
			for(int i=0;i<id.length;i++){
				if(id[i]==fromChange){
					id[i]=idToChanged;
				}
			}
		}
	}
	
	public static void main(String [] args){
		//int n = StdIn.readInt();
		File file  = new File("abc.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			int n = scanner.nextInt();
			QuckfindUnion f = new QuckfindUnion(n);
			while(scanner.hasNext()){
				int p = scanner.nextInt();
				
				int q = scanner.nextInt();
				if(!f.findConnected(p, q)){
					f.union(p, q);
					System.out.println("p ::::::::::: "+p+" q::::::::: "+q);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String myString = scanner.next();

	}
}
