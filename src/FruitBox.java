import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * Created by YB on 20.01.2016.
 */
public class FruitBox<T extends Fruit> {

    private ArrayList<T> fruitBox;
    private boolean isEmpty;

    FruitBox () {
        fruitBox = new ArrayList<T>();
        isEmpty = true;
    }

    public void addToContainer (T fruit) {
        fruitBox.add(fruit);
        if (fruitBox.size() == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
    }

    public void removeFromContainer (T fruit) {
        fruitBox.remove(fruit);
        if (fruitBox.size() == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void listAllFruitsNames () {
        if (isEmpty == false) {
            for (T fruit : getFruitBox()) {
                System.out.println(fruit.getName().toString());
            }
        } else {
            throw new NoSuchElementException();
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

    public boolean isEmpty() {
        return isEmpty;
    }
}
