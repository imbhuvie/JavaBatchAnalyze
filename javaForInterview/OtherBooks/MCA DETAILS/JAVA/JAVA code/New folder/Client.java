// String class is a subclass of Object class
class Client
 {
    public static void main(String args[])
   {
       	String stringRef = new String("Java");                   // (1)
       	System.out.println("stringRef.getClass(): " + stringRef.getClass());    // (2)
       	System.out.println("stringRef.length(): " + stringRef.length());    // (3)

       	Object objRef = stringRef;      // (4)
       	//Object objRef = new Object();

    	// System.out.println("objRef.length(): " + objRef.length());      // (5) Not OK.
        System.out.println("objRef.getClass(): " + objRef.getClass());          // (6)
       	System.out.println("objRef instanceof String: "+ (objRef instanceof String));
       	stringRef = (String) objRef;                  // (7)
    }
}

/*

when this statement is used:    Object objRef = new Object();


stringRef.getClass(): class java.lang.String
stringRef.length(): 4
objRef.getClass(): class java.lang.Object
objRef instanceof String: false
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot
 be cast to java.lang.String
        at Client.main(Client.java:14)
Press any key to continue . . .

when this statement is used:    Object objRef = stringRef;


stringRef.getClass(): class java.lang.String
stringRef.length(): 4
objRef.getClass(): class java.lang.String
objRef instanceof String: true
Press any key to continue . . .





*/