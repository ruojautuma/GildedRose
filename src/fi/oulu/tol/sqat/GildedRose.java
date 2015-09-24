package fi.oulu.tol.sqat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GildedRose {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new PassItem("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new PassItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new ConjuredItem("Conjured Mana Cake", 3, 6));

        updateQuality();
}


	
    public static void updateQuality()
    {
		Iterator<Item> itemator = items.iterator();
		Item current;
		while(itemator.hasNext()) {
			current = itemator.next();
			System.out.print(current.getName() + " : Quality " + current.getQuality() + " / Sell in " + current.getSellIn() + " -> ");
			current.setSellIn(current.getSellIn()-1);
			current.setQuality(current.getQuality()-1);
			System.out.println("Quality " + current.getQuality() + " / Sell in " + current.getSellIn());
		}
    }

}
