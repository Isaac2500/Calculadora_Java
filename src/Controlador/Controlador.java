/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormCalculadora;
import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import Vista.FormListaErrores;
import javax.swing.ImageIcon;

/**
 *
 * @author PROPIETARIO
 */
public class Controlador implements ActionListener{
    
    private FormCalculadora calculadora;
    private Modelo model;
    private FormListaErrores errores;

    public Controlador(FormCalculadora calculadora, Modelo model, FormListaErrores errores) {
        this.calculadora = calculadora;
        this.model = model;
        this.errores = errores;
        this.calculadora.btnCero.addActionListener(this);
        this.calculadora.btnDividir.addActionListener(this);
        this.calculadora.btnIgual.addActionListener(this);
        this.calculadora.btnLimpiar.addActionListener(this);
        this.calculadora.btnMultiplicar.addActionListener(this);
        this.calculadora.btnNumero1.addActionListener(this);
        this.calculadora.btnNumero2.addActionListener(this);
        this.calculadora.btnNumero3.addActionListener(this);
        this.calculadora.btnNumero4.addActionListener(this);
        this.calculadora.btnNumero5.addActionListener(this);
        this.calculadora.btnNumero6.addActionListener(this);
        this.calculadora.btnNumero7.addActionListener(this);
        this.calculadora.btnNumero8.addActionListener(this);
        this.calculadora.btnNumero9.addActionListener(this);
        this.calculadora.btnParentesisA.addActionListener(this);
        this.calculadora.btnParentesisC.addActionListener(this);
        this.calculadora.btnPorcentaje.addActionListener(this);
        this.calculadora.btnPunto.addActionListener(this);
        this.calculadora.btnRestar.addActionListener(this);
        this.calculadora.btnSumar.addActionListener(this);
        this.calculadora.txtCampoOperaciones.addActionListener(this);
        this.calculadora.txtCampoResultado.addActionListener(this);
        this.errores.btnRegresar.addActionListener(this);
        this.calculadora.menuListaErrores.addActionListener(this);
    }

    public void Iniciar(){
        calculadora.setTitle("Calculadora");
        calculadora.setLocationRelativeTo(null);
        calculadora.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/calculadora.png")).getImage());
        errores.setTitle("Errores");
        errores.setLocationRelativeTo(null);
        calculadora.txtCampoOperaciones.setEnabled(false);
        calculadora.txtCampoResultado.setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object accion = e.getSource();
       
       //OPERADORES MATEMATICOS
       if(accion.equals(this.calculadora.btnCero)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"0");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"0");
       }
       if(accion.equals(this.calculadora.btnDividir)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"/");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"/");
       }
       if(accion.equals(this.calculadora.btnMultiplicar)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"*");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"*");
       }
       if(accion.equals(this.calculadora.btnParentesisA)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"(");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"(");
       }
       if(accion.equals(this.calculadora.btnParentesisC)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+")");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+")");
       }
       if(accion.equals(this.calculadora.btnPunto)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+".");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+".");
       }
       if(accion.equals(this.calculadora.btnSumar)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"+");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"+");
       }
       if(accion.equals(this.calculadora.btnRestar)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"-");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"-");
       }
       
       //NUMEROS DEL TECLADO
       if(accion.equals(this.calculadora.btnNumero1)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"1");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"1");
       }
       if(accion.equals(this.calculadora.btnNumero2)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"2");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"2");
       }
       if(accion.equals(this.calculadora.btnNumero3)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"3");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"3");
       }
       if(accion.equals(this.calculadora.btnNumero4)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"4");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"4");
       }
       if(accion.equals(this.calculadora.btnNumero5)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"5");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"5");
       }
       if(accion.equals(this.calculadora.btnNumero6)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"6");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"6");
       }
       if(accion.equals(this.calculadora.btnNumero7)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"7");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"7");
       }
       if(accion.equals(this.calculadora.btnNumero8)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"8");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"8");
       }
       if(accion.equals(this.calculadora.btnNumero9)){
           model.setExpresion(calculadora.txtCampoOperaciones.getText()+"9");
           calculadora.txtCampoOperaciones.setText(calculadora.txtCampoOperaciones.getText()+"9");
       }
       
       //OPERACIONES RELATIVAS
       if(accion.equals(this.calculadora.btnIgual)){
           try {
               model.Operacion();
               calculadora.txtCampoResultado.setText(model.getResultado());
           } catch (ScriptException ex) {
               JOptionPane.showMessageDialog(null,"Expresion No Valida");
           } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null,"Expresion Aritmetica No Valida");
           }
       }
       if(accion.equals(this.calculadora.btnLimpiar)){
           
           calculadora.txtCampoOperaciones.setText(null);
       }
       if(accion.equals(this.calculadora.menuListaErrores)){
           errores.setVisible(true);
       }
       if(accion.equals(this.errores.btnRegresar)){
           errores.setVisible(false);
       }
    }
    
    
}
