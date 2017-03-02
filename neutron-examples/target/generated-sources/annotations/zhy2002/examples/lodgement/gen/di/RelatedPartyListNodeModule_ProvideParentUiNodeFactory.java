package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final RelatedPartyListNodeModule module;

  public RelatedPartyListNodeModule_ProvideParentUiNodeFactory(RelatedPartyListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(RelatedPartyListNodeModule module) {
    return new RelatedPartyListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(RelatedPartyListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
