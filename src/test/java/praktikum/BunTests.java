package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTests {

    private final String name;
    private final float price;
    private Bun bun;


    public BunTests(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Название булочки: {0}, Цена булочки: {1}")
    public static Object[][] getData() {
        return new Object[][] {
                {"Кунжутная булочка", 100},
                {"Карамельная булочка", 200},
                {"Обычная булочка", 300},
                {"Маковая булочка", 0},
                {"Рисовая булочка", -1000},
                {"      ", 400},
                {"", 0},
                {null, -0},
                {"ghdlKJhfywkljdhfnbvhfjdjk kdkgkjggjgfhfhhfhfhfhdjdkkkKKKGE09776kkgkgkfkfkdjdjdhshshshhjd", 100},
                {"!@#$%^&*()", 500},
                {"Просто булочка", 0.10f},
                {"Ещё одна булочка", 2147483647},
        };
    }

    @Test
    public void returnsCorrectName() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals("Wrong bun", name, bun.getName());
        System.out.println("Название булочки: " + bun.getName() + ".");
    }

    @Test
    public void returnsCorrectPrice() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals("Wrong price", price, bun.getPrice(), 0.0f);
        System.out.println("Цена: " + bun.getPrice() + " рублей.");
    }
}