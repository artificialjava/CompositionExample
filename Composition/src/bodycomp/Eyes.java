package bodycomp;

import java.util.Random;

public class Eyes implements Organ{
	
	private Organ.Health eyeHealth;
	private int eyePower;
	private String eyeColor;

	public Eyes() {
		Random rand = new Random();
		int eyeIndex = rand.nextInt(3);

		switch(eyeIndex) {
		case 0:
			eyeColor = "Blue";
			break;
		case 1:
			eyeColor = "Green";
			break;
		case 2:
			eyeColor = "Brown";
			break;
		}
		
		eyeHealth = Organ.Health.HEALTHY;
		eyePower = 50;
		
	}
	
	@Override
	public Health getOrganHealth() {
		return eyeHealth;
	}

	@Override
	public int getOrganPower() {
		return eyePower;
	}

	@Override
	public void resting() {
		eyeHealth = Organ.Health.HEALTHY;
		eyePower = 50;
	}

	@Override
	public void setOrganPower(int newPower) {
		eyePower = newPower;
	}

	@Override
	public void setOrganHealth(Health newHealth) {
		eyeHealth = newHealth;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
}