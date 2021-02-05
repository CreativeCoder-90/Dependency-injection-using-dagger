package models

import javax.inject.Inject

class Car {
      var brand: Brand
      var engine: Engine

   @Inject  //This annotation is used to inform the dagger that how it would create a object of car
   constructor(engine: Engine, brand: Brand){
       this.engine=engine
       this.brand=brand
   }

    fun message(){
        println("Dagger has injected the dependencies of car")
    }

}