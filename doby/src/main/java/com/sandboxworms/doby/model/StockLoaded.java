package com.sandboxworms.doby.model;

public class StockLoaded {
	
	private DefaultOHLCDataset dataset;
	private DateInterval intervalIncluded;
	private Stock stock;
	
	public DefaultOHLCDataset getDataset() {
		return dataset;
	}
	public void setDataset(DefaultOHLCDataset dataset) {
		this.dataset = dataset;
	}
	public DateInterval getIntervalIncluded() {
		return intervalIncluded;
	}
	public void setIntervalIncluded(DateInterval intervalIncluded) {
		this.intervalIncluded = intervalIncluded;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
}
