package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final OtherLiabilityNodeModule module;

  public OtherLiabilityNodeModule_ProvideParentUiNodeFactory(OtherLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(OtherLiabilityNodeModule module) {
    return new OtherLiabilityNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(OtherLiabilityNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
