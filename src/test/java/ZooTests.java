import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ZooTests {

    @Test
    public void getPetNames_AddOneFafik_Fafik(){
        final String expected = "Fafik";
        final Pet pet = new Pet();
        pet.setName("Fafik");
        final Zoo zoo = new Zoo();
        zoo.giveHomelessPet(pet);

        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected,actual);
    }

    @Ignore
    @Test(expected = NullPointerException.class)
    public void getPetNames_nullPet_NullPointerException(){
        final Zoo zoo = new Zoo();
        final Pet nullPet = null;
        zoo.giveHomelessPet(nullPet);

        zoo.getPetNames();
    }

    @Test(expected = IllegalArgumentException.class)
    public void giveHomelessPet_null_IllegalArgumentException(){
        final Zoo zoo = new Zoo();
        final Pet pullpet= null;

        zoo.giveHomelessPet(pullpet);
    }

    @Ignore
    @Test
    public void getPetNames_petWithoutName_EmptyString(){
        final String expected = "";
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        pet.setName("");
        zoo.giveHomelessPet(pet);

        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected, actual);
        //Assert.assertEquals(expected.length(),actual.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPetNames_petWithoutName_IllegalArgumentException(){
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        pet.setName("");
        zoo.giveHomelessPet(pet);

        zoo.getPetNames();
    }
}
