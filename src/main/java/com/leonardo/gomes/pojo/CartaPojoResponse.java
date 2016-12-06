package com.leonardo.gomes.pojo;

import java.util.List;

public class CartaPojoResponse {
	
	List<CartaPojo> cards;

	public CartaPojoResponse(List<CartaPojo> cards) {
		super();
		this.cards = cards;
	}

	public CartaPojoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<CartaPojo> getCards() {
		return cards;
	}

	public void setCards(List<CartaPojo> cards) {
		this.cards = cards;
	}
	
}
