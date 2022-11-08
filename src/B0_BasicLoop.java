public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        for(int row=0;row<20;row=row+1)
        {
            for(int col=0;col<20;col=col+1) {
                plane.pausetime = 0;
                int a = (int) (Math.random() * 10 + 1);
                System.out.println(col);
                plane.teleport(50*col, row*30);
                plane.setColor(10*row,12*col,90);
                house(10);
            }
        }
    }



    public void house(int c) {
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
//        plane.isTrail = false;
//        plane.startingAngle(270);
//        plane.move(200);
//        plane.isTrail = true;
//        plane.pausetime = 0;
//        sun(2
        mySquare(c);
        triangle(c);
    }
    public void mySquare(int a) {
        plane.startingAngle(90);
        plane.trailWidth = 3;
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }
    public void triangle(int a) {
        plane.turn(-210);
        plane.move(a);
        plane.turn(240);
        plane.move(a);
        plane.turn(240);
        plane.move(a);
    }
}
