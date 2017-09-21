package com.mage.fengwang;


import java.util.Stack;

public class NodeManager {
    /**
     * 递归先序遍历
     *
     * @param node
     * @param <T>
     */
    public static <T> void recursionOrdered(Tree<T> node) {
        if (node == null) {

        } else {

            System.out.println(node.value());
            recursionOrdered(node.getLeft());
            recursionOrdered(node.getRight());
            System.out.println();
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     * @param <T>
     */
    public static <T> void recursionMiddleOrder(Tree<T> node) {
        if (node != null) {
            recursionMiddleOrder(node.getLeft());
            System.out.println(node.value());
            recursionMiddleOrder(node.getRight());
        }
    }

    /**
     * 后序遍历
     *
     * @param node
     * @param <T>
     */
    public static <T> void recursionEndOrder(Tree<T> node) {
        if (node != null) {
            recursionEndOrder(node.getLeft());
            recursionEndOrder(node.getRight());
            System.out.println(node.value());
        }
    }

    /**
     * 非递归先序遍历
     *
     * @param node
     * @param <T>
     */
    public static <T> void nonRecuOrder(Tree<T> node) {
        Stack<Tree> stack = new Stack<>();
        pushToStack(stack, node);
        while (!stack.isEmpty()) {
            Tree popTree = stack.pop();
            System.out.println(popTree.value());
            pushToStack(stack, popTree.getRight());
            pushToStack(stack, popTree.getLeft());
        }
    }

    /**
     * 中序非递归遍历
     *
     * @param node
     * @param <T>
     */
    public static <T> void nonRecuMiddleOrder(Tree<T> node) {
        Stack<Tree> stack = new Stack<>();
        while (node != null) {
            while (node != null) {
                if (node.getRight() != null) {
                    pushToStack(stack, node.getRight());
                }
                pushToStack(stack, node);
                node = node.getLeft();
            }
            node = stack.pop();
            while (node.getRight() == null && !stack.isEmpty()) {
                visit(node);
                node = stack.pop();
            }
            visit(node);
            if (stack.isEmpty()) {
                node = null;
            } else {
                node = stack.pop();
            }
        }
    }

    /**
     * 非递归后序遍历
     * @param node
     * @param <T>
     */
    public static <T> void nonRecuEndOrder(Tree<T> node) {
        Stack<Tree> stack = new Stack<>();
        Tree<T> hasVisitNode = node;
        while (node != null) {
            for (; node.getLeft() != null; node = node.getLeft()) {
                stack.push(node);
            }
            while (node != null && (node.getRight() == null || node.getRight() == hasVisitNode)) {
                visit(node);
                hasVisitNode = node;
                if (stack.isEmpty()) {
                    return;
                }
                node = stack.pop();
            }
            stack.push(node);
            node=node.getRight();
        }
    }


    private static void visit(Tree tree) {
        System.out.println(tree.value());
    }

    private static void pushToStack(Stack stack, Tree node) {
        if (node != null && stack != null) {
            stack.push(node);
        }
    }
}
