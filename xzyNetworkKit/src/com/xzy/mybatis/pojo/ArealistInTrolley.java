package com.xzy.mybatis.pojo;

import java.util.Date;

public class ArealistInTrolley {
    @Override
	public String toString() {
		return "ArealistInTrolley [idarealistInTrolley=" + idarealistInTrolley + ", username=" + username + ", areaid="
				+ areaid + ", ap=" + ap + ", addtime=" + addtime + "]";
	}

	private Integer idarealistInTrolley;//主键不需要输入

    private String username;//用户ID

    private Integer areaid;//景区ID

    private String ap;//JSON格式的景区地址（具体，老王跟我说的还没通）

    private Date addtime;//加购时间，可以同idarealistInTrolley 传空值即可

    private Integer status;//这个加入的记录的状态，还没想清怎么设置，暂时保留吧

    public Integer getIdarealistInTrolley() {
        return idarealistInTrolley;
    }

    public void setIdarealistInTrolley(Integer idarealistInTrolley) {
        this.idarealistInTrolley = idarealistInTrolley;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap == null ? null : ap.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}