package com.maras.dasari.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

    private Integer id = 1;
    private String name = "Hari";
    private String item = "Phone";

    public Customer(){

    }

    public Customer(Integer id, String name, String item){
        this.id=id;
        this.name=name;
        this.item=item;
    }
    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
