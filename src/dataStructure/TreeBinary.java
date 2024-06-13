package dataStructure;

public class TreeBinary {

    public Node root;

    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if(root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root,final int value) {
        if(root == null) return;
        if(value == root.value) return;
        if(value > root.value){
            if(root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if(root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(final Node node) {
        //Esquerda Raiz Direita
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if(root == null) return false;
        if(root.value == value) return true;
        if(value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    public boolean notContains(int value) {
        return !notContains(root, value);
    }

    private boolean notContains(Node root, int value) {
        if(root == null) return false;
        if(root.value == value) return true;
        if(value > root.value) return notContains(root.right, value);
        else return notContains(root.left, value);
    }


    public int minValue(Node currentNode){
        while(currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode (int value) {
        deleteNode(root, value);
    }

    private Node deleteNode(final Node root, final int value) {
        if(root == null) return null;
        if(value < root.value){
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if ((root.left == null) && (root.right == null)) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
        return root;
    }


    public static void main(String[] args) {
        TreeBinary treeBinary = new TreeBinary();
        treeBinary.insert(37);
        treeBinary.insert(66);
        treeBinary.insert(42);
        treeBinary.insert(11);
        treeBinary.insert(72);
        treeBinary.insert(8);
        treeBinary.insert(17);

        treeBinary.deleteNode(66);

//        System.out.println(treeBinary.contains(42));
//        System.out.println(treeBinary.contains(99));
//        System.out.println(treeBinary.notContains(99));
//        System.out.println(treeBinary.notContains(66));

        treeBinary.inOrder();
    }
}
