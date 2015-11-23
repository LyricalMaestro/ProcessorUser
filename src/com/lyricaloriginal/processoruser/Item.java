package com.lyricaloriginal.processoruser;

import com.lyricaloriginal.processorprovider.TargetClass;
import com.lyricaloriginal.processorprovider.TargetField;


@TargetClass
public class Item {


	@TargetField
	private String _name;

	@TargetField
	private String _desc;

	public Item(String name, String desc){
		_name = name;
		_desc = desc;
	}
	
	public String getName(){
		return _name;
	}
	
	public String getDesc(){
		return _desc;
	}
}
