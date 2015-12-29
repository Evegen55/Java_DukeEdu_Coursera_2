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
    private int minMag;
    private int maxMag;
    
    public MagnitudeFilter() {
        minMag = 0;
        maxMag = 0;
    }

    @Override
    public boolean satisfies(QuakeEntry qe) {
        if (qe.getMagnitude() >= minMag && qe.getMagnitude() <= maxMag) {
            return true;
        }
        return false;
    }
    
}
