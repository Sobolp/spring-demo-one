package com.example.springdemoone.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

/*
    public TennisCoach() {
        System.out.println(">>TennisCoach: inside default constructor");
    }
*/
/*
    @Autowired
    public void doSomeCrazyStaff(FortuneService fortuneService) {
        System.out.println(">>TennisCoach: inside doSomeCrazyStaff method");
        this.fortuneService = fortuneService;
    }
*/

/*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>TennisCoach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }
*/

/*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    @PreDestroy
    public void  doMyCleanupStuff() {
        System.out.println("TennisCoach: inside method doMyCleanupStuff");
    }


}
