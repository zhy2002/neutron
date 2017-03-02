package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final TrustSettlorListNodeModule module;

  public TrustSettlorListNodeModule_ProvideParentUiNodeFactory(TrustSettlorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(TrustSettlorListNodeModule module) {
    return new TrustSettlorListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link TrustSettlorListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(TrustSettlorListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}