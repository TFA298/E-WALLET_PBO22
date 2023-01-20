public class NumericString {

    public static String generate(int length) {
        String numericString = "0123456789";
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int) (numericString.length() * Math.random());
            sb.append(numericString.charAt(index));
        }

        return sb.toString();
    }
}
