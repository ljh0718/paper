package com.yizhidou.paper.service.ex;

/**
 * 删除数据异常
 */
public class DeleteQuestionException extends ServiceException{

    private static final long serialVersionUID = 1L;

    public DeleteQuestionException() {
        super();
    }

    public DeleteQuestionException(String message) {
        super(message);
    }

    public DeleteQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteQuestionException(Throwable cause) {
        super(cause);
    }

    protected DeleteQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
