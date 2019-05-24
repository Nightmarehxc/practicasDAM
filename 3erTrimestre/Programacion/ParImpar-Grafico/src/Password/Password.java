package Password;

public class Password
{
    private static final String pass = "hola";
    private String input;

    public void setInput(String input) {
        this.input = input;
    }
    static int CheckPass(String input)
    {

        if(input.equals(pass))
        {
            return 0;
        }
        else {
            return 1;
        }
    }
}
