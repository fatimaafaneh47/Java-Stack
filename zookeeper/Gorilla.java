package zookeeper;

class Gorilla extends Mammal{
	
		public void throwSomething(String object) {
			energyLevel  -=5;
			System.out.println("Gorilla has thrown something and his energy level decreased by "+energyLevel  );
		}
		public void eatBananas(String object) {
			energyLevel +=10;
			System.out.println("Gorilla is satisfied"+energyLevel);
		
		}
		public void climb(String object) {
			energyLevel -=10;
			System.out.println("Gorilla has climbed a tree and his energy level decreased by"+energyLevel);
		}
		}	


