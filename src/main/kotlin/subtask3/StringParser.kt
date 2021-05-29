package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val list: MutableList<String> = mutableListOf()
        val map = mapOf('<' to '>', '(' to ')', '[' to ']')

        var sec = ""

        for (i in 0..inputString.length - 1){

            sec = ""

            if (map.containsKey(inputString[i])) {
                val openKey = inputString[i]
                val closeKey = map[inputString[i]]
                var x = 1
                for (j in i + 1 .. inputString.length - 1){
                    if (openKey == inputString[j]){
                        x++
                    }
                    if (inputString[j] == closeKey){
                        x--
                    }
                    if (x == 0){
                        list.add(sec)
                        break
                    }
                    sec += inputString[j]
                }
            }
        }
        return list.toTypedArray()
    }
}
