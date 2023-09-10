/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;

/**
 *
 * @author "Worakan_Saensuksakulchon"
 */
public class Controller {
    ModelFor4 model4;
    ModelFor5 model5;
    
    //constuctor
    public Controller(){
        model4 = new ModelFor4();
        model5 = new ModelFor5();
    }
    
    //lexical analysis for 4
    public String lexicalAnalysis4(String input){
        String[] inputSplit = input.split(" ");
        String lex = "";
        
        for(String s : inputSplit){
            lex += model4.checkLexicalFourthAnswer(s);
        }
            
        return lex;
    }
    
    //lexical analysis for 5
    public String lexicalAnalysis5(String input){
        String[] inputSplit = input.split(" ");
        String lex = "";
        for(String s : inputSplit){
            lex += model5.checkLexicalFifthhAnswer(s);
        }
        return lex;
    }
}
