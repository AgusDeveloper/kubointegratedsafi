package kubo.saficonnection.service;

import kubo.saficonnection.model.Prospectus;
import org.springframework.stereotype.Service;

@Service
public class ProspectusService {

    public Prospectus createProspectus(int prospectusId, String firstName, String secondName, String zipCode)
    {

        Prospectus  pro = new Prospectus();
        pro.setProspectusId(prospectusId);
        pro.setFirstName(firstName);
        pro.setSecondName(secondName);
        pro.setZipCode(Integer.parseInt(zipCode));
        return pro;
    }

    public Prospectus deleteProspectus(int prospectusId)
    {
        Prospectus pro = new Prospectus();
        pro.setProspectusId(prospectusId);
        pro.setFirstName("Dummy Name");
        pro.setSecondName("Dummy Second Name");
        pro.setZipCode(55100);
        return pro;
    }

    public Prospectus updateProspectus(int prospectusId)
    {
        Prospectus pro = new Prospectus();
        pro.setProspectusId(prospectusId);
        pro.setFirstName("Dummy Name Update");
        pro.setSecondName("Dummy Second Name Update");
        pro.setZipCode(55100);
        return pro;
    }

}
