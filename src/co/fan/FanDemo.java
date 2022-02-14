/**
 * 
 */
package co.fan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhavin
 * Main class to run the Fan Demo
 * To change the Speed enter P 
 * To reverse the Direction enter R
 */
public class FanDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
        CeilingFan fan = new CeilingFan();
        System.out.print("Enter \nS -> Change the Speed \nR -> Reverse \nE -> To End \n==> ");
        while (true) {
            
            String action = readAction();
            
            if (action.equalsIgnoreCase("R")) {
            	System.out.println("========= Direction Reversed ========");
            	fan.setDirection(!fan.getDirection());
            }else if(action.equalsIgnoreCase("S")) {
            	System.out.println("Changed : ");
            	fan.pullChain();
            }else if(action.equalsIgnoreCase("E")){
            	System.out.println("========= Good Bye ==========");
            	System.exit(0);;
            }else {
            	System.out.print("Enter \nS -> Change the Speed \nR -> Reverse \nE -> To End \n==> ");
            }
        }
    }
	
	/**
	 * Method to read the command line argument
	 * @return String
	 */
    static String readAction() {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = bufferReader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }

}
