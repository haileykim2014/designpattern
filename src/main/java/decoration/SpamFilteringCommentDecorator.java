package decoration;

public class SpamFilteringCommentDecorator extends CommentDecorator{
    public SpamFilteringCommentDecorator(CommonService commonService) {
        super(commonService);
    }

    @Override
    public void addComment(String comment) {
        if(isNotSpam(comment)){
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment){
        return !comment.contains("http");
    }

}
