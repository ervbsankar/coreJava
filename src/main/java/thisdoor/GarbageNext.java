package thisdoor;


import nextdoor.Chair;

public class GarbageNext {
    public static void main(String[] args){
        Chair chair = new Chair();
        chair.publicMethod();
        /*Only public methods are visible to another package*/
    }
}