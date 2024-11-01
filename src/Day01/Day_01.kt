package Day01

fun mergeAlternately(word1: String, word2: String): String {
    val merged = StringBuilder()
    val length1 = word1.length
    val length2 = word2.length
    val maxLength = maxOf(length1, length2)

    for (i in 0 until maxLength) {
        if (i < length1) merged.append(word1[i]) // Add character from word1 if available
        if (i < length2) merged.append(word2[i]) // Add character from word2 if available
    }

    return merged.toString()
}

fun main() {
    println(mergeAlternately("abc","def"))
}