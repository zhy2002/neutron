package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalCommentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AdditionalCommentNodeModule module;

  public AdditionalCommentNodeModule_ProvideLeafUiNodeFactory(AdditionalCommentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AdditionalCommentNodeModule module) {
    return new AdditionalCommentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AdditionalCommentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AdditionalCommentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
