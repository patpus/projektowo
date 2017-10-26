package main.java;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Patryk on 2017-10-25.
 */
public class Zapis {
    public Zapis() throws FileNotFoundException{}
    PrintWriter odpowiedzi = new PrintWriter("odp.txt");
    public ArrayList<String> querybase = new ArrayList();
    private String lokalizacja = "odp.txt";

    public void Zapis() {
        for(int i=0;i<querybase.size();i+=2) {
            odpowiedzi.println("Zadanie " + querybase.get(i));
            odpowiedzi.println(querybase.get(i+1));
        }
    }
    public void closefile() {odpowiedzi.close();}
    public void add(String exercise,String query){
        if(querybase.isEmpty())
        {
            querybase.add(exercise);
            querybase.add(query);
        }
        else
        {
            for(int i=0;i<querybase.size();i+=2)
            {
                int q = Integer.parseInt(querybase.get(i));
                int e = Integer.parseInt(exercise);
                if(q==e)
                {
                    querybase.remove(i+1);
                    querybase.add(i+1,query);
                    i=querybase.size();
                }
                else if(q>e)
                {
                    if(i-2<0)
                    {
                        querybase.add(0,exercise);
                        querybase.add(1,query);
                        i=querybase.size();
                    }
                    else
                    {
                        int x=Integer.parseInt(querybase.get(i-2));
                        if(x<e)
                        {
                            querybase.add(i,exercise);
                            querybase.add(i+1,query);
                            i=querybase.size();
                        }
                    }
                }
                else if(q<e)
                {
                    if(i+2>=querybase.size())
                    {
                        querybase.add(exercise);
                        querybase.add(query);
                        i=querybase.size();
                    }
                    else
                    {
                        int x=Integer.parseInt(querybase.get(i+2));
                        if(x>e)
                        {
                            querybase.add(i+2,exercise);
                            querybase.add(i+3,query);
                            i=querybase.size();
                        }
                    }
                }
            }
        }
    }
}
