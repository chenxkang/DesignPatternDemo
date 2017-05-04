package com.designpatterndemo.chenxkang.patterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * author: chenxkang
 * time  : 17/4/12
 * desc  : 原型类
 */

public class MonkeyPrototype implements Cloneable, Serializable{

    private String name;
    private String category;
    private Address address;

    public MonkeyPrototype(String name, String category, Address address) {
        this.name = name;
        this.category = category;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深克隆
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入到流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
}
