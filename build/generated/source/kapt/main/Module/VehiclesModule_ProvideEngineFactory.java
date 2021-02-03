package Module;

import Models.Engine;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehiclesModule_ProvideEngineFactory implements Factory<Engine> {
  private final VehiclesModule module;

  public VehiclesModule_ProvideEngineFactory(VehiclesModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Engine get() {
    return Preconditions.checkNotNull(
        module.provideEngine(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Engine> create(VehiclesModule module) {
    return new VehiclesModule_ProvideEngineFactory(module);
  }
}
