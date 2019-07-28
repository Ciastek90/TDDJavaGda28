import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class MocksTests {
    @Test
    public void verify_callAddCallClear_WasCalled(){
        List mock = mock(List.class);
        List listReal = new ArrayList();

        mock.add("one");
        listReal.add("one");
        mock.clear();
        listReal.clear();

        verify(mock).add("one");
        verify(mock).clear();
    }

    @Test
    public void getPetNames_giveOnePetWithNameFafik_Fafik(){
        final String expected = "Fafik";
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);
        when(pet.getName()).thenReturn("Fafik");
        pet.setName("Fafik");
        zoo.giveHomelessPet(pet);

        final String actual = zoo.getPetNames();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void getPetNames_giveOnePetWithNamePullpet_Pullpet(){
        final String expected = "Pullpet";
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);

        when(pet.getName()).thenReturn("Pullpet");
        pet.setName("Tofik");

        zoo.giveHomelessPet(pet);
        final String actual = zoo.getPetNames();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void getPetNames_giveTwoPetsWithMockedNamesFafikTofik_Fafik_Tofik()
    {
        final String expected = "Fafik, Tofik";
        final Zoo zoo = new Zoo();
        final Pet fafikMock = mock(Pet.class);
        final Pet tofikMock = mock(Pet.class);
        when(fafikMock.getName()).thenReturn("Fafik");
        when(tofikMock.getName()).thenReturn("Tofik");
        zoo.giveHomelessPet(fafikMock);
        zoo.giveHomelessPet(tofikMock);

        final String actual = zoo.getPetNames();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void getPetNames_giveTwoPetsUsingOneMockFafkiTofik_Fafkik_Tofik(){
        final String expected = "Fafik, Tofik";
        final Zoo zoo = new Zoo();
        final Pet mock = mock(Pet.class);
        when(mock.getName())
                //giveHome lessPet
                .thenReturn("Fafik").thenReturn("Fafik").thenReturn("Fafik")
                //givHomelessPet
                .thenReturn("Tofik").thenReturn("Tofik").thenReturn("Tofik")
                //getPetNames
                .thenReturn("Fafik")
                //getPetNames
                .thenReturn("Tofik");
        zoo.giveHomelessPet(mock);
        zoo.giveHomelessPet(mock);

        final String actual = zoo.getPetNames();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void update(){
        final Controller controller = mock(Controller.class);
        final Game game = new Game(controller);
        when(controller.getIndexPressedButton()).thenReturn(1);

        game.update();
    }

    @Test
    public void getPetNames_giveNinePets_verifyCallGetName() {
        final int expectedCallCount = 12;
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);
        when(pet.getName()).thenReturn("Fafik");
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);

        zoo.getPetNames();

        verify(pet, times(expectedCallCount)).getName();
    }

    @Test
    public void getPetNames_giveTreePets_verifyNotCallSetName(){
        final Zoo zoo = new Zoo();
        final Pet pet = mock(Pet.class);
        when(pet.getName()).thenReturn("Fafik");
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);

        zoo.getPetNames();

        verify(pet, never()).setName("sadasd");
    }

    @Ignore
    @Test
    public void anyParameter(){
        final Zoo zoo = mock(Zoo.class);
        when(zoo.giveHomelessPet(any(Pet.class))).thenReturn(0);

        verify(zoo).giveHomelessPet(any());
    }
}
