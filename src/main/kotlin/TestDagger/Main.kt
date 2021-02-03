package TestDagger

import Components.DaggerVehiclesComponent
import Components.VehiclesComponent
import Models.Brand
import Models.Car
import Models.Engine
import javax.inject.Inject

fun main() {
    var component=DaggerVehiclesComponent.builder().build()

    //lets fetch the object of Car
    val car = component.buildCar()
    println(car.Message())

    //lets fetch the object of Brand
    var brand:Brand = car.brand
    println(brand.brandName())

    //lets fetch the object of Engine
    var engine:Engine = car.engine
    println(engine.engineCapacity())

}