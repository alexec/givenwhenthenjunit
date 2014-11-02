package givenwhenthenjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * In order to keep track of stock
 * As a store owner
 * I want to add items back to stock when they're returned
 */
public class ReturnsGoToStockStoryTest {

    @Test
    public void refundedItemsShouldBeReturnedToStock() {

        Inventory inventory = new Inventory();

        // Given a customer previously bought a black sweater from me
        BlackSweater blackSweater = new BlackSweater();
        inventory.sellItem(blackSweater, new Customer());

        // And I currently have three black sweaters left in stock
        inventory.addItem(new BlackSweater());
        inventory.addItem(new BlackSweater());
        inventory.addItem(new BlackSweater());

        // When he returns the sweater for a refund
        inventory.returnItem(blackSweater);

        // Then I should have four black sweaters in stock
        assertEquals(4, inventory.countStock(BlackSweater.class));
    }

    @Test
    public void replacedItemsShouldBeReturnedToStock() {

        Inventory inventory = new Inventory();

        // Given that a customer buys a blue garment
        BlueGarment blueGarment = new BlueGarment();
        inventory.sellItem(blueGarment, new Customer());

        // And I have two blue garments in stock
        inventory.addItem(new BlueGarment());
        inventory.addItem(new BlueGarment());

        // And three black garments in stock.
        inventory.addItem(new BlackGarment());
        inventory.addItem(new BlackGarment());
        inventory.addItem(new BlackGarment());

        // When he returns the garment for a replacement in black,
        inventory.replaceItem(blueGarment, inventory.get(BlackGarment.class));

        // Then I should have three blue garments in stock
        assertEquals(3, inventory.countStock(BlueGarment.class));

        // And two black garments in stock
        assertEquals(2, inventory.countStock(BlueGarment.class));
    }
}