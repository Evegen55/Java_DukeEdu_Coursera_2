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
        //s.createCSV();
        //s.bigQuakes();
        //s.closeToMe();
        //s.quakesOfDepth();
        s.quakesByPhrase();
    }
    
    public void test2() {
        ClosestQuakes c = new ClosestQuakes();
        c.findClosestQuakes();
    }
    
    public void test3() {
        LargestQuakes l = new LargestQuakes();
        l.findLargestQuakes();
    }
        public void test4() {
        LargestQuakes l = new LargestQuakes();
        l.findListOfLargestQuakes();
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Earthquakes_ProgrammingAndInterfaces d = new Earthquakes_ProgrammingAndInterfaces();
        //test package EarthquakeMagnitudeDistanceDemo
        d.test1();
        //d.test2();
        //d.test4();
    }
    
}
