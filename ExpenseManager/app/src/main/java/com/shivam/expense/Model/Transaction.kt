package com.shivam.expense.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.shivam.expense.table_name

@Entity(tableName = table_name)
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    val amount: Int,
    val type: String,
    val time: Long
)