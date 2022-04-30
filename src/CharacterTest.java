import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void takeDamageTest(){
        Hero h = new Hero(10,"testChar", 5);
        h.takeDamage(4);
        Assertions.assertEquals(6,h.health);
    }
}
