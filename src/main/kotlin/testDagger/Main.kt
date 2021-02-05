package TestDagger

import Components.DaggerVehiclesComponent
import components.VehiclesComponent
import models.Brand
import models.Car
import models.Engine
import javax.inject.Inject

fun main() {
    var component=DaggerVehiclesComponent.builder().build()

    //lets fetch the object of Car
    val car = component.buildCar()
    val car2 = component.buildCar()

    println(car.message())

    val b1: Brand =car.brand
    val b2: Brand =car2.brand

    println(b1)
    println(b2)

    val e1: Engine =car.engine
    val e2: Engine =car2.engine

    println(e1)
    println(e2)







    //lets fetch the object of Brand
//    var brand:Brand = car.brand
//    println(brand.brandName())

    //lets fetch the object of Engine
//    var engine:Engine = car.engine
//    println(engine.engineCapacity())

}