package decoration;

public class App {
    private static boolean enableSpanFilter = true;
    private static boolean enableTrimming = true;

    public static void main(String[] args){
        CommonService service = new DefaultCommentService();

        if (enableSpanFilter) {
            SpamFilteringCommentDecorator spamFilteringCommentDecorator = new SpamFilteringCommentDecorator(service);
        }

        Client client = new Client(service);
        client.writeComment("http");
    }
}
