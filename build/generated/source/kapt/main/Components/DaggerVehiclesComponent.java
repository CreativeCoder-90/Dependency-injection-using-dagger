package Components;

import Models.Car;
import Module.VehiclesModule;
import Module.VehiclesModule_ProvideCarFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerVehiclesComponent implements VehiclesComponent {
  private Provider<Car> provideCarProvider;

  private DaggerVehiclesComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VehiclesComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideCarProvider = VehiclesModule_ProvideCarFactory.create(builder.vehiclesModule);
  }

  @Override
  public Car buildCar() {
    return provideCarProvider.get();
  }

  public static final class Builder {
    private VehiclesModule vehiclesModule;

    private Builder() {}

    public VehiclesComponent build() {
      if (vehiclesModule == null) {
        this.vehiclesModule = new VehiclesModule();
      }
      return new DaggerVehiclesComponent(this);
    }

    public Builder vehiclesModule(VehiclesModule vehiclesModule) {
      this.vehiclesModule = Preconditions.checkNotNull(vehiclesModule);
      return this;
    }
  }
}
