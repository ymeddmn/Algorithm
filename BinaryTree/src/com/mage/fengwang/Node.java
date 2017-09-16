package com.mage.fengwang;

public class Node<V> implements Tree<V> {
    private Tree left;
    private Tree right;
    private V value;

    public Node(V value, Tree left, Tree right) {
        if (value == null) {
            throw new IllegalArgumentException("必须给借点赋值");
        }
        if (left != null && !value.getClass().getTypeName().equals(left.value().getClass().getTypeName())) {
            throw new IllegalArgumentException("左节点类型于根节点类型不匹配");
        }
        if (right != null && !value.getClass().getTypeName().equals(right.value().getClass().getTypeName())) {
            throw new IllegalArgumentException("右节点类型于根节点类型不匹配");
        }
        this.left = left;
        this.right = right;
        this.value = value;
    }

    @Override
    public void visit(Tree tree) {
        System.out.println(tree.value());
    }

    @Override
    public Tree getLeft() {
        return left;
    }

    @Override
    public Tree getRight() {
        return right;
    }

    @Override
    public V value() {
        return value;
    }
}
