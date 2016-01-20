import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void listAllFruitsNames () {
        for (T fruit : getFruitBox()) {
            System.out.println(fruit.getName().toString());
        }
    }

    public void sortByName () {
        Collections.sort(getFruitBox(), compareNames);
    }

    public Comparator<T> compareNames = new Comparator<T>() {

        public int compare(Fruit f1, Fruit f2) {

            String name1 = f1.getName();
            String name2 = f2.getName();

            return name1.compareTo(name2);

        }};

}
