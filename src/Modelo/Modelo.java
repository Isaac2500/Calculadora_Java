/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.lang.ArithmeticException;
/**
 *
 * @author PROPIETARIO
 */
public class Modelo {
    
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("js");
    private String expresion;
    private String Resultado;

    public String getExpresion() {
        return expresion;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
    
    public void Operacion() throws ScriptException, ArithmeticException{
        
            this.setResultado(String.valueOf(this.engine.eval(this.getExpresion())));
            
        
    }
    
}
