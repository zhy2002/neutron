package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final RelatedPartyNodeModule module;

  public RelatedPartyNodeModule_ProvideParentUiNodeFactory(RelatedPartyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(RelatedPartyNodeModule module) {
    return new RelatedPartyNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(RelatedPartyNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
