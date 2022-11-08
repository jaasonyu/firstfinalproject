

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(30, 0, 250);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);

        plane.turn(-120);
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
