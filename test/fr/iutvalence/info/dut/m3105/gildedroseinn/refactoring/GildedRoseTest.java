package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{

	@Test
	public void decrementQSEverydayBy1()
	{
		saveQandSAndTestUpdatingMethod(15,20,-1,-1, "Moumoute");
	}
	
	@Test
	public void whenSellInIsNegativeQualityDicreaseBy2()
	{

		saveQandSAndTestUpdatingMethod(-1,20,-1,-2, "Moumoute");
	}
	
	@Test
	public void qualityAlwaysPositive()
	{
		saveQandSAndTestUpdatingMethod(-1,0,-1,0, "Moumoute");
	}
	
	@Test
	public void agedBrieQualityIncrease()
	{
		saveQandSAndTestUpdatingMethod(2,0,-1,1, "Aged Brie");
	}
	
	
	
	
	
	

	private void saveQandSAndTestUpdatingMethod(int initialS, int initialQ, int resultS, int resultQ, String itemName) 
	{
		Item testItem = new Item(itemName, initialS, initialQ);
		int firstS= testItem.getSellIn();
		int firstQ= testItem.getQuality();
		GildedRose.updateItem(testItem);
		assertEquals(firstS+resultS, testItem.getSellIn());
		assertEquals(firstQ+resultQ, testItem.getQuality());
	}

}