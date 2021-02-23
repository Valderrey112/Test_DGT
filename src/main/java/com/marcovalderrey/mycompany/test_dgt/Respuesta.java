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
public class Respuesta {
    
    String pregunta;
    String respuestaDada;
    String respuestaCorrecta;
    
    public Respuesta(){}
    
    public Respuesta(String pregunta, String respuestaDada, String respuestaCorrecta){
    
        this.pregunta = pregunta;
        this.respuestaDada = respuestaDada;
        this.respuestaCorrecta = respuestaCorrecta;
        
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaDada() {
        return respuestaDada;
    }

    public void setRespuestaDada(String respuestaDada) {
        this.respuestaDada = respuestaDada;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
    
}
