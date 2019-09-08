package com.xzy.mybatis.pojo;

public class City {
    @Override
	public String toString() {
		return "City [idcity=" + idcity + ", cityname=" + cityname + "]";
	}

	private Integer idcity;

    private String cityname;

    public Integer getIdcity() {
        return idcity;
    }

    public void setIdcity(Integer idcity) {
        this.idcity = idcity;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }
}