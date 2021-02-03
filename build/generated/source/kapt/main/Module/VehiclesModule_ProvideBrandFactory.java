package Module;

import Models.Brand;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehiclesModule_ProvideBrandFactory implements Factory<Brand> {
  private final VehiclesModule module;

  public VehiclesModule_ProvideBrandFactory(VehiclesModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Brand get() {
    return Preconditions.checkNotNull(
        module.provideBrand(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Brand> create(VehiclesModule module) {
    return new VehiclesModule_ProvideBrandFactory(module);
  }
}
