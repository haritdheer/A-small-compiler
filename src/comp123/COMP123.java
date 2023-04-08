/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp123;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
/**
 *
 * @author harit
 */
public class COMP123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String dir="C:\\Users\\harit\\OneDrive\\Desktop\\123lang.txt";
        CharStream input = CharStreams.fromFileName(dir);
         Grammar123Lexer lexer = new Grammar123Lexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
          Grammar123Parser parser = new Grammar123Parser(tokens);
            parser.prog();
        } catch(IOException ex){
            Logger.getLogger(COMP123.class.getName()).log(Level.SEVERE, null, ex);
        
        }
         
    }
    
}
