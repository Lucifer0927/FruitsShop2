package bwie.com.fruitsshop.shopping;

import android.widget.CheckBox;

/**
 * Created by 葛凯旋 on 2017/8/11.
 */

public class ShopBean {
    private int id;
    private String shoppName;
    private int dressSize;
    private String attribute;
    private double price;
    public boolean isChoosed;
    public boolean isCheck = false;
    private int count;
    public   ShopBean(){

    }
    public ShopBean(int id, String shoppName, int dressSize, String attribute, double price, boolean isChoosed, boolean isCheck, int count) {
        this.id = id;
        this.shoppName = shoppName;
        this.dressSize = dressSize;
        this.attribute = attribute;
        this.price = price;
        this.isChoosed = isChoosed;
        this.isCheck = isCheck;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShoppName() {
        return shoppName;
    }

    public void setShoppName(String shoppName) {
        this.shoppName = shoppName;
    }

    public int getDressSize() {
        return dressSize;
    }

    public void setDressSize(int dressSize) {
        this.dressSize = dressSize;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
