/**
 * 
 */
package co.fan;

/**
 * @author Bhavin
 *
 */
public class SpeedOne implements FanState {
	
	/**
	 * Constructor
	 */
	SpeedOne(){
		 System.out.println("==================== Speed One ===================");
	}
	
	/**
	 * Overridden method
	 * @param CeilingFan
	 */
	public void pull(CeilingFan wrapper) {
		if(!wrapper.getDirection()) {
			wrapper.setState(new SpeedTwo());
		}else {
			wrapper.setState(new Off());
		}
        
    }
}
