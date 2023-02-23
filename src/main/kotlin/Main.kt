fun main(){
    hanoiTowerHelper(4)
}


fun hanoiTowerHelper(n: Int) {
    if (n < 4) {
        print("Che du katak es anum...")
        return
    }

    val towerA = "A"
    val towerB = "B"
    val towerC = "C"

    hanoiTower(n, towerA, towerB, towerC)
}
fun hanoiTower(
    n: Int,
    startingRod: String,
    otherRod: String,
    endingRod: String
) {
    if (n == 1) {
        println("Move disk 1 from $startingRod --> $endingRod")
    } else {
        hanoiTower(n - 1, startingRod, endingRod, otherRod)
        println("Move disk $n from $startingRod --> $endingRod")
        hanoiTower(n - 1, otherRod, startingRod, endingRod)

    }
}