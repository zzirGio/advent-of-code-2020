class Day1 {
    // find the two entries that sum to 2020 and then multiply those two numbers together.
    fun part1(expenses: List<Int>): Int {
        expenses.forEachIndexed { index, expense ->
            for (i in (index + 1) until expenses.size - 1) {
                val otherExpense = expenses[i]
                if (otherExpense + expense == 2020) {
                    println("{$expense, $otherExpense}")
                    return otherExpense * expense;
                }
            }
        }

        // assuming correct input, we shouldn't reach this.
        throw IllegalStateException("Expenses report is not valid")
    }

    fun part2(expenses: List<Int>): Int {
        expenses.forEachIndexed { index, expense ->
            for (i in (index + 1) until expenses.size - 2) {
                for (j in (i + 1) until expenses.size - 1) {
                    if (expense + expenses[i] + expenses[j] == 2020) {
                        println("{$expense, ${expenses[i]}, ${expenses[j]}}")
                        return expense * expenses[i] * expenses[j];
                    }
                }
            }
        }

        // assuming correct input, we shouldn't reach this.
        throw IllegalStateException("Expenses report is not valid")
    }
}