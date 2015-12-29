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
    
    public DistanceFilter() {
        minDist = 0;
        maxDist = 0;
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

    @Override
    
    public boolean satisfies(QuakeEntry qe) {
        if (qe.getMagnitude() >= minDist && qe.getMagnitude() <= maxDist) {
            return true;
        }
        return false;
    }
}
