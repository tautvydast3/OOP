package EnumTest;

public class EnumTest {
    public static void main(String[] args) {
        MEASURMENTS m1 = MEASURMENTS.MILIMETRAS;
        MEASURMENTS m2 = MEASURMENTS.CENTIMETRAS;
        MEASURMENTS m3 = MEASURMENTS.METRAS;
        MEASURMENTS m4 = MEASURMENTS.KILOMETRAS;

        System.out.println(MEASURMENTS.MILIMETRAS.getI() + MEASURMENTS.MILIMETRAS.getMm());
        System.out.println(MEASURMENTS.CENTIMETRAS.getI() + MEASURMENTS.CENTIMETRAS.getMm());
        System.out.println(MEASURMENTS.METRAS.getI() + MEASURMENTS.METRAS.getMm());
        System.out.println(MEASURMENTS.KILOMETRAS.getI() + MEASURMENTS.KILOMETRAS.getMm());
    }
}
