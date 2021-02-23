/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcovalderrey.mycompany.test_dgt;

/**
 *
 * @author valde
 */
public class Pregunta {

    public Pregunta(){}
    
    public Pregunta(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaD = respuestaD;
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
    
    String pregunta;
    String preguntaAbajo;
    
    String respuestaA;
    String respuestaAAbajo;
    
    String respuestaB;
    String respuestaBAbajo;
    
    String respuestaC;
    String respuestaCAbajo;
    
    String respuestaD;
    String respuestaDAbajo;
    
    String respuestaCorrecta;

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPreguntaAbajo() {
        return preguntaAbajo;
    }

    public void setPreguntaAbajo(String preguntaAbajo) {
        this.preguntaAbajo = preguntaAbajo;
    }

    public String getRespuestaA() {
        return respuestaA;
    }

    public void setRespuestaA(String respuestaA) {
        this.respuestaA = respuestaA;
    }

    public String getRespuestaAAbajo() {
        return respuestaAAbajo;
    }

    public void setRespuestaAAbajo(String respuestaAAbajo) {
        this.respuestaAAbajo = respuestaAAbajo;
    }

    public String getRespuestaB() {
        return respuestaB;
    }

    public void setRespuestaB(String respuestaB) {
        this.respuestaB = respuestaB;
    }

    public String getRespuestaBAbajo() {
        return respuestaBAbajo;
    }

    public void setRespuestaBAbajo(String respuestaBAbajo) {
        this.respuestaBAbajo = respuestaBAbajo;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public String getRespuestaCAbajo() {
        return respuestaCAbajo;
    }

    public void setRespuestaCAbajo(String respuestaCAbajo) {
        this.respuestaCAbajo = respuestaCAbajo;
    }

    public String getRespuestaD() {
        return respuestaD;
    }

    public void setRespuestaD(String respuestaD) {
        this.respuestaD = respuestaD;
    }

    public String getRespuestaDAbajo() {
        return respuestaDAbajo;
    }

    public void setRespuestaDAbajo(String respuestaDAbajo) {
        this.respuestaDAbajo = respuestaDAbajo;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    public String toString(){
    
        return getPregunta() + getPreguntaAbajo();
        
    }
    
    void dividirCadenasLargas(){
    
        if(pregunta.length()>=60){
            preguntaAbajo = pregunta.substring(59, pregunta.length());
            pregunta = pregunta.substring(0, 59);
        }
        if(respuestaA.length()>=38){
            respuestaAAbajo = respuestaA.substring(37, respuestaA.length());
            respuestaA = respuestaA.substring(0, 37);
        }
        if(respuestaB.length()>=38){
            respuestaBAbajo = respuestaB.substring(37, respuestaB.length());
            respuestaB = respuestaB.substring(0, 37);
        }
        if(respuestaC.length()>=38){
            respuestaCAbajo = respuestaC.substring(37, respuestaC.length());
            respuestaC = respuestaC.substring(0, 37);
        }
        if(respuestaD.length()>=38){
            respuestaDAbajo = respuestaD.substring(37, respuestaD.length());
            respuestaD = respuestaD.substring(0, 37);
        }
        
    }
    
}
