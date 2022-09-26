public class Friend {
    //Instansvariabler
    //instance variables
    String name = "A friend";
    int hp = 100;
    boolean isFriend = true;

    public Friend(){

    }

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, boolean isFriend){
        this.name = name;
        this.isFriend = isFriend;
    }

    public void hit(){
        this.hp = this.hp-10;
    }

}
