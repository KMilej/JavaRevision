public class StringConcatenator {

    public String concatenate(String one, String two) {

        return (one + " " + two);
    }

    public String concatenate(String one, String two, String three) {

        return (one + " " + two + " " + three);
    }

    public String concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s: strings) {
            sb.append(s);
        }
    return sb.toString();

    }





}
