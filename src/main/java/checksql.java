package main.java;

/**
 * Created by Patryk on 2017-10-25.
 */
public class checksql {

    String result = "";

    public boolean checksql(String formule) {
        result = formule.toUpperCase();
        // System.out.println(result);

        int[] array = new int[4];
        String strZnajdz = result;
        int intIndeks = strZnajdz.indexOf("SELECT");
        array[0] = intIndeks;
        // System.out.println(array[0]);
        intIndeks = strZnajdz.indexOf("FROM");
        array[1] = intIndeks;
        // System.out.println(array[1]);
        intIndeks = strZnajdz.indexOf("WHERE");
        array[2] = intIndeks;
        //System.out.println(array[2]);
        intIndeks = strZnajdz.indexOf("ORDER BY");
        array[3] = intIndeks;
        //1System.out.println(array[3]);

        if (array[0] == array[1]) {

            array[1] = array[0] + 1;
        } else if (array[1] == array[2]) {
            array[1] = array[0] + 1;
            array[2] = array[1] + 1;
        } else if (array[2] == array[3]) {
            array[2] = array[1] + 1;
            array[3] = array[2] + 1;
        }

//        for(int i=0; i<5; i++)
//        {
//            System.out.println(array[i]);
//        }

        if (array[0] > array[1] || array[1] > array[2] || array[2] > array[3]) return false;
        else if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) return true;
        return false;
    }
}
