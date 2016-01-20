/**
 * Created by YB on 20.01.2016.
 */
public class Demo {

    public static void main(String[] args) {

        Apple goldApple = new Apple();
        Apple greenApple = new Apple();
        Lemon lemon = new Lemon();
        Orange sourOrange = new Orange();
        Orange sugarOrange = new Orange();

        goldApple.setColor("Yellow");
        goldApple.setName("Golden");
        goldApple.setShape("Round");
        goldApple.setTaste("Sweet");

        greenApple.setColor("Green");
        greenApple.setName("Semirenko");
        greenApple.setShape("Round");
        greenApple.setTaste("Sweet and sour");

        lemon.setColor("Yellow");
        lemon.setName("Lemo");
        lemon.setShape("Oval");
        lemon.setTaste("Extra sour");

        sourOrange.setColor("Yellow-Orange");
        sourOrange.setName("Mandarin");
        sourOrange.setShape("Round");
        sourOrange.setTaste("Sweet and sour");

        sugarOrange.setColor("Red-Orange");
        sugarOrange.setName("Klementin");
        sugarOrange.setShape("Round");
        sugarOrange.setTaste("Extra sweet");

        FruitBox fruitBox = new FruitBox();

        fruitBox.addToContainer(greenApple);
        fruitBox.addToContainer(lemon);
        fruitBox.addToContainer(goldApple);
        fruitBox.addToContainer(sourOrange);
        fruitBox.addToContainer(sugarOrange);

        System.out.println("==========BEFORE SORT======");

        fruitBox.listAllFruitsNames();

        fruitBox.sortByName();

        System.out.println("==========SORT===========");

        fruitBox.listAllFruitsNames();

    }
}
