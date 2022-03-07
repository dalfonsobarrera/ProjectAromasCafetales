package com.fmauriciors.projectaromascafetales.ui.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class RegisterDatabase : RoomDatabase(){

    abstract fun RegisterDao(): RegisterDao

}