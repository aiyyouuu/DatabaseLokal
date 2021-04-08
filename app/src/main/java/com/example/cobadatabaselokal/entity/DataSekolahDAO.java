package com.example.cobadatabaselokal.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
//method method untuk mengakses database, DAO (data access object)
public interface DataSekolahDAO {
    @Insert
    long insertData(DataSekolah dataSekolah);

    @Query("Select * from sekolah_db")
    List<DataSekolah> getData();

    @Update
    int updateData(DataSekolah item);

    @Delete
    void deleteData(DataSekolah item);
}
