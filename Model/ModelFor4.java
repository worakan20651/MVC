/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author "Worakan_Saensuksakulchon"
 */
public class ModelFor4 {

    //constuctor
    public ModelFor4() {
        
    }

    //check str for lexical to answer question 4
    public String checkLexicalFourthAnswer(String str) {
        
        //if found declare
        if(str.matches("declare")){
            return str + " is Keyword\n";
        }
        
        //found identifier
        else if(str.matches("[_a-z][_a-z0-9]*")){
            return str + " is identifier\n";
        }
        
        //found integer
        else if(str.matches("[0-9]")){
            return str + " is Literal\n";
        }
        
        //found add sign or equal sign
        else if(str.matches("[\\+|\\=]")){
            return str + " is Symbol\n";
        }
        return str + " don't understand";
    }
    
}
