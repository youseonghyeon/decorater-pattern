package service;

import decorator.SpamUrlCommentDecorator;
import decorator.TrimCommentDecorator;

public class App {

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        commentService = new SpamUrlCommentDecorator(commentService);
        commentService = new TrimCommentDecorator(commentService);

        commentService.addComment("http://www.google.com");
        commentService.addComment("Hello...");
        commentService.addComment("World!");


    }
}
