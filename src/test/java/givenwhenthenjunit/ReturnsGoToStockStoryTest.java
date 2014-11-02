package givenwhenthenjunit;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * In order to keep track of stock
 * As a store owner
 * I want to add items back to stock when they're returned
 */
public class ReturnsGoToStockStoryTest {

    @Test
    public void refundedItemsShouldBeReturnedToStock() {
        // Given a customer previously bought a black sweater from me
        // And I currently have three black sweaters left in stock
        // When he returns the sweater for a refund
        // Then I should have four black sweaters in stock
        fail();
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