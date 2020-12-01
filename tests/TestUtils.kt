import java.lang.IllegalStateException

fun String.asResource(block: (String) -> Unit) {
    val content = this.javaClass::class.java.getResource(this).readText()
    block(content)
}

inline fun <reified T> String.asListInput(): List<T> {
    val lineList = mutableListOf<T>()
    this.javaClass.getResourceAsStream(this).bufferedReader().forEachLine {
        val value = when (T::class) {
            Int::class -> it.toInt() as T
            String::class -> it as T
            else -> throw IllegalStateException("Unknown Generic Type")
        }
        lineList.add(value)
    }
    return lineList
}