public class Task20 {
    public void task20(){
        System.out.println("Text Block");

        String text = "{\n" +
                "  \"id\": 58,\n" +
                "  \"firstName\": \"Emma\",\n" +
                "  \"lastName\": \"Dean\",\n" +
                "  \"email\": \"kbite@gylhb.com\",\n" +
                "  \"active\": true,\n" +
                "  \"tags\": [\n" +
                "    \"case\"\n" +
                "  ],";
        String textBlocks = """
                {
                  "id": 58,
                  "firstName": "Emma",
                  "lastName": "Dean",
                  "email": "kbite@gylhb.com",
                  "active": true,
                  "tags": [
                    "case"
                  ],""";
        System.out.println(text);
        System.out.println();
        System.out.println(textBlocks);
    }

}
