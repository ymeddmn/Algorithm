package com.mage.fengwang;

public interface Tree<T> {
    void visit(Tree tree);

    Tree getLeft();

    Tree getRight();


    T value();
}
