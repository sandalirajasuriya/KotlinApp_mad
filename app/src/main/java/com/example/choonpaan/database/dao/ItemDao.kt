package com.example.choonpaan.database.dao

import androidx.room.*
import com.example.choonpaan.database.entity.Item


@Dao
interface ItemDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: Item)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg dataEntities: Item)

    @Query("SELECT * FROM user WHERE is_delete=0 and is_active=1 ")
    fun getAll():List<Item>?

    @Delete
    fun delete(user: Item)

    @Update
    fun update(user: Item)
}