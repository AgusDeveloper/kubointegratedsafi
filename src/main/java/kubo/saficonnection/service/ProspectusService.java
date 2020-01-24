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

}
