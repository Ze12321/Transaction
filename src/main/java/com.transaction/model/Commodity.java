package com.transaction.model;

import java.util.Date;

public class Commodity {
    private Integer id;//id号
    private Integer product_no;//商品编号
    private String product_name;//商品名称
    private String product_type;//商品分类
    private Date shelf_time;//上架时间
    private double product_price;//商品价格
    private String product_Iimage;//商品图片
    private String product_info;//商品描述
    private String remarks;//卖家备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_no() {
        return product_no;
    }

    public void setProduct_no(Integer product_no) {
        this.product_no = product_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Date getShelf_time() {
        return shelf_time;
    }

    public void setShelf_time(Date shelf_time) {
        this.shelf_time = shelf_time;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_Iimage() {
        return product_Iimage;
    }

    public void setProduct_Iimage(String product_Iimage) {
        this.product_Iimage = product_Iimage;
    }

    public String getProduct_info() {
        return product_info;
    }

    public void setProduct_info(String product_info) {
        this.product_info = product_info;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
