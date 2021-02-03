package Module

import Models.Brand
import Models.Car
import Models.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module  //This annotation indicates that the class can make dependencies available to the container
class VehiclesModule {

    @Provides  //This annotation tells us that this method provide the dependency which is to be injected
   fun provideEngine():Engine{
       return Engine()
   }

    @Provides
    @Singleton//we give the singleton scope to our Brand instance so all the car instances share the same brand object
    fun provideBrand():Brand{
        return Brand()
    }


}