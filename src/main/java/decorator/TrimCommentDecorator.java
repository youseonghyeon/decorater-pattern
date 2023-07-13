package decorator;

import service.CommentService;

public class TrimCommentDecorator extends CommentDecorator{
    public TrimCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trimComment(comment));
    }

    private static String trimComment(String comment) {
        return comment.replace("...", "");
    }
}
