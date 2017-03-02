package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final RealEstateNodeModule module;

  public RealEstateNodeModule_ProvideParentUiNodeFactory(RealEstateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(RealEstateNodeModule module) {
    return new RealEstateNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link RealEstateNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(RealEstateNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
