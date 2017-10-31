import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.Timechecker;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Patryk on 2017-10-25.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, SchedulerException {
        Scheduler tc = StdSchedulerFactory.getDefaultScheduler();
        JobDetail job2 = JobBuilder.newJob(Timechecker.class).build();
        Trigger time = TriggerBuilder.newTrigger().withIdentity("CTrigger").withSchedule(CronScheduleBuilder.cronSchedule("0 * 8-19 ? * MON,TUE,WED,THU,FRI")).build();
        checksql checksql = new checksql();
        int czyZakonczyc = 1;
        Zapis zapis = new Zapis();
        tc.scheduleJob(job2, time);
        tc.start();
        while (czyZakonczyc != 0) {
        System.out.println("Numer zadania:");
            BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
            String number = null;
            try {
                number = num.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        // zapisuje numer zadania
        // System.out.print(number);
        //
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Kwerenda SQL: ");
            String formule = null;
            try {
                formule = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (checksql.checksql(formule)) {
                zapis.add(number, formule);
            }
            else {
                System.out.print("BLAD!");
                zapis.add("","");
                zapis.closefile();
            };
            // usuwa numer zadania zapisuje stringa z formule, why?
            System.out.print("0 to EXIT\n1 to CONTINUE\n");
            Scanner odczyt = new Scanner(System.in);
            czyZakonczyc= odczyt.nextInt();
        }
        zapis.Zapis();
        zapis.closefile();
    }
}