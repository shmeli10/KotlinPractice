package oop.oop_principles.polymorphism

abstract class Shape protected constructor() {
    var locationX: Int
        get() = this.locationX
        set(value: Int) {
            this.locationX = value
        }

    var locationY: Int
        get() = this.locationY
        set(value: Int) {
            this.locationY = value
        }

    var width: Double
        get() = this.width
        set(value: Double) {
            this.width = value
        }

    var height: Double
        get() = this.height
        set(value: Double) {
            this.height = value
        }

    abstract fun isHit(x: Int, y: Int): Boolean
}