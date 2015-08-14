package nextdoor;

public class Garbage {
   public static void main(String[] args){
       if(args.length == 0){
           System.err.println("Uasge: \n" +
           "java nextdoor.Garbage before\n or: \n" +
           "java nextdoor.Garbage after");
           return;
       }
       while(!Chair.f){
           new Chair();
           new String("To take up Space");
       }
       System.out.println(
               "After all Chairs have been created:\n" +
                       "total created = " + Chair.created +
                       ", total finalized = " + Chair.finaliazed
       );
       Chair chair = new Chair();
       /* Only protected, no modifier and Public methods are visible in same package*/
       chair.protectedMethod();
       chair.noModifier();
       if(args[0].equals("before")){
           System.out.println("gc():");
           System.gc();
           System.out.println("runFinalization():");
           System.runFinalization();
       }
       System.out.println("bye!");
       if(args[0].equals("after")){
           System.runFinalizersOnExit(true);
       }
   }
}
