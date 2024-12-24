import java.util.*;

class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;

    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];

        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);

    }

    void BFS(int x) {
        // your code here
        Queue<Integer> q=new LinkedList<>();
        q.add(x);
        int[] visited=new int[this.vertices];
        while(q.size()>0){
            int node=q.poll();
            if(visited[node]==1){// check if already visited
                continue;
            }
            visited[node]=1;
            System.out.print(node+" ");
            for(int nbr:adjList[node]){
                if(visited[nbr]==0){
                    q.add(nbr);
                }
            }
        }
    }
}

 class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}