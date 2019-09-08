package com.xzy.mybatis.pojo;

public class Areas {
	
    @Override
	public String toString() {
		return "Areas [id=" + id + ", city=" + city + ", area=" + area + ", address=" + address + "]";
	}

	private Integer id;

    private String city;

    private String area;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}