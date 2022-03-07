package EnumTest;

public enum MEASURMENTS {
    MILIMETRAS(1.0f, "mm"),
    CENTIMETRAS(10.0f, "cm"),
    METRAS(100.0f, "m"),
    KILOMETRAS(1000.0f, "km");

    private final float i;
    private final String mm;

    MEASURMENTS(float i, String mm) {
        this.i = i;
        this.mm = mm;
    }
    public float getI(){
        return this.i;
    }
    public String getMm(){
        return this.mm;
    }
}