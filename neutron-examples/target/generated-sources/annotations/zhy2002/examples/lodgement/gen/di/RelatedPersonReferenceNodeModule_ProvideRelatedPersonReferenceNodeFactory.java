package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RelatedPersonReferenceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNodeModule_ProvideRelatedPersonReferenceNodeFactory
    implements Factory<RelatedPersonReferenceNode> {
  private final RelatedPersonReferenceNodeModule module;

  public RelatedPersonReferenceNodeModule_ProvideRelatedPersonReferenceNodeFactory(
      RelatedPersonReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RelatedPersonReferenceNode get() {
    return Preconditions.checkNotNull(
        module.provideRelatedPersonReferenceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RelatedPersonReferenceNode> create(
      RelatedPersonReferenceNodeModule module) {
    return new RelatedPersonReferenceNodeModule_ProvideRelatedPersonReferenceNodeFactory(module);
  }

  /** Proxies {@link RelatedPersonReferenceNodeModule#provideRelatedPersonReferenceNode()}. */
  public static RelatedPersonReferenceNode proxyProvideRelatedPersonReferenceNode(
      RelatedPersonReferenceNodeModule instance) {
    return instance.provideRelatedPersonReferenceNode();
  }
}
