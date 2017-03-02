package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final RelatedPersonReferenceNodeModule module;

  public RelatedPersonReferenceNodeModule_ProvideLeafUiNodeFactory(
      RelatedPersonReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(RelatedPersonReferenceNodeModule module) {
    return new RelatedPersonReferenceNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPersonReferenceNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(RelatedPersonReferenceNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
