/**
 * 
 */
package co.fan;

/**
 * @author Bhavin
 *
 */
public class SpeedThree implements FanState {
	/**
	 * Constructor
	 */
	SpeedThree(){
		 System.out.println("==================== Speed Three ===================");
	}
	
	/**
	 * Overridden method 
	 * @param CeilingFan
	 */
	public void pull(CeilingFan wrapper) {
		if(!wrapper.getDirection()) {
			wrapper.setState(new Off());
		}else {
			wrapper.setState(new SpeedTwo());
		}
        
    }
}
