/**
 * 
 */
package co.fan;

/**
 * @author Bhavin
 *
 */


public class Off implements FanState {
	/**
	 * Constructor
	 */
	Off(){
		System.out.println("==================== Switched off ===================");
	}
	
	/**
	 * Overridden method 
	 * @param CeilingFan
	 */
	public void pull(CeilingFan wrapper) {
		if(!wrapper.getDirection()) {
			wrapper.setState(new SpeedOne());
		}else {
			wrapper.setState(new SpeedThree());
		}
    }
}
