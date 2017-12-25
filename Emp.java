package cn.ylcto.vo;

import java.io.Serializable;

/**
 * Created by 逍遥阁 on 2017/12/25.
 */
public class Emp implements Serializable {
    private String ename="zxxxx";
    private String note="hhhhhh";

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
