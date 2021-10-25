/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeligada;

import ico.fes.edd.DoubleLinkedListADT;

/**
 *
 * @author jose_
 */
public class ListaDoblementeLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedListADT ldl = new DoubleLinkedListADT();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
    }
    
}
