public class BinaryTree {
    public Node root;

    public void NewNode(int data){
        root = NewNode(root, new Node(data));;
    }

    private Node NewNode(Node root, Node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if(newData.data < root.data){
            root.left = NewNode(root.left, newData);
        } else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    public void PreOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }

    public void PostOrder(Node node){
        if(node != null){
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.println(node.data + " ")
            ;
        }
    }
}
