package decoration;

public class Client {
    private CommonService commonService;

    public Client(CommonService commonService) {
        this.commonService = commonService;
    }

    public void writeComment(String comment){
        commonService.addComment(comment);
    }
}
