package search;

public class ThreadSearch {
    public static void main(String[] args) throws InterruptedException {
        int val = 70467;
        int[] values = new int[100000];
        for(int i=0; i<values.length; i++)
            values[i] = i;

        SearcherThread[] st = new SearcherThread[5];
        int num = values.length/st.length;

        for (int i=0,j=0; i<st.length; i++){
            st[i] = new SearcherThread(val,num,j,values);
            st[i].start();
            j += num;
        }
    }
}