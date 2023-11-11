package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    fun checkAnemia(hemoglobinLevel: Double) {
        try {
            if (hemoglobinLevel < 12.0) {
                throw AnemiaException("Anda memiliki tingkat hemoglobin rendah, mungkin mengalami anemia.")
            } else {
                println("Tingkat hemoglobin Anda normal.")
            }
        } catch (e: AnemiaException) {
            println("Error: ${e.message}")
            // Lakukan tindakan atau penanganan khusus untuk kasus anemia
        }
    }

    // pemanggilan fungsi checkAnemia

    checkAnemia(14.5) // Hemoglobin normal
    checkAnemia(10.0) // Menimbulkan AnemiaException
}

class AnemiaException(message: String) : Exception(message)
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
