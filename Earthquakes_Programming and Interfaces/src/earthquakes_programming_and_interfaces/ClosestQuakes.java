package earthquakes_programming_and_interfaces;


/**
 * Find N-closest quakes
 * 
 * @author Duke Software/Learn to Program
 * @version 1.0, November 2015
 */


import java.util.*;

public class ClosestQuakes
{
   public ArrayList<QuakeEntry> getClosest(ArrayList<QuakeEntry> quakeData, Location current, int howMany){
        ArrayList<QuakeEntry> copy = new ArrayList<QuakeEntry>(quakeData);
        ArrayList<QuakeEntry> ret = new ArrayList<QuakeEntry>();
        for(int j=0; j < howMany; j++) {
            int minIndex = 0;
            for(int k=1; k < copy.size(); k++){
                QuakeEntry quake = copy.get(k);
                Location loc = quake.getLocation();
                if (loc.distanceTo(current) < 
                    copy.get(minIndex).getLocation().distanceTo(current)){
                    minIndex = k;   
                }
            }
          
            ret.add(copy.get(minIndex));
            copy.remove(minIndex);
        }
        return ret;
   }
    
   public void findClosestQuakes(){
       EarthQuakeParser parser = new EarthQuakeParser();
		//String source = "data/nov20quakedata.atom";
		//String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
                String source = "data/nov20quakedatasmall.atom";
		ArrayList<QuakeEntry> list  = parser.read(source);
		System.out.println("read data for " + list.size());
		
		Location jakarta  = new Location(-6.211, 106.845);

		ArrayList<QuakeEntry> close = getClosest(list, jakarta, 3);
		for(int k=0; k < close.size(); k++){
			QuakeEntry entry = close.get(k);
			double distanceInMeters = jakarta.distanceTo(entry.getLocation());
			System.out.printf("%4.2f\t %s\n", distanceInMeters/1000, entry);
		}
		System.out.println("number found: " + close.size());
   }
   
   //--------------------------------------------------------------------------
    /*
    Assignment 4: Finding the Closest Earthquakes to a Location
    In this assignment you will complete the program to determine the N closests earthquakes to
    a specified location that was described in this lesson in the video.
    Specifically, for this assignment, you will only modify one class, the ClosestQuakes class:
    */
}
