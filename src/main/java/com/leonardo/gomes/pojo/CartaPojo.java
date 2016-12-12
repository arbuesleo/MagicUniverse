package com.leonardo.gomes.pojo;

import java.util.List;

public class CartaPojo {	
	String name;
	String manaCost;
	String cmc;
	String type;
	List<String> colors;
	List<String> colorIdentity;
	List<String> types;
	List<String> subtypes;
	String rarity;
	String set;
	String setName;
	String text;
	String flavor;
	String artist;
	Integer number;
	String layout;
	String power;
	String toughness;
	Integer multiverseid;
	String imageUrl;
	List<RulingPojo> rulings;
	List<ForeignNamePojo> foreignNames;
	List<String> printings;
	String originalText;
	String originalType;
	List<LegalitiesPojo> legalities;
	String id;
	
	public CartaPojo(String name, String manaCost, String cmc, String type, List<String> types, List<String> subtypes,
			String rarity, String set, String setName, String text, String flavor, String artist, Integer number,
			String layout, String power, String toughness, Integer multiverseid, String imageUrl,
			List<RulingPojo> rulings, List<ForeignNamePojo> foreignNames, List<String> printings, String originalText,
			String originalType, List<LegalitiesPojo> legalities, String id) {
		super();
		this.name = name;
		this.manaCost = manaCost;
		this.cmc = cmc;
		this.type = type;
		this.types = types;
		this.subtypes = subtypes;
		this.rarity = rarity;
		this.set = set;
		this.setName = setName;
		this.text = text;
		this.flavor = flavor;
		this.artist = artist;
		this.number = number;
		this.layout = layout;
		this.power = power;
		this.toughness = toughness;
		this.multiverseid = multiverseid;
		this.imageUrl = imageUrl;
		this.rulings = rulings;
		this.foreignNames = foreignNames;
		this.printings = printings;
		this.originalText = originalText;
		this.originalType = originalType;
		this.legalities = legalities;
		this.id = id;
	}
	public CartaPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManaCost() {
		return manaCost;
	}
	public void setManaCost(String manaCost) {
		this.manaCost = manaCost;
	}
	public String getCmc() {
		return cmc;
	}
	public void setCmc(String cmc) {
		this.cmc = cmc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public List<String> getSubtypes() {
		return subtypes;
	}
	public void setSubtypes(List<String> subtypes) {
		this.subtypes = subtypes;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public Integer getMultiverseid() {
		return multiverseid;
	}
	public void setMultiverseid(Integer multiverseid) {
		this.multiverseid = multiverseid;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<RulingPojo> getRulings() {
		return rulings;
	}
	public void setRulings(List<RulingPojo> rulings) {
		this.rulings = rulings;
	}
	public List<ForeignNamePojo> getForeignNames() {		
		return foreignNames;
	}
	public void setForeignNames(List<ForeignNamePojo> foreignNames) {
		this.foreignNames = foreignNames;
	}
	public List<String> getPrintings() {
		return printings;
	}
	public void setPrintings(List<String> printings) {
		this.printings = printings;
	}
	public String getOriginalText() {
		return originalText;
	}
	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}
	public String getOriginalType() {
		return originalType;
	}
	public void setOriginalType(String originalType) {
		this.originalType = originalType;
	}
	public List<LegalitiesPojo> getLegalities() {
		return legalities;
	}
	public void setLegalities(List<LegalitiesPojo> legalities) {
		this.legalities = legalities;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getToughness() {
		return toughness;
	}
	public void setToughness(String toughness) {
		this.toughness = toughness;
	}
	
	
}
