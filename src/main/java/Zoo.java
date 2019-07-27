import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Miejsce do oddawania bezdomnych zwierzątek
 */
public class Zoo {
    /**
     * Miejsca dla zwierzątek
     */
    private List<Pet> petPlaces;

    /**
     * Konstruktor
     */
    public Zoo() {
        this.petPlaces = new ArrayList<>();
    }


    private final int defaultLength = 3;

    /**
     * @param pet Zwierzątko które zadomowi się w nowym zoo
     */
    public void giveHomelessPet(Pet pet) {
        if (pet == null) {
            throw new IllegalArgumentException("Nie podawaj niepoprawnych zwierzątek");
        }

        if (pet.getName() == "") {
            throw new IllegalArgumentException("Imie zwierzatka nie moze byc puste");
        }

        if (pet.getName().length() >= defaultLength) {
            this.petPlaces.add(pet);
        }

        throw new IllegalArgumentException("Imie powinno posiadać minimum " + defaultLength + " znaki");
    }

    /**
     * @param pet Zwierzątko zostało wypuszczone na wolność w swoim środowisku naturalnym
     */
    public void takePet(Pet pet){
        this.petPlaces.remove(pet);
    }

    /**
     * @return Zwraca liste wszystkich zwierzątek oddzielonych przecinkami
     */
    public String getPetNames(){
        final StringJoiner petNames = new StringJoiner(", ");

        for (Pet pet:
                petPlaces) {
            petNames.add(pet.getName());
        }

        return petNames.toString();
    }
}
