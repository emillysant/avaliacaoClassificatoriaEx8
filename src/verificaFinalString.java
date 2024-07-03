public class verificaFinalString {

    public boolean verificaFinalString(String string1, String string2) {
        if (string1.length() >= 2 && string1.length() >= 2) {
            String finalString1 = string1.substring(string1.length() - 2);
            String inicioString2 = string2.substring(0, 2);
            return finalString1.equals(inicioString2);
        }
        return false;
    }

}
