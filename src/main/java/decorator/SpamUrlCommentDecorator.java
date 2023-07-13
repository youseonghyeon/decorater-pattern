package decorator;

import service.CommentService;

public class SpamUrlCommentDecorator extends CommentDecorator {

    public SpamUrlCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (filtering(comment)) {
            super.addComment(comment);
        }
    }

    private static boolean filtering(String comment) {
        return !comment.contains("http://");
    }
}
