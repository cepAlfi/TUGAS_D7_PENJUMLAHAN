class UserInput() {
    internal fun penjumalahan() {
        println("==========Program penjumlahan==========")

        print("Masukkan Nilai Pertama: ")
        var bilanganPertama = readLine()
        print("Masukkan Nilai Kedua: ")
        var bilanganKedua = readLine()

        println("=======================================")

        if (bilanganPertama != null) {
            if (bilanganKedua != null) {
                print("Hasil dari bilangan tersebut adalah ${bilanganPertama.toInt() + bilanganKedua.toInt()}")
            }
        }
    }
}