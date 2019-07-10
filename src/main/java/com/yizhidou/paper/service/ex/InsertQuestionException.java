package com.yizhidou.paper.service.ex;

/**
 * 插入数据异常
 */
public class InsertQuestionException extends ServiceException{

    private static final long serialVersionUID = 1L;

    public InsertQuestionException() {
        super();
    }

    public InsertQuestionException(String message) {
        super(message);
    }

    public InsertQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertQuestionException(Throwable cause) {
        super(cause);
    }

    protected InsertQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
