public class FinalProject extends World{
    public int red;
    public int blue;
    public int green;
    public void go()
    {
        plane.loadBackGround("stranger.png");
        plane.showBackGround();
        plane.isTrail=true;
        backcolor();
        fence();
    }
    public void fence(){
        for(int row=0;row<13;row=row+1) {
            for (int col = 0; col < 1; col = col + 1) {
                plane.pausetime = 0;
                int a = (int) (Math.random() * 10 + 1);
                System.out.println(col);
                plane.teleport((45*row)+70,92);
                plane.setColor(10 * row, 12 * col, 90);
                triangle(42);
                plane.teleport((45*row)+70,316);
                plane.setColor(60, 16 * row, 13* col);
                snake(42);
            }
        }
    }
    public void backcolor(){
        for(int row=107; row<316; row++)
        {
            for (int col = 72; col < 666; col++)
            {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if ((red >= 0 && green >= 0 && blue >= 0) && (red < 60  && green < 4 && blue < 10)) {
                    plane.setPixelColor(13, 12, 40);
                }
            }
        }
    }
    public void triangle(int a) {
        plane.isTrail = true;
        plane.trailWidth = 3;
        plane.turn(-210);
        plane.move(a);
        plane.turn(240);
        plane.move(a);
        plane.turn(240);
        plane.move(a);
        plane.startingAngle(90);
    }
    public void snake(int a) {
        plane.isTrail = true;
        plane.trailWidth = 3;
        plane.turn(120);
        plane.move(a);
        plane.turn(-120);
        plane.move(a);
        plane.turn(-240);
        plane.move(a);
        plane.startingAngle(90);
    }

}
