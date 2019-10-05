import java.util.Date;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class Notice {
    private int id;//公告ID
    private String title;//公告title
    private String creator;//公告发布人
    private Date createtime;//公告发布时间

    public Notice(int id, String title, String creator, Date createtime) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
