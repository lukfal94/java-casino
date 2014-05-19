/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.casino;

/**
 *
 * @author lukefallon
 */
public class Card {
    public String suite;
    public int val;
    
    Card(){}
    
    private String getCardSuite(){
        return suite;
    }
    
    private int getCardVal(){
        return val;
    }
    
}
