
package candidatesprogram;

public enum Area {
    
    //Declare constructor and methoud
    // must be private and final
    None(0,"None"),
    Area1(1, "Area1"),
    Area2(2, "Area2");
    
    private final int code;
    private final String text;

    private Area(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }
    
    public static Area getAreaByCode(int code){
        for (Area area: Area.values()){
            if (area.code == code){
                return area;
            }
        }
        return null;
    }    
}
