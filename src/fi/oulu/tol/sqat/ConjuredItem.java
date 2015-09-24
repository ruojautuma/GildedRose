package fi.oulu.tol.sqat;

public final class ConjuredItem extends Item {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.quality = quality;
	}

	@Override
	public void setQuality(int quality) {
		int reduction = this.quality - quality;
		this.quality = this.quality - (reduction*2);
	}	

}
