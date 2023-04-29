package com.example.crudkotlin_basic.model


data class Student(var id:Int=0,
                   val nom:String?,
                   val prenom:String?,
                   val promo:String?,
                   val date:String?)
