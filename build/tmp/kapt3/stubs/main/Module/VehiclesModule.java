package Module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"LModule/VehiclesModule;", "", "()V", "provideBrand", "LModels/Brand;", "provideCar", "LModels/Car;", "provideEngine", "LModels/Engine;", "Dagger-Demo"})
@dagger.Module()
public final class VehiclesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final Models.Engine provideEngine() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final Models.Brand provideBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final Models.Car provideCar() {
        return null;
    }
    
    public VehiclesModule() {
        super();
    }
}