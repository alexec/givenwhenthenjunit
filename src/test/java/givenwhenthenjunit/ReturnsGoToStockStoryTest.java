package givenwhenthenjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
        // Given that a customer buys a blue garment
        // And I have two blue garments in stock
        // And three black garments in stock.
        // When he returns the garment for a replacement in black,
        // Then I should have three blue garments in stock
        // And two black garments in stock
        fail();
    }
}