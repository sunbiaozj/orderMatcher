package com.ordermatcher.service.rules;


public class SortedItem {

	private IItemModel item;
	private String id;
	
	
	public SortedItem(IItemModel item, String id) {
		this.item = item;
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
	
	public IItemModel getItem(){
		return item;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if (item != null){
			output.append(item.toString());
		}
		
		return output.toString();
	}
	 
	/*

	 */
	public SortedItem clone (){
		
		IItemModel model = getItem().clone();
		
		SortedItem item = new SortedItem(model, getId());
		
		return item;
	}
	
}