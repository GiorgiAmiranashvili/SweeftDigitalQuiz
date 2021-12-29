fun delete(givenArray: IntArray, i: Int): IntArray {
    if (i >= givenArray.size || i < 0) return givenArray;
    var afterDelete = givenArray.toMutableList()
    afterDelete.removeAt(i)
    return afterDelete.toIntArray()
}
fun main() {
    var givenArray = intArrayOf(5, 7, 1, 1, 9, 5, 7, 6, 2);
    var i = 5;
    givenArray = delete(givenArray, i);
    println(givenArray.contentToString());
}