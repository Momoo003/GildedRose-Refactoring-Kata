package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    // Add tests for normal items

    @Test
    void normalItemDecreasesInQualityAndSellIn() {
        Item[] items = { new Item("Normal Item", 10, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(19, items[0].quality);
    }

    @Test
    void qualityNeverNegative() {
        Item[] items = { new Item("Normal Item", 5, 0) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    void expiredItemDegradesTwiceAsFast() {
        Item[] items = { new Item("Normal Item", 0, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(8, items[0].quality);
    }

    // Add tests for Aged Brie

    @Test
    void agedBrieIncreasesInQuality() {
        Item[] items = { new Item("Aged Brie", 10, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, items[0].quality);
    }

    @Test
    void agedBrieNeverAbove50() {
        Item[] items = { new Item("Aged Brie", 10, 50) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, items[0].quality);
    }

    // Add tests for Sulfuras

    @Test
    void sulfurasNeverChanges() {
        Item[] items = {
            new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

}
