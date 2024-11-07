public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for new Animal objects
    public Animal() {
        numOfAnimals++;
    }

    // Create a constructor that will accept all fields as arguments.
    public Animal(String sex, int age, int weight, String animalName,
                  String animalID, String animalBirthDate, String animalColor,
                  String animalOrigin, String animalArrivalDate) {
        // Increment the count of animals
        numOfAnimals++;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthDate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalArrivalDate = animalArrivalDate;
    }

    // Create all attributes (fields) needed for the ZooKeeperChallenge program.
    private String sex; // sex will be 'male' or 'female'
    private int age; // age will be in years
    private int weight; // weight will be in pounds
    private String animalName; // name will be a String
    private String animalID; // animalID: first two latin letters of species name and an integer, e.g., Hy01, Be02
    private String animalBirthDate; // birth date as a String
    private String animalColor; // color as a String
    private String animalOrigin; // origin as a String (e.g., "from Friguia Park, Tunisia")
    private String animalArrivalDate; // system date when the animal object was created

    // Getters and setters
    public String getAnimalOrigin() {
        return animalOrigin;
    }

    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalBirthDate() {
        return animalBirthDate;
    }

    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalArrivalDate() {
        return animalArrivalDate;
    }

    public void setAnimalArrivalDate(String animalArrivalDate) {
        this.animalArrivalDate = animalArrivalDate;
    }
}