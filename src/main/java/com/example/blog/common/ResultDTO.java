package com.example.blog.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
public class ResultDTO<T> implements Serializable {

    private static final long serialVersionUID = 2783377098145240357L;
    private Integer code;
    private String message;
    private T data;

    public ResultDTO(T data) {
        this.code = HttpStatus.OK.value();
        this.message = "操作成功";
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultDTO)) {
            return false;
        } else {
            ResultDTO<?> other = (ResultDTO) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47:
                {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResultDTO;
    }



    public String toString() {
        return "ResultDTO(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    public ResultDTO() {
        this.code = HttpStatus.OK.value();
        this.message = "操作成功";
    }

    public ResultDTO(final Integer code, final String message, final T data) {
        this.code = HttpStatus.OK.value();
        this.message = "操作成功";
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
