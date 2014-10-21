/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studycase;

/**
 *
 * @author kaqfa
 */
public class ElementList {
    int data; // atau data

    ElementList next = null;

    void printInfo(){
        System.out.println("Nilai dari info adalah "+this.data);
    }
}
