/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakes_programming_and_interfaces;

/**
 *
 * @author Lartsev
 */
public class DistanceFilter implements Filter{
    private int maxDist;
    private Location loc;
    
    /**
     * 
     * @param max
     * @param locate 
     */
    public DistanceFilter(int max, Location locate) {
        maxDist = max;
        loc = locate;
    }

    @Override
    
    public boolean satisfies(QuakeEntry qe) {
        Location qeLoc = qe.getLocation();
        Float dist = qeLoc.distanceTo(loc);
        if (dist <= maxDist) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "DistanceFilter";
    }
}
