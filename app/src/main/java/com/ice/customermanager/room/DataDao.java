package com.ice.customermanager.room;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface DataDao {
    String tableName = "Customer";

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertData(CustomerEntity customerEntity);


    @Update
    void updateData(CustomerEntity customerEntity);

    @Delete
    void deleteData(CustomerEntity customerEntity);

    @Query("SELECT * FROM " + tableName)
    void getAllData();

//    @Query("SELECT * FROM " + tableName)
//    void getDataByName();



}
