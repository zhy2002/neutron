package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.ReferenceUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNodeModule_ProvideReferenceUiNodeFactory
    implements Factory<ReferenceUiNode<?>> {
  private final RelatedPersonReferenceNodeModule module;

  public RelatedPersonReferenceNodeModule_ProvideReferenceUiNodeFactory(
      RelatedPersonReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ReferenceUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideReferenceUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ReferenceUiNode<?>> create(RelatedPersonReferenceNodeModule module) {
    return new RelatedPersonReferenceNodeModule_ProvideReferenceUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPersonReferenceNodeModule#provideReferenceUiNode()}. */
  public static ReferenceUiNode<?> proxyProvideReferenceUiNode(
      RelatedPersonReferenceNodeModule instance) {
    return instance.provideReferenceUiNode();
  }
}
