/**
 * class to define a cow
 * @author Leon Chiang
 * @version 1.0.0
 */

class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructor for student
     * @param name Name of the cow
     * @param age Age of the cow
     * @param weight Weight of the cow
     */

    public Cow (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Gets the name of the cow
     * @return Name of the cow
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the cow
     * @return Age of the cow
     */

    public int getAge() {
        return this.age;
    }

    /**
     * Gets the weight of the cow
     * @return Weight of the cow
     */

    public double getWeight() {
        return this.weight;
    }

    /**
     * Overrides the toString method, outputs the name, age and weight of a cow
     * @return Features defining a cow as a String
     */

    @Override
    public String toString() {
        return this.name + ", " + this.age +" - " + this.weight;
    }
    
    /**
     * Overrides the equals method, checks if the weight of two cars are equal
     * @return True if the weights are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cow)) {
            return false;
        }
        Cow cow = (Cow) obj;
        return cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight;
    }
}
