package hello.entity;

public class Result {
    String status;
    String msg;
    Boolean isLogin;
    Object data;

    public static Result failure(String message) {
        return new Result("fail", message, false);
    }

    public static Result success(String message) {
        return new Result("OK", message, false);
    }

    private Result(String status, String msg, Boolean isLogin) {
        this(status, msg, isLogin, "");
    }

    public Result(String status, String msg, Boolean isLogin, Object data) {
        this.status = status;
        this.msg = msg;
        this.isLogin = isLogin;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public Boolean getLogin() {
        return isLogin;
    }
}