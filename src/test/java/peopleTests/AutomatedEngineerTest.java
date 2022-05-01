package peopleTests;

import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;

public class AutomatedEngineerTest {

    AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,15,5);

    @Test
    public void automatedEngineerConstructorAgeTest(){
        Assert.assertEquals("ManualEngineer age set in constructor is not correct!",25,automatedEngineer.getAge());
    }

    @Test
    public void automatedEngineerConstructorSkillTest(){
        Assert.assertEquals("ManualEngineer skill set in constructor is not correct!",15,automatedEngineer.getSkill());
    }

    @Test
    public void automatedEngineerConstructorExperienceTest(){
        Assert.assertEquals("ManualEngineer experience set in constructor is not correct!",5,automatedEngineer.getExperience());
    }

    @Test
    public void automatedEngineerSetterAgeTest(){
        automatedEngineer.setAge(30);
        Assert.assertEquals("ManualEngineer age set in setter is not correct!",30,automatedEngineer.getAge());
    }

    @Test
    public void manualEngineerSetterSkillTest(){
        automatedEngineer.setSkill(20);
        Assert.assertEquals("ManualEngineer skill set in setter is not correct!",20,automatedEngineer.getSkill());
    }

    @Test
    public void manualEngineerSetterExperienceTest(){
        automatedEngineer.setExperience(10);
        Assert.assertEquals("ManualEngineer experience set in setter is not correct!",10,automatedEngineer.getExperience());
    }
}
