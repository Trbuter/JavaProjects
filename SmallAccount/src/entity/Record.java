package entity;

import java.util.Date;

/**
 * @Program: SmallAccount
 * @Description:
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class Record {
    private int spend;
    private int id;
    private int cid;
    private String comment;
    private Date date;

    public Record() {
    }

    public Record(int id,int spend, int cid, String comment, Date date) {
        this.spend = spend;
        this.id = id;
        this.cid = cid;
        this.comment = comment;
        this.date = date;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
