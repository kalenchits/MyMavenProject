package peopleTests;

import org.junit.Assert;
import org.junit.Test;
import people.ManualEngineer;

public class ManualEngineerTest {

    ManualEngineer manualEngineer = new ManualEngineer(25,10,5);

    @Test
    public void manualEngineerConstructorAgeTest(){
        Assert.assertEquals("ManualEngineer age set in constructor is not correct!",25,manualEngineer.getAge());
    }

    @Test
    public void manualEngineerConstructorSkillTest(){
        Assert.assertEquals("ManualEngineer skill set in constructor is not correct!",10,manualEngineer.getSkill());
    }

    @Test
    public void manualEngineerConstructorExperienceTest(){
        Assert.assertEquals("ManualEngineer experience set in constructor is not correct!",5,manualEngineer.getExperience());
    }

    @Test
    public void manualEngineerSetterAgeTest(){
        manualEngineer.setAge(30);
        Assert.assertEquals("ManualEngineer age set in setter is not correct!",30,manualEngineer.getAge());
    }

    @Test
    public void manualEngineerSetterSkillTest(){
        manualEngineer.setSkill(20);
        Assert.assertEquals("ManualEngineer skill set in setter is not correct!",20,manualEngineer.getSkill());
    }

    @Test
    public void manualEngineerSetterExperienceTest(){
        manualEngineer.setExperience(10);
        Assert.assertEquals("ManualEngineer experience set in setter is not correct!",10,manualEngineer.getExperience());
    }
}
