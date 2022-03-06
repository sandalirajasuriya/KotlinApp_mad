package com.example.choonpaan.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp


@Entity(tableName = "order")
data class Order(

    @PrimaryKey var id: Long?,
    var total:Double,
    var cash:Double,
    var card:Double,
    var time:Timestamp?,
)