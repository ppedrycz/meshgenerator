package pl.edu.agh.iet.gg.meshgenerator.model;

/**
 * @author Wojciech Pachuta.
 */
public class Graph {
    private final E root;

    public Graph() {
        this.root = new E(0,0,0);
    }

    public E getRoot() {
        return root;
    }

}