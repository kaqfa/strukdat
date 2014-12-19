/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kaqfa
 */
class Node {
    
    public int data;      
    public Node leftChild;
    public Node rightChild;

    public void displayNode() 
    {
        System.out.print('{');
        System.out.print(data);
        System.out.print("} ");
    }
}
