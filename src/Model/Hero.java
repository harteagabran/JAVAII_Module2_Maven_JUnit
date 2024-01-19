package Model;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Jan 18, 2024
 */
public class Hero {
	private String name;
	private int age;
	private int strength;
	private int dexterity;
	private int health;
	private int max;
	
	public Hero() {
		name = "Emphraim";
		age = 36;
		strength = 16;
		dexterity = 20;
		health = 60;
		max = 60;
	}
	
	public Hero(String name) {
		this.name = name;
		age = 36;
		strength = 16;
		dexterity = 20;
		health = 60;
		max = 60;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}
	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		if(health > this.max) {
			this.health = this.max;
		} else {
			this.health = health;
		}
	}
	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
		this.health = max;
	}

	public boolean isDown() {
		if(this.health <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
