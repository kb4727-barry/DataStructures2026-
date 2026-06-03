public class LockableCoin implements Lockable 
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;

   private boolean locked = false;

   private int key;




   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public LockableCoin()
{
face = (int) (Math.random() * 2);
}
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   protected void flip() throws RuntimeException
   {

      if(locked == false){

      face = (int) (Math.random() * 2);}

      else{

         throw new RuntimeException("Error, the coin is locked");

      }
}
   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads()
   {
      if(locked == false){
      return (face == HEADS);}
      else{

         throw new RuntimeException("Error, the coin is locked");

      }


}
   //-----------------------------------------------------------------
   // Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
{

 if(locked == false){ 
 

      String faceName;
 if (face == HEADS)
            faceName = "Heads";
else
            faceName = "Tails";
         return faceName;
      }

      else{

         throw new RuntimeException("Error, the coin is locked");

      }

   }



   public void setKey(int k){

      key = k;

   }

   public void lock(int k){

      if(key  == k){
      locked = true;}


   }

   public void unlock(int k){


      if(key == k){
      locked = false;}

   }

   public boolean locked(){

      return locked;

   }






}