package com.synerf.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "employee-table")
data class EmployeeEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String = "",

    @ColumnInfo(name = "email-id")  // To internally store the email as 'email-id'
    val email: String = ""          // (if not mentioned explicitly, it will use the variable name)

)
