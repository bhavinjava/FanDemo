package co.fan;

/**
 * 
 * @author Bhavin
 *
 */

public class CeilingFan {
	private FanState currentState;
	private boolean direction;

    public CeilingFan() {
        currentState = new Off();
        direction = Boolean.FALSE;
    }

    public void setState(FanState s) {
        currentState = s;
    }
	
	public boolean getDirection() { 
		return this.direction; 
	}
	
	public void setDirection(boolean flag) { 
		this.direction = flag; 
	}

    public void pullChain() {
        currentState.pull(this);
    }
}
