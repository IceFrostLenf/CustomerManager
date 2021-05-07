package com.ice.customermanager.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity(tableName = "Customer")
public class CustomerEntity {
    @PrimaryKey(autoGenerate = true)
    String Uuid;
    String Name;
    boolean Gender;
    Date Birthday;
    String PhoneNumber;
    String IdCard;
    String DepartmentName;
    Date AppropriateDate;
    double AppropriateMoney;
    double Rate;

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public Date getAppropriateDate() {
        return AppropriateDate;
    }

    public void setAppropriateDate(Date appropriateDate) {
        AppropriateDate = appropriateDate;
    }

    public double getAppropriateMoney() {
        return AppropriateMoney;
    }

    public void setAppropriateMoney(double appropriateMoney) {
        AppropriateMoney = appropriateMoney;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }
}