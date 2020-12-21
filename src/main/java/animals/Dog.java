package animals;

import animals.types.Race;

public class Dog {
    private String name;
    private String color;
    private int legCount;
    private boolean hasTail;
    private String size;
    private Race race;

    public void bark(int times){
        while(times > 0){
            System.out.println("hau hau");
            times = times - 1;
        }
    }

    public void setColor(String color){
            this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
