package com.relacionamentos.onotoono;

import javax.persistence.Persistence;

public class Factory {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("atividadePU");
	}

}
