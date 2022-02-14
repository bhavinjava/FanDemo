/**
 * 
 */
package co.fan;

/**
 * @author Bhavin
 *
 */
public class SpeedTwo implements FanState {
	/**
	 * constructor
	 */
	SpeedTwo(){
		 System.out.println("==================== Speed Two ===================");
	}
	
	/**
	 * Overridden method 
	 * @param CeilingFan
	 */
	public void pull(CeilingFan wrapper) {
		if(!wrapper.getDirection()) {
			wrapper.setState(new SpeedThree());
		}else {
			wrapper.setState(new SpeedOne());
		}
    }
}
