package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        try {
            val userInput = "abc"
            val number = userInput.toInt()
            println("Bilangan yang dihasilkan: $number")
        } catch (e: NumberFormatException) {
            println("Terjadi kesalahan: ${e.message}. Masukkan harus berupa bilangan bulat.")
        }
    }
