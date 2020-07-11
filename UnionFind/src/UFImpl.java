public class UFImpl implements UF{

    private int N;
    private int[] id;

    public UFImpl(int N) {
        this.N = N;
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return N;
    }
}
