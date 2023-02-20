package decoration;

public class CommentDecorator implements CommonService{
    private CommonService commonService;

    public CommentDecorator(CommonService commonService) {
        this.commonService = commonService;
    }

    @Override
    public void addComment(String comment) {
        commonService.addComment(comment);
    }
}
