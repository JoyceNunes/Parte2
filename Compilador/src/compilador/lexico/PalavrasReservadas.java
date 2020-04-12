/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.lexico;

/**
 *
 * @author Hélio
 */
public class PalavrasReservadas {
    public static String[] palavras = {
        "and", "array", "begin", "case", "const", "div", "do", "downto", "else",
        "end", "file", "for", "function", "goto", "if", "in", "label", "mod", 
        "nil", "not", "of", "or", "packed", "procedure","program", "record", 
        "repeat", "set", "then", "to", "type", "until", "var","while", "with",
        "write", "read" , "integer", "real"
     };
    
    public static boolean contains(final String v) {
        boolean result = false;
        for (String mArray : palavras) {
            if (mArray.equals(v)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
