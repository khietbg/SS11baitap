package baitap3;

import java.util.StringJoiner;

public class Node {
   public Node link;
   public int data;

    public Node(Node data) {

    }

    public int getData(int data) {
        return this.data;
    }
    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("link=" + link)
                .add("data=" + data)
                .toString();
    }
}
