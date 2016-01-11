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
    private int minDist;
    private int maxDist;
    private Location loc;
    
    public DistanceFilter() {
        minDist = 0;
        maxDist = 0;
        loc = new Location(0.0,0.0);
    }
    /**
     * 
     * @param min
     * @param max 
     */
    public DistanceFilter(int min, int max) {
        this.minDist = min;
        this.maxDist = max;
    }
    public DistanceFilter(int max, Location locate) {
        this.maxDist = max;
        this.loc = locate;
    }

    @Override
    
    public boolean satisfies(QuakeEntry qe) {
        Location qeLoc = qe.getLocation();
        Float dist = loc.distanceTo(qeLoc);
        if (dist <= maxDist) {
            return true;
        }
        return false;
    }
}
