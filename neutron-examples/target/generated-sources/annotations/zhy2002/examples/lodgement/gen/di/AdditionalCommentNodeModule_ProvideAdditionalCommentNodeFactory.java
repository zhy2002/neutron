package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AdditionalCommentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalCommentNodeModule_ProvideAdditionalCommentNodeFactory
    implements Factory<AdditionalCommentNode> {
  private final AdditionalCommentNodeModule module;

  public AdditionalCommentNodeModule_ProvideAdditionalCommentNodeFactory(
      AdditionalCommentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AdditionalCommentNode get() {
    return Preconditions.checkNotNull(
        module.provideAdditionalCommentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AdditionalCommentNode> create(AdditionalCommentNodeModule module) {
    return new AdditionalCommentNodeModule_ProvideAdditionalCommentNodeFactory(module);
  }

  /** Proxies {@link AdditionalCommentNodeModule#provideAdditionalCommentNode()}. */
  public static AdditionalCommentNode proxyProvideAdditionalCommentNode(
      AdditionalCommentNodeModule instance) {
    return instance.provideAdditionalCommentNode();
  }
}
