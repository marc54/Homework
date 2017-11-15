import java.io.*;
public class tree{
	public static void main(String[] args) {
		String filename = "/Users/Marc Pfeiffer";
		File root = new File(filename);
		File[] array = root.listFiles();
		
		try {
			BufferedWriter myBufferedWriter = new BufferedWriter(new FileWriter("dir_tree.txt"));
			myBufferedWriter.write("Starting Directory: " + root.getAbsolutePath() + "\n\n" + root.getName());
			myBufferedWriter.newLine();
			myBufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int level = 0;
		printTree(array, level);

		System.out.println("Done!");
	}
	static void printTree(File[] array, int level){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("dir_tree.txt", true));
			
			for(int i = 0; array != null && i<array.length; i++){

			
				
				if(array[i].isDirectory()){
					int count = 0;
					for (int k = 0 ; k < array.length ; k++){
						count++;
					}
					
					for(int k = 0; k <level; k++){
					 
						bw.write("|\t\t");
					}

				
					bw.write("|---DIR:"+array[i].getName()+"\n");
					bw.flush();
				
					File next = new File(array[i].getAbsolutePath());
					
					File[] newarray = next.listFiles();
					
					if(newarray != null){
							printTree(newarray,level+1);
					}

				}
				
				if(array[i].isFile()){
					for(int k = 0; k <level; k++){
						
						bw.write("|\t\t");
					}
					
					bw.write("|---FILE:"+array[i].getName()+"\n");
					bw.flush();
				}

				
			}
		
		bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.err.println("An error has occurred :( ");
		}
		

	}	

}









