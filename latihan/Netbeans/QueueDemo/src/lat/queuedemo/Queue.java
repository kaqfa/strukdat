/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.queuedemo;

/**
 *
 * @author kaqfa
 */
public interface Queue {
    
    public boolean isEmpty();
    public boolean isFull();
    public boolean isOneElement();
    public void add(int val);
    public int remove();

    public void createEmpty(int jmlData);
}
