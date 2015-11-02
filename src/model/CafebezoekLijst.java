package model;

import java.util.ArrayList;

/**
 * @Autor: Isaak Malik, Michal Mytkowski
 * @Team: Team29
 * @Date: 25/10/2015
 * @Project: KroegenTocht
 * @Purpose: Lijst van cafébezoeken met alle gegevens
 */
public class CafebezoekLijst {

	protected static ArrayList<Cafebezoek> cafebezoeken = new ArrayList<>();
	
	/**
	 * 
	 * @param cafebezoek
	 */
	public static void toevoegen(Cafebezoek cafebezoek)
	{
		cafebezoeken.add(cafebezoek);
	}
	
	/**
	 * Onder anderen voor de JUnit testen
	 * 
	 * @return
	 */
	public static ArrayList<Cafebezoek> getCafebezoeken()
	{
		return cafebezoeken;
	}
}
