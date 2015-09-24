package fi.oulu.tol.sqat;

public final class LegendaryItem extends Item {
	private final byte quality;
	private final int sellIn = Integer.MAX_VALUE;
	
	public LegendaryItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.quality = (byte)quality;
	}

	@Override
	public int getQuality() {
		return (this.quality & 0xFF);
	}

	@Override
	public void setQuality(int quality) {
		//NOP
	}

	@Override
	public int getSellIn() {
		return this.sellIn;
	}

	@Override
	public void setSellIn(int sellIn) {
		//NOP
	}
	
	
}
