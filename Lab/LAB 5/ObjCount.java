public class ObjCount{

     static int objectCount = 0; 

    public void ObjectCounter() {
        objectCount++; 
        // System.out.println("Object created: " + objectCount);
    }

    public static int getObjectCount() {
        return objectCount;  
    }

    public static void main(String[] args){
    	ObjCount o1 = new ObjCount();
        ObjCount abc = new ObjCount();
        ObjCount def = new ObjCount();
        ObjCount ghi = new ObjCount();

        o1.ObjectCounter();
        abc.ObjectCounter();
        def.ObjectCounter();
        
        System.out.println("Total objects created: " + ObjCount.getObjectCount());
    }
}