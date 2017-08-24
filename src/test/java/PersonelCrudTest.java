import com.ekocbiyik.model.Address;
import com.ekocbiyik.model.Course;
import com.ekocbiyik.model.Personel;
import com.ekocbiyik.model.Vehicle;
import com.ekocbiyik.repository.service.IAddressService;
import com.ekocbiyik.repository.service.IPersonelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by enbiya on 22.08.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-config.xml"})
public class PersonelCrudTest {


    @Autowired
    private IPersonelService service;

    @Autowired
    private IAddressService addressService;

    @Test
    public void crudTest() {

        Address address = new Address();
        address.setCity("Trabzon");
        address.setStreet("1.cadde");

        Course course = new Course();
        course.setCourseName("Ingilizce");

        //** personel1
        Personel p1 = new Personel();
        p1.setUsername("personel1");
        p1.setPassword("123456");

        Vehicle v = new Vehicle();
        v.setVehicleName("Car1");
        p1.getVehicle().add(v);

        p1.setAddress(address);
        p1.getCourses().add(course);
        service.save(p1);

        //** persoel2
        Personel p2 = new Personel();
        p2.setUsername("personel1");
        p2.setPassword("123456");

        Vehicle v2 = new Vehicle();
        v2.setVehicleName("Car1");
//        p2.getVehicle().add(v2);

        p2.setAddress(address);
        p2.getCourses().add(course);
//        service.save(p2);

        List<Personel> allPersonels = service.getAllPersonels();
        for (Personel personel : allPersonels) {

            System.out.println("username: " + personel.getUsername());
//            System.out.println("vehicle: " + personel.getVehicle().get(0).getVehicleName());
            System.out.println("address: " + personel.getAddress().getStreet() + " - " + personel.getAddress().getCity());
            System.out.println("\n");
        }

    }


}
