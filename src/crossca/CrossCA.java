/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossca;

import Database.database;
import cacrossmodule.Determinant;
import cacrossmodule.CaCrossModule;

/**
 *
 * @author tchat
 */
public class CrossCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
       database db = new database();
       db.remove();
       Determinant dt = new Determinant();
     
    }
    
     
}
