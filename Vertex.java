public class Vertex {
    public boolean found;
    public int dist;
    public int prev;

    public Vertex() {
        this.found = false;
        this.dist = 9999;
        this.prev = 0;
    }
}