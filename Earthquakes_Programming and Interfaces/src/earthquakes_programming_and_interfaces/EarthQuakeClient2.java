package earthquakes_programming_and_interfaces;

import java.util.*;
import edu.duke.*;

public class EarthQuakeClient2
{
    public EarthQuakeClient2() {
        // TODO Auto-generated constructor stub
    }

    public ArrayList<QuakeEntry> filter(ArrayList<QuakeEntry> quakeData, Filter f) { 
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for(QuakeEntry qe : quakeData) { 
            if (f.satisfies(qe)) { 
                answer.add(qe); 
            } 
        } 
        return answer;
    } 

    public void quakesWithFilter() { 
        EarthQuakeParser parser = new EarthQuakeParser(); 
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "data/nov20quakedatasmall.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);         
        System.out.println("read data for "+list.size()+" quakes");

        
        
        //Filter f = new MinMagFilter(4.0); 
        Filter fm = new MagnitudeFilter(4.0, 5.0);
        
        Filter fd = new DepthFilter(-35000.0, -12000.0);
        
        
        Location tokio = new Location(35.42, 139.43);
        Filter floc = new DistanceFilter(10000000, tokio);
        
        
        ArrayList<QuakeEntry> m7  = filter(list, fm); 
        
        ArrayList<QuakeEntry> m8  = filter(m7, fd);
        
        ArrayList<QuakeEntry> mloc  = filter(list, floc);
                
        for (QuakeEntry qe: mloc) {
            System.out.println(qe);
        } 
        
        
    }

    public void createCSV(){
        EarthQuakeParser parser = new EarthQuakeParser();
        //String source = "../data/nov20quakedata.atom";
        String source = "data/nov20quakedatasmall.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read: "+list.size());
    }

    public void dumpCSV(ArrayList<QuakeEntry> list){
        System.out.println("Latitude,Longitude,Magnitude,Info");
        for(QuakeEntry qe : list){
            System.out.printf("%4.2f,%4.2f,%4.2f,%s\n",
                qe.getLocation().getLatitude(),
                qe.getLocation().getLongitude(),
                qe.getMagnitude(),
                qe.getInfo());
        }

    }

}
