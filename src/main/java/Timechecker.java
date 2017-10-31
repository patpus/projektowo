package main.java;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by s426231
 */
public class Timechecker implements Job {

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        Date adate = new Date();
        if((adate.getHours()>=8) && (adate.getHours()<10))
        {
            if(adate.getHours()==9)
            {
                if(adate.getMinutes()<45)
                {
                    System.out.println("Do przerwy pozostało: " + (45-adate.getMinutes()) + "min");
                }
                else
                {
                    System.out.println("Do zajęć pozostało: " + (60-adate.getMinutes()) + "min");
                }
            }
            else
            {
                if((adate.getMinutes()>=15) && (adate.getMinutes()<45))
                {
                    System.out.println("Do przerwy pozostało: 1h " + (45-adate.getMinutes()) + "min");
                }
                else if(adate.getMinutes()==45)
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (105-adate.getMinutes()) + "min");
                }
            }
        }
        else if((adate.getHours()>=10) && (adate.getHours()<12))
        {
            if(adate.getHours()==11)
            {
                if(adate.getMinutes()<30)
                {
                    System.out.println("Do przerwy pozostało: " + (30-adate.getMinutes()) + "min");
                }
                else if((adate.getMinutes()>=30) && (adate.getMinutes()<45))
                {
                    System.out.println("Do zajęć pozostało: " + (45-adate.getMinutes()) + "min");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: 1h " + (75-adate.getMinutes()) + "min");
                }
            }
            else
            {
                if(adate.getMinutes()<30)
                {
                    System.out.println("Do przerwy pozostało: 1h " + (30-adate.getMinutes()) + "min");
                }
                else if(adate.getMinutes()==30)
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (90-adate.getMinutes()) + "min");
                }
            }
        }
        else if((adate.getHours()>=12) && (adate.getHours()<14))
        {
            if(adate.getHours()==13)
            {
                if(adate.getMinutes()<15)
                {
                    System.out.println("Do przerwy pozostało: " + (15-adate.getMinutes()) + "min");
                }
                else if((adate.getMinutes()>=15) && (adate.getMinutes()<45))
                {
                    System.out.println("Do zajęć pozostało: " + (45-adate.getMinutes()) + "min");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: 1h " + (75-adate.getMinutes()) + "min");
                }
            }
            else
            {
                if(adate.getMinutes()<15)
                {
                    System.out.println("Do przerwy pozostało: 1h " + (15-adate.getMinutes()) + "min");
                }
                else if(adate.getMinutes()==15)
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (75-adate.getMinutes()) + "min");
                }
            }
        }
        else if((adate.getHours()>=14) && (adate.getHours()<16))
        {
            if(adate.getHours()==15)
            {
                if(adate.getMinutes()<15)
                {
                    System.out.println("Do przerwy pozostało: " + (15-adate.getMinutes()) + "min");
                }
                else if((adate.getMinutes()>=15) && (adate.getMinutes()<30))
                {
                    System.out.println("Do zajęć pozostało: " + (30-adate.getMinutes()) + "min");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: 1h " + (60-adate.getMinutes()) + "min");
                }
            }
            else
            {
                if(adate.getMinutes()<15)
                {
                    System.out.println("Do przerwy pozostało: 1h " + (15-adate.getMinutes()) + "min");
                }
                else if(adate.getMinutes()==15)
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (75-adate.getMinutes()) + "min");
                }
            }
        }
        else if((adate.getHours()>=16) && (adate.getHours()<18))
        {
            if(adate.getHours()==17)
            {
                if(adate.getMinutes()<15)
                {
                    System.out.println("Do zajęć pozostało: " + (15-adate.getMinutes()) + "min");
                }
                else if((adate.getMinutes()>=15) && (adate.getMinutes()<45))
                {
                    System.out.println("Do przerwy pozostało 1h: " + (45-adate.getMinutes()) + "min");
                }
                else if((adate.getMinutes()==45))
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (105-adate.getMinutes()) + "min");
                }
            }
            else
            {
                if(adate.getMinutes()==0)
                {
                    System.out.println("Do przerwy pozostało: 1h");
                }
                else
                {
                    System.out.println("Do przerwy pozostało: " + (60-adate.getMinutes()) + "min");
                }
            }
        }
        else
        {
            System.out.println("Do przerwy pozostało: " + (45-adate.getMinutes()) + "min");
        }
        //System.out.println("" + adate);
    }
}