package bodycomp;

public class Person implements Body {
	private Heart heart;
	private Brain brain;
	private Eyes eyes;
	
	public Person() {
		heart = new Heart();
		brain = new Brain();
		eyes = new Eyes();
		System.out.println(eyes.getEyeColor());
		
	}

	@Override
	public void walk(int feet) {
		heart.setOrganHealth(Organ.Health.STRAINED);
		heart.setBpm(95);
		heart.setOrganPower(70);
		
		eyes.setOrganPower(30);
		
		brain.setBrainFocus(Organ.BrainZone.EXERCISE);
		brain.setOrganPower(40);
		
		System.out.println("Walked " + feet + " feet.");
		printStatus();
		
	}

	@Override
	public void stand() {
		heart.resting();
		eyes.resting();
		brain.resting();
		
		System.out.println("Standing ");
		printStatus();
		
	}

	@Override
	public void sleep(int hours) {
		heart.setOrganHealth(Organ.Health.LOWENERGY);
		heart.setBpm(40);
		heart.setOrganPower(30);
		
		eyes.setOrganPower(0);
		eyes.setOrganHealth(Organ.Health.LOWENERGY);

		
		brain.setBrainFocus(Organ.BrainZone.ASLEEP);
		brain.setOrganPower(60);
		eyes.setOrganHealth(Organ.Health.STRAINED);

		
		System.out.println("Slept for " + hours + " hours.");
		printStatus();
		
	}

	@Override
	public void think(int hours) {
		heart.setOrganHealth(Organ.Health.HEALTHY);
		heart.setBpm(70);
		heart.setOrganPower(50);
		
		eyes.setOrganPower(80);
		eyes.setOrganHealth(Organ.Health.STRAINED);
		
		brain.setBrainFocus(Organ.BrainZone.LOGIC);
		brain.setOrganHealth(Organ.Health.STRAINED);
		brain.setOrganPower(100);
		
		System.out.println("Thought for " + hours + " hours.");
		printStatus();
		
	}

	public void printStatus() {
		System.out.println("Heart Status: ");
		System.out.println("BPM= " + heart.getBpm() + " Status= " + heart.getOrganHealth() + " Power= " + heart.getOrganPower());
		System.out.println("Brain Status: ");
		System.out.println("Zone= " + brain.getBrainZone() + " Status= " + brain.getOrganHealth() + " Power= " + brain.getOrganPower());
		System.out.println("Eye Status: ");
		System.out.println("Status= " + eyes.getOrganHealth() + " Power= " + eyes.getOrganPower());
	}
}

