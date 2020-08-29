import java.util.*
import kotlin.math.ceil

fun main(){

    //Identitas
    val input = Scanner(System.`in`)
    println("==========Identitas==========")
    
    println("Masukkan Nama : ")
    val nama: String? = input.nextLine()
    if (nama.isNullOrEmpty()) {
        println("Nama is required")
        main()
    }
    println("Masukkan Absen : ")
    val absen: String? = input.nextLine()
    if (nama.isNullOrEmpty()){
        println("Absen is required")
    }

    println("Masukkan Kelas : ")
    val kelas: String? = input.nextLine()
    if (kelas.isNullOrEmpty()){
        println("Kelas is required")
    }

    //scanner
    val inputUser = Scanner(System.`in`)

    //initialize class
    val t = tabung()
    val k = kerucut()

    //menu
    println("==========Mari Kita Belajar Berhitung==========")
    println("1. Kerucut")
    println("2. Tabung")
    print("Pilih Menu Diatas : ")
    when {
        inputUser.nextInt() == 1 -> {

            //volume kerucut
            print("Tinggi Kerucut : ")
            k.tinggi = inputUser.nextFloat()
            print("Jari-jari Kerucut : ")
            k.jari = inputUser.nextFloat()
            println("Berapa volume kerucut tersebut?")
            println("Jika diketahui : \n Jari-jari ${k.jari} \n Tinggi ${k.tinggi}")


            //hasil volume kerucut
            val volumeKerucut = volumeKerucut(k.jari!!, k.tinggi!!)

            //ceil
            val volumeBulatkan = ceil(volumeKerucut)
            println("Jawab : \n Rumus kerucut adalah ( (1/3) * (22/7) * r * r * tinggi )\n Jadi volume kerucut adalah "
                    + String.format("%.2f", volumeKerucut )
                    + "\n Dan volume kerucut setelah dibulatkan $volumeBulatkan")

        }
        inputUser.nextInt() == 2 -> {

            //volume tabung
            print("Tinggi Tabung : ")
            t.tinggi = inputUser.nextFloat()
            print("Jari-Jari Tabung : ")
            t.jari = inputUser.nextFloat()
            println("Berapa volume tabung tersebut?")
            println("Jika diketahui : \n Jari-jari ${t.jari} \n Tinggi ${t.tinggi}")

            //hasil volume tabung
            val volumeTabung = volumeTabung(t.jari!!, t.tinggi!!)
            //ceil
            val volumeBulat = ceil(volumeTabung)
            println("Jawab : \n Rumus tabung yaitu ( (22/7) * r * r * tinggi )\n Jadi volume tabung adalah "
                    + String.format("%.2f", volumeTabung )
                    + "\n Dan volume tabung setelah dibulatkan $volumeBulat")


        }
        else -> {
            println("Maaf Menu Belum Tersedia!")
        }
    }

}

fun volumeKerucut(r : Float, t : Float) : Double{
    return (Math.PI * r * r) * t / 3
}
fun volumeTabung(r : Float, t : Float) : Double {
    return (Math.PI * r * r) * t
}