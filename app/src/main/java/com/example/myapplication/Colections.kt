package com.example.myapplication

fun ContohList() {
    println("== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutbale
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hannya menyimpan data unik(tidak ada duplikasi)
//Set berfifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//Set berfungsi mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diuabah
//Set Read-Only menggunakan setOf
//Set Mutable Menggunakan mutableOf

fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Read-Only
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square","Triangle")
    println(shape)


    //Menambahkan data ke dalam  Set Mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari Set Mutable
    shape.remove("Circle")

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)

}

//Map adalah kumpulan data yang disusun dalam pasangan key-value
//Map bersifat unorderd, artinya data yang dimasukkan tidak memiliki posisi tertentu
//Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diuabah
//Map Read-Only menggunakan setOf
//Map Mutable Menggunakan mutableOf

fun ContohMap() {
    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    //Mengubah data dari map mutable
    shape["Square"] = 5
    println(shape)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}
 fun main(){
     ContohList()
     ContohSet()
     ContohMap()

 }