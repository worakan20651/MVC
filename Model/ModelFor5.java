/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author "Worakan_Saensuksakulchon"
 */
public class ModelFor5 {

    //constuctor
    public ModelFor5() {

    }

    //check str for lexical to answer question 5
    public String checkLexicalFifthhAnswer(String str) {

        //if found declare or add sign
        if (str.matches("declare") || str.matches("\\+")) {
            return str + " is Keyword and Sign\n";

        } 

        //found identifier
        else if (str.matches("[_a-z][_a-z0-9]*")) {
            return str + " is Variable\n";
        } 

        //found integer
        else if (str.matches("[0-9]")) {
            return str + " is Integer\n";
        }
        
        //found equals sign
        else if (str.matches("[\\=]")) {
            return str + " is Assignment\n";
        }

        return str + "don't understand";
    }
}
