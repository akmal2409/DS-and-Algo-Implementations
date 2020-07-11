public class WeightedQuickUnion {

    private int count;
    private int[] id;
    private int[] sz;

    // WQUnion guarantees logarithmic time because it keeps the depth of trees smaller than QuickUnion
    public WeightedQuickUnion(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i<N; i++){
            id[i] = i;
            // Setting size of each tree to 1
            sz[i] = 1;
        }
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i == j){
            return;
        }
        // Connect smaller tree to a larger one
        if(sz[i] > sz[j]){
            id[j] = i;
            sz[i] += sz[j];
        } else{
            id[i] = j;
            sz[j] += sz[i];
        }
        count--;
    }

    // Finding root of a tree, worst case quadratic time
    public int find(int p){
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }

    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

}
