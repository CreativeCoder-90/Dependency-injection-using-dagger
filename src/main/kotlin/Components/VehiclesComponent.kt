package Components

import Models.Car
import Module.VehiclesModule

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [VehiclesModule::class])  //This annotation provides the object of car and its dependencies
interface VehiclesComponent {
    fun buildCar():Car
}