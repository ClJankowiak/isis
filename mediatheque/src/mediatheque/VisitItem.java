/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

public class VisitItem implements Visitor {

    @Override
    public void visit(Book monlivre) {
        System.out.println(monlivre); 
    }

    @Override
    public void visit(CD monCD) {
        System.out.println(monCD); 
    }
    
}
