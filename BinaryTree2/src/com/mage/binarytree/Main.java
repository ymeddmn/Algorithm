package com.mage.binarytree;

public class Main {

    public static void main(String[] args) {
        Node<String> K = new Node<>("K", null, null);
        Node<String> J = new Node<>("J", null, null);
        Node<String> G = new Node<>("G", J, K);
        Node<String> F = new Node<>("F", null, null);
        Node<String> E = new Node<>("E", F, G);
        Node<String> I = new Node<>("I", null, null);
        Node<String> D = new Node<>("D", null, I);
        Node<String> H = new Node<>("H", null, null);
        Node<String> C = new Node<>("C", H, null);
        Node<String> B = new Node<>("B", C, D);
        Node<String> A = new Node<>("A", B, E);

        NodeManager.nonRecuEndOrder(A);
    }
}
