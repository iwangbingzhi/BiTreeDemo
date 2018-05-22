package BiTreeDemo;

public class BiTreeNode {
    public Object data;  //数据域
    public BiTreeNode lchild,rchild;  //左右孩子域

    public BiTreeNode(){
        this.data = null;
        this.lchild = null;
        this.rchild = null;
    }
    public BiTreeNode(Object data){
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }

    public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
}
