import java.util.ArrayList;

/**
 * Created by YB on 20.01.2016.
 */
public class FruitBox<T extends Fruit> {

    private ArrayList<T> fruitBox;

    FruitBox () {
        fruitBox = new ArrayList<T>();
    }

    public void addToContainer (T fruit) {
        fruitBox.add(fruit);
    }

    public void removeFromContainer (T fruit) {
        fruitBox.remove(fruit);
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }
}
