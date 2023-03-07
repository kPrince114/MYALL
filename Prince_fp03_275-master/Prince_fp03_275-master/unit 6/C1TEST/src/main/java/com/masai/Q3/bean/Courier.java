package com.masai.Q3.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//shipmentId : 101,
//packageNumber: "BD5678768",
//content: "Vegetable Basket",
//weight: 4.5,  [In Kg]
//senderAddress: "K 28, Green Park Extn, New Delhi",
//recipientAddress: "Akshya Nagar 1st Block, Rammurthy nagar, Bangalore",
//created_timestamp : 2019-12-11 10:58:37. [use current time stamp]
@Entity
public class Courier {
	@Id
	private int id;
	private String packageNumber;
	private String content;
	private double weight;
	private String senderAddress;
	private String recipientAddress;
	private String created_timestamp;
	public Courier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courier(int id, String packageNumber, String content, double weight, String senderAddress,
			String recipientAddress, String created_timestamp) {
		super();
		this.id = id;
		this.packageNumber = packageNumber;
		this.content = content;
		this.weight = weight;
		this.senderAddress = senderAddress;
		this.recipientAddress = recipientAddress;
		this.created_timestamp = created_timestamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackageNumber() {
		return packageNumber;
	}
	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(String created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	@Override
	public String toString() {
		return "Courier [id=" + id + ", packageNumber=" + packageNumber + ", content=" + content + ", weight=" + weight
				+ ", senderAddress=" + senderAddress + ", recipientAddress=" + recipientAddress + ", created_timestamp="
				+ created_timestamp + "]";
	}
	
}
