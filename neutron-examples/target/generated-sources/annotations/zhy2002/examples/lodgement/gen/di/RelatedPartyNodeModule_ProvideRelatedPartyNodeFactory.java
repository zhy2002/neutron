package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RelatedPartyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeModule_ProvideRelatedPartyNodeFactory
    implements Factory<RelatedPartyNode> {
  private final RelatedPartyNodeModule module;

  public RelatedPartyNodeModule_ProvideRelatedPartyNodeFactory(RelatedPartyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RelatedPartyNode get() {
    return Preconditions.checkNotNull(
        module.provideRelatedPartyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RelatedPartyNode> create(RelatedPartyNodeModule module) {
    return new RelatedPartyNodeModule_ProvideRelatedPartyNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyNodeModule#provideRelatedPartyNode()}. */
  public static RelatedPartyNode proxyProvideRelatedPartyNode(RelatedPartyNodeModule instance) {
    return instance.provideRelatedPartyNode();
  }
}
