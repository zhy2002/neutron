package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final OtherLiabilityListNodeModule module;

  public OtherLiabilityListNodeModule_ProvideParentUiNodeFactory(
      OtherLiabilityListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(OtherLiabilityListNodeModule module) {
    return new OtherLiabilityListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(OtherLiabilityListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}