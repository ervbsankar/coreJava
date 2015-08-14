package nextdoor;

/**
 * Created by a513915 on 8/11/2015.
 */
public class Chair {
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finaliazed = 0;
    int i;

    /* If you remove public below then this class cannot be accessed in other package*/
    public Chair() {
        i = ++created;
        if (created == 47) {
            System.out.println("created 47");
        }
    }

    private void privateMethod(){
        System.out.println("This is private method");
    }

    protected  void protectedMethod(){
        System.out.println("This is protected method");
        privateMethod();
    }

    void noModifier(){
        System.out.println("This is No Modifier method");
    }

    public void publicMethod(){
        System.out.println("This is Public method");
    }

    @Override
    protected void finalize(){
        if(!gcrun){
            gcrun = true;
            System.out.println("Beginning to finalize after " + created + " chairs have been created");
        }
        if(i==47){
            System.out.println("Finalizing nextdoor.Chair #47, " +
            "Setting flag to stop chair creation");
         f= true;
        }
        finaliazed++;
        if(finaliazed >= created){
            System.out.println("All " + finaliazed + " finalized");
        }
    }
}
