import java.util.Timer;
import java.util.TimerTask;

public class Game {
    protected int baflamCounter;
    private int baflamPerLick;
    private int baflamPerSecond;
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    protected int upgrade3Cost;
    protected int upgrade4Cost;
    protected int upgrade5Cost;
    protected int upgrade6Cost;
    protected int upgrade7Cost;
    protected int upgrade8Cost;
    protected int upgrade9Cost;
    protected int upgrade10Cost;
    protected int upgrade11Cost;




    public Game() {
        this.baflamCounter = 0;
        this.baflamPerLick = 1;
        this.baflamPerSecond = 0;
        this.upgrade1Cost = 5;
        this.upgrade2Cost = 25;
        this.upgrade3Cost = 100;
        this.upgrade4Cost = 200;
        this.upgrade5Cost = 500;
        this.upgrade6Cost = 1000;
        this.upgrade7Cost = 1500;
        this.upgrade8Cost = 2500;
        this.upgrade9Cost = 4000;
        this.upgrade10Cost = 8000;
        this.upgrade11Cost = 15000;


        Timer timer = new Timer();
       TimerTask slow = new TimerTask () {
            @Override
            public void run() {
                slowCookie();
            }
        };
        timer.schedule(slow, 0,1000);

    }

    public void slowCookie() {
        this.baflamCounter += baflamPerSecond;
    }



public void click() {
        baflamCounter += baflamPerLick;
    }

    public void buyUpgrade1() {
        //Write an if statement that will check if you have enough cookies first
        //If you don't have at least 5 cookies, the upgrade will not be purchased
        if (baflamCounter >= upgrade1Cost) {
            baflamCounter -= upgrade1Cost;
            baflamPerLick++;
            upgrade1Cost += baflamPerLick;
        }



    }

    public void buyUpgrade2() {
        if (baflamCounter >= upgrade2Cost) {
            baflamCounter -= upgrade2Cost;
            baflamPerSecond++;
            upgrade2Cost += baflamPerSecond;
        }
    }


    public void buyUpgrade3() {
        if (baflamCounter >= upgrade3Cost) {
            baflamCounter -= upgrade3Cost;
            baflamPerLick+=5;
            upgrade3Cost += baflamPerSecond;
        }
    }
    //BOO

    public void buyUpgrade4() {
        if (baflamCounter >= upgrade4Cost) {
            baflamCounter -= upgrade4Cost;
            baflamPerLick+=20;
            upgrade4Cost += baflamPerSecond;
        }
    }

    public void buyUpgrade5() {
        if (baflamCounter >= upgrade5Cost) {
            baflamCounter -= upgrade5Cost;
            baflamPerLick+=50;
            upgrade5Cost += baflamPerSecond;
        }
    }

    public void buyUpgrade6() {
        if (baflamCounter >= upgrade6Cost) {
            baflamCounter -= upgrade6Cost;
            baflamPerLick+=80;
            upgrade6Cost += baflamPerSecond;
        }
    }

    public void buyUpgrade7() {
        if (baflamCounter >= upgrade7Cost) {
            baflamCounter -= upgrade7Cost;
            baflamPerLick+=120;
            upgrade7Cost += baflamPerSecond;
        }
    }


    public void buyUpgrade8() {
        if (baflamCounter >= upgrade8Cost) {
            baflamCounter -= upgrade8Cost;
            baflamPerLick+=200;
            upgrade8Cost += baflamPerSecond;
        }
    }

    public void buyUpgrade9() {
        if (baflamCounter >= upgrade9Cost) {
            baflamCounter -= upgrade9Cost;
            baflamPerLick+=250;
            upgrade9Cost += baflamPerSecond;
        }
    }

    public void buyUpgrade10() {
        if (baflamCounter >= upgrade10Cost) {
            baflamCounter -= upgrade10Cost;
            baflamPerLick+=300;
            upgrade10Cost += baflamPerSecond;
        }
    }
    public void buyUpgrade11() {
        if (baflamCounter >= upgrade11Cost) {
            baflamCounter -= upgrade11Cost;
            baflamPerLick+=500;
            upgrade11Cost += baflamPerSecond;
        }
    }



}