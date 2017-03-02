package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RealEstateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNodeModule_ProvideRealEstateNodeFactory
    implements Factory<RealEstateNode> {
  private final RealEstateNodeModule module;

  public RealEstateNodeModule_ProvideRealEstateNodeFactory(RealEstateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RealEstateNode get() {
    return Preconditions.checkNotNull(
        module.provideRealEstateNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RealEstateNode> create(RealEstateNodeModule module) {
    return new RealEstateNodeModule_ProvideRealEstateNodeFactory(module);
  }

  /** Proxies {@link RealEstateNodeModule#provideRealEstateNode()}. */
  public static RealEstateNode proxyProvideRealEstateNode(RealEstateNodeModule instance) {
    return instance.provideRealEstateNode();
  }
}
