import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.zip.ZipOutputStream;

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

    @Test
    public void getPetNames_removeNotPresentElement_EmptyString(){
        final String expected = "";
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        zoo.takePet(pet);

        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPetNames_AddTwoElementsRemoveTree_StringEmpty(){
        final String expected = "";
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        pet.setName("Fafik");
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);
        zoo.takePet(pet);
        zoo.takePet(pet);
        zoo.takePet(pet);

        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected,actual);
    }

    @Ignore
    @Test
    public void testWithTrue(){
        final Zoo zoo1 = new Zoo();
        final Zoo zoo2 = new Zoo();

        Assert.assertTrue(ZooEquals(zoo1,zoo2));
    }

    private boolean ZooEquals(Zoo left, Zoo right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        //porónuje wszystkie pola po koleii
        return left.equals(right);
    }
}
