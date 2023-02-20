package decoration;

import static org.thymeleaf.util.StringUtils.trim;

public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommonService commonService) {
        super(commonService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment){
        return comment.replace("...","");
    }
}
