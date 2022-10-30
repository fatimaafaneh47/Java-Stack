package myzoo;

public class Bat extends Mammal {
	int energyLevel =300;
	public void fly(String fly) {
		energyLevel  -=50;
		System.out.println("Bat has fly away , energy level decreased by "+energyLevel  );
	}
	public void eatHumans(String human) {
		energyLevel +=25;
		System.out.println("Bat ate a human "+energyLevel);
	
	}
	public void attackTown(String attack) {
		energyLevel -=100;
		System.out.println("the town on fire energy level decreased by"+energyLevel);
	}
	}	
	

;