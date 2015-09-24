package fi.oulu.tol.sqat;

public final class PassItem extends Item {

	public PassItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.quality = quality;
	}

	@Override
	public void setQuality(int quality) {
		if(this.getSellIn() <= 5) {
			this.quality += 3;
		} else if(this.getSellIn() <= 10) {
			this.quality += 2;
		} else if(this.getSellIn() < 0) {
			this.quality = 0;
		} else {
			this.quality++;
		}
		if(this.quality >= 50) {
			this.quality = 50;
		}
	}
	
}
