/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakes_programming_and_interfaces;



/**
 *
 * @author Johnn
 */
public class Earthquakes_ProgrammingAndInterfaces {
    
    //test package EarthquakeMagnitudeDistanceDemo
    public void test1(){
        EarthQuakeClient s = new EarthQuakeClient();
        s.createCSV();
        s.bigQuakes();
        s.closeToMe();
        s.quakesOfDepth();
        s.quakesByPhrase();
    }
    
    public void test2() {
        earthquakes_programming_and_interfaces.ClosestQuakes c = new earthquakes_programming_and_interfaces.ClosestQuakes();
        c.findClosestQuakes();
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Earthquakes_ProgrammingAndInterfaces d = new Earthquakes_ProgrammingAndInterfaces();
        //test package EarthquakeMagnitudeDistanceDemo
        //d.test1();
        d.test2();
    }
    
}
