import java.io.File;
import java.lang.reflect.*;
import java.util.Scanner;

public class pluginMain {


	public static void main(String[] args) throws Throwable {

		Scanner in = new Scanner(new File("plugin"));
		String plugins = "";
		
		System.out.println("Which method would you like to execute?(CASE SENSITIVE)\n");
		
		while(in.hasNext()) {
			plugins = in.nextLine();
			System.out.println(plugins);
		}
		in.close();
		System.out.println("\n\n\n");
		in = new Scanner(System.in);
		String response = in.nextLine();
		
		
		try {
			
			Class<?>plugin = Class.forName(response);
			Object myInstance = plugin.newInstance();
			Method[] pluginMethods = myInstance.getClass().getMethods();
			
			try {
				for(Method method: pluginMethods) {
					method.invoke(myInstance);

				}
			}catch(Exception e) {}
			
		}catch(Exception e) {
			System.out.println("ERROR:DUMBASS CAN'T READ: No plugin by that name!");
		}
	}

}
