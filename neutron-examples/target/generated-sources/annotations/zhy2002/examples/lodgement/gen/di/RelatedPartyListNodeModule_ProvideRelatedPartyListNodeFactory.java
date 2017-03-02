package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RelatedPartyListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeModule_ProvideRelatedPartyListNodeFactory
    implements Factory<RelatedPartyListNode> {
  private final RelatedPartyListNodeModule module;

  public RelatedPartyListNodeModule_ProvideRelatedPartyListNodeFactory(
      RelatedPartyListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RelatedPartyListNode get() {
    return Preconditions.checkNotNull(
        module.provideRelatedPartyListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RelatedPartyListNode> create(RelatedPartyListNodeModule module) {
    return new RelatedPartyListNodeModule_ProvideRelatedPartyListNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyListNodeModule#provideRelatedPartyListNode()}. */
  public static RelatedPartyListNode proxyProvideRelatedPartyListNode(
      RelatedPartyListNodeModule instance) {
    return instance.provideRelatedPartyListNode();
  }
}
