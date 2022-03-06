package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")

data class Item(
    @PrimaryKey var id: Int?,
    var name:String,
    var price:Double,
    var image:String,
    var is_active:Boolean,
    var is_delete:Boolean
)

//{
//    companion object{
//        fun populate()= arrayOf(
//            Category(1,"Soup",true,false),
//            Category(2,"Brush",true,false)
//        )
//    }
//}