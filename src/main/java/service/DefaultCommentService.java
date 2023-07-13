package service;

public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        print(comment);
    }

    private void print(String comment) {
        System.out.println(comment);
    }
}
