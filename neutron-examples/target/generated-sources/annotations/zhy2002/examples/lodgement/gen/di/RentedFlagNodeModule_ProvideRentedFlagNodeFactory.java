package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RentedFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RentedFlagNodeModule_ProvideRentedFlagNodeFactory
    implements Factory<RentedFlagNode> {
  private final RentedFlagNodeModule module;

  public RentedFlagNodeModule_ProvideRentedFlagNodeFactory(RentedFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RentedFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideRentedFlagNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RentedFlagNode> create(RentedFlagNodeModule module) {
    return new RentedFlagNodeModule_ProvideRentedFlagNodeFactory(module);
  }

  /** Proxies {@link RentedFlagNodeModule#provideRentedFlagNode()}. */
  public static RentedFlagNode proxyProvideRentedFlagNode(RentedFlagNodeModule instance) {
    return instance.provideRentedFlagNode();
  }
}
