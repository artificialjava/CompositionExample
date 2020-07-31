package bodycomp;

public class Brain implements Organ{
	
	private Organ.Health brainHealth;
	private int brainPower;
	private BrainZone brainFocus;

	public Brain() {
		brainHealth = Organ.Health.HEALTHY;
		brainFocus = Organ.BrainZone.STANDARD;
		brainPower = 50;
		
	}
	
	@Override
	public Health getOrganHealth() {
		return brainHealth;
	}

	@Override
	public int getOrganPower() {
		return brainPower;
	}

	@Override
	public void resting() {
		brainFocus = Organ.BrainZone.STANDARD;
		brainHealth = Organ.Health.HEALTHY;
		brainPower = 50;
	}

	@Override
	public void setOrganPower(int newPower) {
		brainPower = newPower;
	}

	@Override
	public void setOrganHealth(Health newHealth) {
		brainHealth = newHealth;
	}
	
	public void setBrainFocus(BrainZone newBrainFocus) {
		brainFocus = newBrainFocus;
	}
	
	public BrainZone getBrainZone() {
		return brainFocus;
	}
}