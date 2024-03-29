package com.peng.subject.common.enums;

public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(500,"失败");

    private Integer code;

    private String desc;

    ResultCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeVal){
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()){
            if (resultCodeEnum.getCode().equals(codeVal)){
                return resultCodeEnum;
            }
        }
        return null;
    }
}
