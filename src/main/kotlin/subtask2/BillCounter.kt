package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
//        throw NotImplementedError("Not implemented")
        var list = mutableListOf<Int>()
        var sum = 0
        var answer = ""

        list = bill.toMutableList()

        list.removeAt(k)

        for (i in list){
            sum += i
        }

        if (sum/2 == b){
            answer = "bon appetit"
        }
        else{
            answer = "${b - sum/2}"
        }

        return answer
    }
}
