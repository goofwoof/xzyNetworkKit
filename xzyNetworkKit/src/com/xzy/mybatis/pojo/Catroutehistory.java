package com.xzy.mybatis.pojo;

import java.util.Date;

public class Catroutehistory {
    private Integer idcatroutehistory;

    private String username;

    private String jsonhistory;

    private Date time;

    private Integer status;

    private String jsonroute;

    public Integer getIdcatroutehistory() {
        return idcatroutehistory;
    }

    public void setIdcatroutehistory(Integer idcatroutehistory) {
        this.idcatroutehistory = idcatroutehistory;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getJsonhistory() {
        return jsonhistory;
    }

    public void setJsonhistory(String jsonhistory) {
        this.jsonhistory = jsonhistory == null ? null : jsonhistory.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getJsonroute() {
        return jsonroute;
    }

    public void setJsonroute(String jsonroute) {
        this.jsonroute = jsonroute == null ? null : jsonroute.trim();
    }
}