package kubo.saficonnection.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProspectusServiceAspect {

    @Before(value = "execution(* kubo.saficonnection.service.ProspectusService.*(..)) and args(prospectusId, firstName, secondName, zipCode)")
    public void beforeAdviceProspectus(JoinPoint joinPoint, int prospectusId, String firstName, String secondName, String zipCode)
    {
        System.out.println(" before create Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " " + firstName + " " + secondName + " " + zipCode);
    }

    @After(value = "execution(* kubo.saficonnection.service.ProspectusService.*(..)) and args(prospectusId, firstName, secondName, zipCode)")
    public void afterAdviceProspectus(JoinPoint joinPoint, int prospectusId, String firstName, String secondName, String zipCode)
    {
        System.out.println(" after create Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " " + firstName + " " + secondName + " " + zipCode);
    }

    @AfterReturning(value = "execution(* kubo.saficonnection.service.ProspectusService.*(..)) and args(prospectusId, firstName, secondName, zipCode)")
    public void AfterReturningAdviceProspectus(JoinPoint joinPoint, int prospectusId, String firstName, String secondName, String zipCode)
    {
        System.out.println(" AfterReturning create Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " " + firstName + " " + secondName + " " + zipCode);
    }

    @AfterThrowing(value = "execution(* kubo.saficonnection.service.ProspectusService.*(..)) and args(prospectusId, firstName, secondName, zipCode)")
    public void AfterThrowingAdviceProspectus(JoinPoint joinPoint, int prospectusId, String firstName, String secondName, String zipCode)
    {
        System.out.println(" AfterThrowing create Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " " + firstName + " " + secondName + " " + zipCode);
    }

    @Before(value = "execution(* kubo.saficonnection.service.ProspectusService.deleteProspectus(..)) and args(prospectusId)")
    public void beforeAdviceProspectusRemoved(JoinPoint joinPoint, int prospectusId)
    {
        System.out.println(" before delete Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " ");
    }

    /*@Before(value = "execution(* kubo.saficonnection.service.ProspectusService.update*(..)) and args(prospectusId)")
    public void beforeAdviceProspectusUpdate(JoinPoint joinPoint, int prospectusId)
    {
        System.out.println(" before update Prospectus: " + joinPoint.getSignature()  );
        System.out.println(" -- " + prospectusId + " ");
    }*/

    @Pointcut(value= "execution(* kubo.saficonnection.service.ProspectusService.updateProspectus(..) )")
    protected void updateProspectusPointcut(){}

    @Before(value= "updateProspectusPointcut()")
    public void beforeAdviceProspectusUpdate(){
            System.out.println(" before updateProspectus Prospectus: Pointcut "   );
    }


}
