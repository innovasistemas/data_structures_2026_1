package com.packages.trees;

import java.util.Scanner;

public class Trees 
{
    private NodeTree root;
    public static Scanner input = new Scanner(System.in);

    public Trees()
    {
        root = null;
    }

    public NodeTree getRoot() 
    {
        return root;
    }

    public void setRoot(NodeTree root) 
    {
        this.root = root;
    }
    
    public void preorder(NodeTree r)
    {
        if (r != null) {
            System.out.println(r.info);
            preorder(r.left);
            preorder(r.right);
        }
    }

    public void inorder(NodeTree r)
    {
        if (r != null) {
            inorder(r.left);
            System.out.println(r.info);
            inorder(r.right);
        }
    }

    public void postorder(NodeTree r)
    {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.println(r.info);
        }
    }

    public void addNode(NodeTree node)
    {
        // node es distinto de null
        String resp;
        NodeTree mem;
        System.out.print("Ingrese un dato para el árbol: ");
        node.info = input.nextInt();
        input.nextLine();
        System.out.print("¿Agregar nodos por la izquierda de " + node.info + "?[s/?]: ");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
             mem = new NodeTree();
             node.left = mem;
             addNode(node.left);
        } else {
            node.left = null;
        }

        System.out.print("¿Agregar nodos por la derecha de " + node.info + "?[s/?]: ");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
             mem = new NodeTree();
             node.right = mem;
             addNode(node.right);
        } else {
            node.right = null;
        }
    }

    public int countNodes(NodeTree node)
    {
        if (node != null) {
            return 1 + countNodes(node.left) + countNodes(node.right);
        } else {
            return 0;
        }
    }

    public int maxNode(NodeTree node)
    {
        int max, maxLeft, maxRight;
        max = maxLeft = maxRight = Integer.MIN_VALUE;
        if (node != null) {
            if (node.left != null) {
                maxLeft = maxNode(node.left);
            }
            if (node.right != null) {
                maxRight = maxNode(node.right);
            }
            max = maxLeft > maxRight ? maxLeft : maxRight;
            if (node.info > max) {
                max = node.info;
            }
        }
        return max;
    }

    public int countLeaves(NodeTree node)
    {
        int c = 0;
        if (node != null) {
            if (node.left == null && node.right == null) {
                c = 1;
            }
            return c + countLeaves(node.left) + countLeaves(node.right);
        } else {
            return 0;
        }
    }

    public void insertABB(NodeTree node, int datum)
    {
        NodeTree mem;
        if (datum < node.info) {
            if (node.left == null) {
                mem = new NodeTree();
                mem.info = datum;
                mem.left = null;
                mem.right = null;
                node.left = mem;
                System.out.println("¡Nodo agregado al Árbol Binario de Búsqueda!");
            } else {
                insertABB(node.left, datum);
            }
        } else if (datum > node.info) {
            if (node.right == null) {
                mem = new NodeTree();
                mem.info = datum;
                mem.right = null;
                mem.right = null;
                node.right = mem;
                System.out.println("¡Nodo agregado al Árbol Binario de Búsqueda!");
            } else {
                insertABB(node.right, datum);
            }
        } else {
            System.out.println(datum + " ya existe en el árbol");
        }
    }

    public void searchABB(NodeTree node, int datum)
    {
        if (node != null) {
            if (datum < node.info) {
                searchABB(node.left, datum);
            } else if (datum > node.info) {
                searchABB(node.right, datum);
            } else {
                System.out.println(datum + " ¡encontrado en el ABB!");
            }
        } else {
            System.out.println(datum + " no se encuentra en el ABB");
        }
    }


}
