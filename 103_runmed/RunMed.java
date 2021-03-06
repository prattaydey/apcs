import java.util.NoSuchElementException;

public class RunMed {

    private ALHeapMax lilVals;
    private ALHeapMin bigVals;

    public RunMed(){
        lilVals = new ALHeapMax();
        bigVals = new ALHeapMin();
    }

    public double getMedian(){
        if ( lilVals.isEmpty()){
            throw new NoSuchElementException();
        }
        if ( bigVals.isEmpty() ){
            return lilVals.peekMax();
        }
        if ( bigVals.size() < lilVals.size() ){
            return lilVals.peekMax();
        }
        return ( lilVals.peekMax() + bigVals.peekMin() ) / 2;
    }

    public void add( Integer newVal ){
        if( lilVals.isEmpty() ){
            lilVals.add(newVal);
        }
        if(lilVals.peekMax().compareTo(newVal) < 0  ){
            bigVals.add(newVal);
        }
        else{
            lilVals.add(newVal);
        }

        if ( lilVals.size() - bigVals.size() > 1 ) {
            bigVals.add(lilVals.removeMax() );
        }

        else if( bigVals.size() > lilVals.size() ){
            lilVals.add( bigVals.removeMin() );
        }
    }
}

