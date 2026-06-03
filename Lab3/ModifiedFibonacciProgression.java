public class ModifiedFibonacciProgression extends Progression{
	
protected long prev;

  /** Constructs traditional Fibonacci starting 0,1,1,2,3,...*/
  public ModifiedFibonacciProgression() {this(0,1);}
  
  /** Constructs generalized Fibonacci, with given first and second values.*/
  public ModifiedFibonacciProgression(long first, long second){
    super(first);
    prev = second - first; // fictitious value preceding the first

   }

  /** Replaces (prev, current) with (current, current+prev). */
  protected void advance(){
    
    current += prev;

    prev = current - prev;

}
}