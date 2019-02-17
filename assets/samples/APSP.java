public class APSP {
    static int[][] adjMatrix;
    static int[][] p;
    static int V;
    static void floyd() {
        
        p = new int[V][V];        
        for(int i = 0; i < V; i++)
            for(int j = 0; j < V; j++)
                p[i][j] = i;
        for(int k = 0; k < V; k++)
            for(int i = 0; i < V; i++)
                for(int j = 0; j < V; j++)
                    if(adjMatrix[i][j] > adjMatrix[i][k] + adjMatrix[k][j]) {
                        adjMatrix[i][j] = adjMatrix[i][k] + adjMatrix[k][j];
                        p[i][j] = p[k][j];
                    }
    }
    static void printPath(int i, int j) {
        if(i != j)                    
            printPath(i, p[i][j]);    
        System.out.print(j + " ");
    }
}
