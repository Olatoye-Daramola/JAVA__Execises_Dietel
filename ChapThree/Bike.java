package TryOuts;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public void turnOn(boolean ignition){
        isOn = ignition;
    }

    public boolean isOn(){
        return isOn;
    }

    public void accelerateBike() {
        if(gear == 1){speed++;}
        if(gear == 2){speed += 2;}
        if(gear == 3){speed += 3;}
        if(gear == 4){speed += 4;}
    }

    public void decelerateBike() {
        if(gear == 1){speed--;}
        if(gear == 2){speed -= 2;}
        if(gear == 3){speed -= 3;}
        if(gear == 4){speed -= 4;}
    }

//    public void setSpeed(int speed){
//        this.speed = speed;
//    }

    public int getSpeed(){
        return speed;
    }

    public void automaticGear(int speed){
        this.speed = speed;

        if(speed >= 0 && speed <= 20){gear = 1;}
        if(speed >= 21 && speed <= 30){gear = 2;}
        if(speed >= 31 && speed <= 40){gear = 3;}
        if(speed >= 41){gear = 4;}
    }

    public int getGear(){
        return gear;
    }
}