package givenwhenthenjunit;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> stock = new ArrayList<Item>();

    public void sellItem(Item item, Customer customer) {
        // TODO what about if that item is not in stock?
        stock.remove(item);
    }

    public void addItem(Item item) {
        stock.add(item);
    }

    public void returnItem(Item item) {
        stock.add(item);
    }

    public <I extends Item> int countStock(Class<I> itemClass) {
        int count = 0;
        for (Item item : stock) {
            if (item.getClass().equals(itemClass)) {
                count++;
            }

        }
        return count;
    }

    @SuppressWarnings("unchecked")
    public <I extends Item> I get(Class<I> itemClass) {
        for (Item item : stock) {
            if (item.getClass().equals(itemClass)) {
                return (I) item;
            }
        }
        // TODO - return a null or throw an exception
        return null;
    }

    public void replaceItem(Item item, Item replacement) {
        stock.add(item);
        // TODO what it that item is not in stock
        stock.remove(replacement);
    }
}
