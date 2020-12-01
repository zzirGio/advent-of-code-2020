import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test {

    val sut = Day1()

    val SMALL_EXAMPLE = listOf(1721, 979, 366, 299, 675, 1456)

    @Test
    fun `part 1 should return correct result`() {
        // When & Then
        val result = sut.part1(SMALL_EXAMPLE)

        // Verify
        assertEquals(514579, result)
    }

    @Test
    fun `part 2 should return correct result`() {
        // When & Then
        val result = sut.part2(SMALL_EXAMPLE)

        // Verify
        assertEquals(241861950, result)
    }

    @Test
    fun `should return correct result for part 1`() {
        val input = "/Day1.txt".asListInput<Int>()
        val result = sut.part1(input)

        print("Result: $result")
    }

    @Test
    fun `should return correct result for part 2`() {
        val input = "/Day1.txt".asListInput<Int>()
        val result = sut.part2(input)

        print("Result: $result")
    }
}