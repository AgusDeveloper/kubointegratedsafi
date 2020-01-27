package kubo.saficonnection.restservice;

import java.util.concurrent.atomic.AtomicLong;

import kubo.saficonnection.model.Prospectus;
import kubo.saficonnection.service.ProspectusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegratedSafiController {

    @Autowired
    protected ProspectusService  prospectusService;

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/prospectus")
    public Prospectus prospectus(@RequestParam(value = "firstName", defaultValue = "Tito") String firstName,
                                 @RequestParam(value = "secondName") String secondName,
                                 @RequestParam(value = "zipCode") String zipCode
                                 ) {

        return prospectusService.createProspectus((int)counter.incrementAndGet(),
                String.format(template, firstName),
                secondName,
                zipCode );

    }

    @GetMapping("/prospectus/removed")
    public Prospectus prospectusRemoved(@RequestParam(value = "id") int id)
    {
        Prospectus prospectus = prospectusService.deleteProspectus(id);
        return prospectus;
    }

    @GetMapping("/prospectus/update")
    public Prospectus prospectusUpdate(@RequestParam(value = "id") int id)
    {
        Prospectus prospectus = prospectusService.updateProspectus(id);
        return prospectus;
    }


}