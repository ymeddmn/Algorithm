package com.mage.binarytree;

public interface Tree<T> {
    void visit(Tree tree);

    Tree getLeft();

    Tree getRight();


    T value();
}
