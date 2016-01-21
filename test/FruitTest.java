import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by YB on 21.01.2016.
 */

@RunWith(JUnit4.class)

public class FruitTest {

    private FruitBox fruitBox;
    private Apple apple;

    @Before
    public void Init () {
        fruitBox = new FruitBox();
        apple = new Apple();

    }

    @Test
    public void checkFruitBoxIsEmptyByDefault () {
        assertTrue("Fruit Box isn't empty", fruitBox.isEmpty());
    }

    @Test
    public void checkAppleExtendsFruit () {
        assertTrue("Apple isn't instance of Fruit", apple instanceof Fruit);
    }

}
