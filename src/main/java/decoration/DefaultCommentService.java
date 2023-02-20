package decoration;

public class DefaultCommentService implements CommonService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
