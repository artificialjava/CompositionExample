package bodycomp;

public interface Organ {
	enum Health {HEALTHY, STRAINED, LOWENERGY};
	enum BrainZone {LOGIC, EXERCISE, STANDARD, ASLEEP};
	
	public Health getOrganHealth();
	public int getOrganPower();
	public void resting();
	public void setOrganHealth(Health newHealth);
	public void setOrganPower(int newPower);
	
	
}