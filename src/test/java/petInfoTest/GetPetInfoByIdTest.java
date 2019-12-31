package petInfoTest;

import org.testng.annotations.Test;
import petInformation.PetClient;

import java.io.IOException;

public class GetPetInfoByIdTest {

    @Test
    public void verifyPetInfoByID() throws IOException {
        PetClient petClient = new PetClient();
        System.out.printf(petClient.getPetInfoByID().getId());
    }
}
