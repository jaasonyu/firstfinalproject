

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.startingAngle(60);
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.setColor(51, 153, 255);
        plane.move(100);
        plane.turn(240);
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.setColor(67, 84, 90);
        plane.move(100);
        plane.turn(240);
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.setColor(150, 63, 88);
        plane.move(100);

    }


}
