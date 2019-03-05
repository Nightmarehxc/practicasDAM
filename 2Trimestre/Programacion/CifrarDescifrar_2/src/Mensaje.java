public class Mensaje {

    static String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static String cifrar(int nPosiciones) {
        StringBuilder mensajeEncriptado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char ch = mensaje.charAt(i);

            if (Character.isUpperCase(ch)) {
                mensajeEncriptado = mensajeEncriptado.append((char) ((ch - 'A') + nPosiciones) % 26 + 'A');
            } else {

                mensajeEncriptado = mensajeEncriptado.append((char) (((ch - 'a') + nPosiciones) % 26 + 'a'));
            }
        }
        return mensajeEncriptado.toString();
    }

    public static String descifrar(int nPosiciones) {
        return cifrar(nPosiciones);
        /*StringBuilder mensajeDesencriptado = new StringBuilder();

        System.out.println("Mensaje Desencriptado: ");

        for (int i = 0; i < mensaje.length(); i++) {
            char ch = mensaje.charAt(i);
            if (Character.isUpperCase(ch))
                mensajeDesencriptado = mensajeDesencriptado.append((char) (((ch - 'A') + 13) % 26 + 'A'));
            else
                mensajeDesencriptado = mensajeDesencriptado.append((char) (((ch - 'a') + 13) % 26 + 'a'));
        }
        return "El mensaje desencriptado es: " + mensajeDesencriptado.toString();
    }*/
    }

}

