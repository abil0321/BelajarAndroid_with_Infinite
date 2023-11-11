package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstname: String = "Muhammad "
    val lastname: String = "Salsabil "
    val age: Int = 22
    val status: Boolean = true

    println("Nama Depan: $firstname \n" +
            "Nama Belakang: $lastname \n" +
            "Umur: $age \n" +
            "Status: ${if (status) "Single" else "Tidak Single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }
    println("Session: $session")
    return "Detail group telah dicetak."
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

val groupMembers = listOf(
    "Muhammad Salsabil", "Fina Handalita Tri Damayanti", "Gohand Brilliant Silitonga",
    "Jodhy Herlambang S", "M. Yayang Zaelani", "Khoirina Azyyati", "Adi Prayogo",
    "Nova Yuniariyati", "Shella Yusnita", "Daffa Fadillah Rachman", "Aflah Nabil Kristiawan"
)
fun myTeam(): List<Any> {
    val myName = groupMembers[0]
    return listOf(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("kk reza", "kk ayat", "kk widya")
    val countOfGroup = mentor.size + groupMembers.size;

    return countOfGroup;
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("1", listOf(groupMembers), "Morning")

}