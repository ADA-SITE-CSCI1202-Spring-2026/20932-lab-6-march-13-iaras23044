public class Animal {
    private String animalName;
    private String ownerName;
    private int age;

    public Animal(String animalName, String ownerName, int age) {
        if (age < 0){
            throw new InvalidAmountException("Age is not valid");
        }

        this.animalName = animalName;
        this.ownerName = ownerName;
        this.age = age;
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    
    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnername(String ownerName){
        this.ownerName = ownerName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
     public String toString() {
        return animalName + " " + ownerName + " " + age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Animal a = (Animal) obj;

        return animalName.equals(a.animalName)
                && ownerName.equals(a.ownerName)
                && age == a.age;
    }
}
