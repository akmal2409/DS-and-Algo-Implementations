public class QuickFind implements UF{

    private int N;
    private int[] id;

    public QuickFind(int N) {
        this.N = N;
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if(pid == qid){
            return;
        }
        for(int i=0; i<id.length; i++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public int count() {
        return N;
    }
}
