package search;

public class SearcherRunnable implements Runnable{
    protected int val;
    protected int num;
    protected int start;
    protected int[] values;

    public SearcherRunnable(int v, int n, int s, int[] vs){
        val=v;
        num=n;
        start=s;
        values=vs;
    }

    @Override
    public void run() {
        for (int i=start; i<start+num; i++){
            if(values[i]==val){
                System.out.println(Thread.currentThread().getName() + " end " + i);
                break;
            }
        }
    }
}
