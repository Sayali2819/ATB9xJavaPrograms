package Nov.ex_14112024_Static_Wrapper;

public class Enum_example {
    public static void main(String[] args) {
        System.out.println(Color.GREEN.getValue());
        System.out.println(Color.BLUE.getValue());
        String code = Color.BLUE.getValue();
        if(code.equals("#3377FF"))
        {
            System.out.println("Color is Blue!");
        }
    }
}

enum Color
{

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");


    private String hexcode;

    Color(String hexcode)
    {
        this.hexcode = hexcode;
    }

    String getValue()
    {
        return hexcode;
    }
}
