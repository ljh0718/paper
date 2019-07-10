package com.yizhidou.paper.service.ex;

public class NotFoundQuestionException extends ServiceException{

    private static final long serialVersionUID = 1L;

    public NotFoundQuestionException() {
        super();
    }

    public NotFoundQuestionException(String message) {
        super(message);
    }

    public NotFoundQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundQuestionException(Throwable cause) {
        super(cause);
    }

    protected NotFoundQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
