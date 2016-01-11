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
public class MagnitudeFilter implements Filter{
    private double minMag;
    private double maxMag;
    
    public MagnitudeFilter() {
        minMag = 0;
        maxMag = 0;
    }
    /**
     * 
     * @param min
     * @param max 
     */
    public MagnitudeFilter(double min, double max) {
        this.minMag = min;
        this.maxMag = max;
    }
    

    @Override
    public boolean satisfies(QuakeEntry qe) {
        if (qe.getMagnitude() >= minMag && qe.getMagnitude() <= maxMag) {
            return true;
        }
        return false;
    }
    
    @Override
    public String getName() {
        return "MagnitudeFilter";
    }
    
}
