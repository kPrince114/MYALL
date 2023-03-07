package com.masai.Q3.Dao;

import com.masai.Q3.bean.Courier;

//- **Get the information of any particular Shipment by id**
//- **Create a new Shipment**
//- **Delete Shipment by ID**
//- **Update Shipment by ID by changing the `content`, `content,` and `recipient address`**
public interface interfaceAll {
	public Courier getInfById(int id);
	public String createnewShipment(Courier c);
	public String deletecou(int id);
	public String updateCou(int id,String content, String address);
}
