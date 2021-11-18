package Lesson_7.HW7.Task4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class Run {
    public static void main(String[] args) {
        Address address = new Address();
        address.add(new City("Warszawa", "Pl.Constytucji", 3));
        address.add(new City("Moscow", "Prechistenka", 16));

        try {
            File file = new File("src\\Lesson_7\\HW7\\Task4\\cities.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Address.class);
            Marshaller marshaller =jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(address, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
