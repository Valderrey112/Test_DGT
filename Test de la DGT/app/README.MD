


PANTALLANA PRINCIPAL
--------------------------------
     Al iniciar el programa tenemos tres opciones, iniciar el test, rellenar los datos personales o en
     Edición, activar el modo administrador. 

     BOTÓN INICIAR TEST Y CAMPOS DATOS PERSONALES:

          Si damos a iniciar test, nos pedirá rellenar los campos de datos personales si nos falta alguno por 
          rellenar. Al rellenar los campos, el dni tiene un validador, con lo cuál no podremos iniciar test si
          no hemos introducido uno correcto, y los campos de nombre y apellidos no pueden tener
          números, si introducimos algún datos no válido se nos avisará de ello y se vaciará el campo
          correspondiente, una vez rellenados todos los campos podremos iniciar el test, con las 
          características que tengamos asignadas. Estas características aparecen en un principio 
          desactivadas por que el programa está enfocado para que solo los administradores puedan
          modificar los test y ver los resultados, los alumnos que realicen el test unicamente podrán
          introducir sus datos y realizar el test sin poder  volver al inicio. 


     MODO ADMINISTRADOR:

          Antes de pasar al iniciar el test, se puede activar el modo Administrador en la pestaña Edición. 
          Al seleccionar el menú Activar modo administrador nos aparecerá un diálogo en el cual podremos 
          introducir la contraseña para activarlo(contraseña: "abc"). 
          Al darle al boton Comprobar se nos avisará de si la contraseña es correcta o no, si es correcta, 
          podremos cerrar la ventana diálogo y se podrán modificar las características del test.
          Una vez activado el modo administrador, su respectivo menú pasará a desactivarse, y el menú 
          desactivar modo administrador pasará a estar disponible, si le damos, se volverán a bloquear las 
          características del test. Si por algún casual al iniciar el test queda el modo Administrador, no
          pasaría nada por que una vez se muestren las preguntas no se podrá acceder al modo
          administrador, y al finalizar el test lo tendremos desactivado para que el alumno no pueda
          ver su resultado.



PANTALLA PREGUNTAS
-------------------------------
     Una vez iniciado el test, se nos mostrará la primera pregunta, por cuestiones de programación y
     estética los tres botones inferiores son del mismo tamaño, con lo cual puede haber confusión de
     darle al botón finalizar test sin querer, por eso nos aparecerá un nuevo diálogo preguntando si
     queremos finalizar el test (no me ha dado tiempo a implementarlo pero quería añadir que si el
     número de preguntas sin contestar es igual o superior al número de fallos para aprobar/suspender
     que nos informase también de ello).


     BOTONES OPCION A, B, C, D:

          Los botones funcionan de manera que se puede seleccionar cualquiera pero solo va a haber
          seleccionado uno, a parte de esto, a los botones no se les puede quitar la selección, esto lo he
          hecho porque una pregunta no contestada tiene el mismo valor que una incorrecta. Cuando
          marcamos una opción quedará marcada para siempre, de manera que las respuestas que
          demos quedarán almacenadas para cuando volvamos de nuevo a la misma pregunta contestada.


     BOTONES PREGUNTA ANTERIOR Y SIGUIENTE:

          Los botones <-- y --> son para movernos entre las preguntas, pueden ser pulsados de forma
          indefinida, reccoriendo así la lista de preguntas de un extremo a otro sin problemas.



PANTALLA RESULTADOS
--------------------------------
     Por último, cuando el alumno finalice el test, sus datos personales, la información del test realizado
     y las preguntas que ha contestado y no podrá hacer nada más.

     Una vez llegados a este punto es cuando el examinador puede activar de nuevo el modo administrador, 
     cuando lo haya hecho aparecerá un nuevo botón Informes, si hacemos clic nos aparecerá el informe de 
     errores del test, que nos informará  de cuantas preguntas ha fallado y de al calificación del alumno.

     Con el modo Administrador activado el botón volver a inicio pasará a estar disponible, si clicamos en
     él se reiniciará el programa y no los dejará preparado para volver a hacer un nuevo test, esta vez con 
     el modo Administrador ya activado.



JUSTIFICACIÓN DISEÑO Y FUNCIONAMIENTO
-----------------------------------------------------------
     El programa no da mucha libertar al abrirlo porque está ideado para que el test lo realice una persona
     que vaya a ser examinada para el carnet de conducir, con lo cual, esa persona, nada más va a poder
     hacer el test y no podrá ver su resultado cuando lo termine.
     
     Para poder modificar aspectos del test, bien sea, el número de preguntas, fallos máximos o la fuente de 
     preguntas, debemos de activar el mod0 administrador, que en este caso sería el examinador el que
     entraría a este modo antes de que alguien realice el test para poner las características acorde al test
     que se vaya a realizar, y cuando esa persona termine el test, es cuando de nueva el examinador
     activará el modo administrador para ver la calificación del test de esa persona.



FALLO A CORREGIR
--------------------------
     (Otra cosa que no me ha dado tiempo a implementar es que las preguntas no las selecciona de manera
     aleatoria, si las muestra en orden aleatorio, lo que no hace es recoger X preguntas aleatorias, debería
     de, de un json con 50 preguntas, escoger X preguntas cualquiera, y en este caso cogería las X primeras
     preguntas.

     Si alguna pregunta sale repetida, no es por que esté mal programado, si no porque en la base de datos
     las preguntas están repetidas. Mencionando lo anterior, como siempre coge las X primeras, las que no 
     estás repetidas son las 10 primeras de cada tipo de test, con lo cual si elegimos 10 preguntas para el
     test, no se repetirá ninguna.)