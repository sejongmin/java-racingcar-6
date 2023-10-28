package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private final String name;
    private int move;
    private int randomNumber;

    public RacingCar(String name){
        this.name = name;
        this.move = 0;
    }

    public String getCarName(){
        return this.name;
    }

    public void moveForward(){
        makeRandomNumber();
        if (isOverFour(randomNumber)){
            move += 1;
        }
    }

    public void makeRandomNumber(){
        randomNumber = Randoms.pickNumberInRange(Rule.minNumber, Rule.maxNumber);
    }

    public boolean isOverFour(int value){
        if (value >= Rule.standardValue){
            return true;
        } else{
            return false;
        }
    }

    public int getMove(){
        return this.move;
    }
}
