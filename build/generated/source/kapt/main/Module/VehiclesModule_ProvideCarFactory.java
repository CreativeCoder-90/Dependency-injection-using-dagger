package Module;

import Models.Car;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehiclesModule_ProvideCarFactory implements Factory<Car> {
  private final VehiclesModule module;

  public VehiclesModule_ProvideCarFactory(VehiclesModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Car get() {
    return Preconditions.checkNotNull(
        module.provideCar(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Car> create(VehiclesModule module) {
    return new VehiclesModule_ProvideCarFactory(module);
  }
}
