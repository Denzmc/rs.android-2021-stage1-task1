package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
    //    throw NotImplementedError("Not implemented")
        if (sadArray.size>1) {
            var list: MutableList<Int>
            var isH = false
            var happyArray: Array<Int>

            list = sadArray.toMutableList()
            while (!isH) {
                if (list.size > 3) {
                    for (i in 1..(list.size - 2)) {
                        if (list[i - 1] + list[i + 1] < list[i]) {
                            list.removeAt(i)
                            isH = false
                            break
                        }
                        isH = true
                    }
                } else if (list[0] + list[2] < list[1]) {
                    list.removeAt(1)
                    isH = false
                    break
                }
            }

            happyArray = list.toTypedArray()
            return happyArray.toIntArray()

        } else return sadArray
    }
}
