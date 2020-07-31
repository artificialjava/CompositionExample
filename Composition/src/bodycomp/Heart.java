package bodycomp;

public class Heart implements Organ{
	private static final int RESTINGBPM = 80;
	
	private int bpm;
	private Organ.Health heartHealth;
	private int heartPower;


	public Heart() {
		heartHealth = Organ.Health.HEALTHY;
		bpm = RESTINGBPM;
		heartPower = 50;
	}
	
	@Override
	public Health getOrganHealth() {
		return heartHealth;
	}

	@Override
	public int getOrganPower() {
		return heartPower;
	}

	@Override
	public void resting() {
		bpm = RESTINGBPM;
		heartHealth = Organ.Health.HEALTHY;
		heartPower = 50;
	}

	@Override
	public void setOrganPower(int newPower) {
		heartPower = newPower;
	}

	@Override
	public void setOrganHealth(Health newHealth) {
		heartHealth = newHealth;
	}
	
	public void setBpm(int newBPM) {
		bpm = newBPM;
	}
	
	public int getBpm() {
		return bpm;
	}
}