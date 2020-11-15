package model.utils;

public class ValidateUtil {

    public static boolean isValidSide(double side) {
        if (side == Double.NaN) {
            return false;
        }
        if (side == Double.POSITIVE_INFINITY) {
            return false;
        }
        return side > 0;
    }

}
