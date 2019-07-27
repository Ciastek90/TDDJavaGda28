/**
 * Klasa główna
 */
public class Main {
    /**
     * @param args Argumnety które są dostarczane z wywołania konsoli
     */
    public static void main(String[] args) {
        Pet pet = new PetBuilder()
                .setName("tofik")
                .setWeight(10)
                .setHeight(15)
                .setName("fafik")
                .setAge(10)
        .build();


    }
}
