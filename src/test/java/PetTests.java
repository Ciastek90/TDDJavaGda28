import org.junit.Test;

public class PetTests {
    @Test(expected = IllegalArgumentException.class)
    public void setName_emptyName_IllegalArgumentException(){
        final Pet pet = new Pet();

        pet.setName("");
    }
}
