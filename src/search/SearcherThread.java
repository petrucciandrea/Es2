package search;

public class SearcherThread extends Thread{
    protected int val;
    protected int n;
    protected int start;
    protected int[] array;

    public SearcherThread(int v, int n, int s, int[] a){
        this.val=v;
        this.n=n;
        this.start=s;
        this.array=a.clone();
    }

    @Override
    public void run(){
        for (int i = start; i < start+n; i++) {
            if (array[i]==val) {
                System.out.println(getName() + " end " + i);
                break;
            }
        }
    }
}
