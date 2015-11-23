package com.lyricaloriginal.processoruser;

import processoruser.ItemFactory;


public class Main {

	public static void main(String[] args) {
		Item item = ItemFactory.create("taro", "これは猫です。");
		System.out.println(item.getName());
		System.out.println(item.getDesc());
	}
}
