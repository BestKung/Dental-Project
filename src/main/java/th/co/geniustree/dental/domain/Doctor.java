/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Best
 */
@Entity
public class Doctor implements Serializable{
    @Id
    private String pid;
    private String cer;
    private String category_permit;
    private String name_th;
    private String name_en;
    private Date birthday;
    private Integer age;
    private String sex;
    private String blood;
    private String address;
    private String phone;
    private String email;
    private String work_status;

    public Doctor() {
    }

    public Doctor(String pid, String cer, String category_permit, String name_th, String name_en, Date birthday, Integer age, String sex, String blood, String address, String phone, String email, String work_status) {
        this.pid = pid;
        this.cer = cer;
        this.category_permit = category_permit;
        this.name_th = name_th;
        this.name_en = name_en;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
        this.blood = blood;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.work_status = work_status;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCer() {
        return cer;
    }

    public void setCer(String cer) {
        this.cer = cer;
    }

    public String getCategory_permit() {
        return category_permit;
    }

    public void setCategory_permit(String category_permit) {
        this.category_permit = category_permit;
    }

    public String getName_th() {
        return name_th;
    }

    public void setName_th(String name_th) {
        this.name_th = name_th;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork_status() {
        return work_status;
    }

    public void setWork_status(String work_status) {
        this.work_status = work_status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.pid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        return true;
    }
    
    
}
