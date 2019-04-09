package Trivial;

public class Enunciado
{
    String pregunta;
    String respuesta;

    public Enunciado(String a_pregunta, String a_respuesta) {
        this.pregunta = a_pregunta;
        this.respuesta = a_respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String a_pregunta) {
        this.pregunta = a_pregunta;
    }

    public  String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String a_respuesta) {
        this.respuesta = a_respuesta;
    }
}
