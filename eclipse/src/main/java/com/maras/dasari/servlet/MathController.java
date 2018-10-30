package com.maras.dasari.servlet;

import com.maras.dasari.model.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MathController {


    public void marshallCustomer(){
        Marshaller marshaller;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(new Customer(3, "Kya bey", "sala"), new FileOutputStream("D:\\Java\\Customer.xml"));

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void unmarshallCustomer(){
        Unmarshaller unmarshaller;
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            unmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) unmarshaller.unmarshal(new FileInputStream("D:\\Java\\Customer.xml"));
            System.out.println("Id : " + customer.getId() + "\nItem : " + customer.getItem() + "\nName : " + customer.getName());
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String args[]){
        MathController mathController = new MathController();
        mathController.marshallCustomer();
        mathController.unmarshallCustomer();
    }
}
