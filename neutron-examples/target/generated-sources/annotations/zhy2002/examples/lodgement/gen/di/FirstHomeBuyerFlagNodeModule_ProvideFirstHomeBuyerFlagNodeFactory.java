package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.FirstHomeBuyerFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstHomeBuyerFlagNodeModule_ProvideFirstHomeBuyerFlagNodeFactory
    implements Factory<FirstHomeBuyerFlagNode> {
  private final FirstHomeBuyerFlagNodeModule module;

  public FirstHomeBuyerFlagNodeModule_ProvideFirstHomeBuyerFlagNodeFactory(
      FirstHomeBuyerFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public FirstHomeBuyerFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideFirstHomeBuyerFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FirstHomeBuyerFlagNode> create(FirstHomeBuyerFlagNodeModule module) {
    return new FirstHomeBuyerFlagNodeModule_ProvideFirstHomeBuyerFlagNodeFactory(module);
  }

  /** Proxies {@link FirstHomeBuyerFlagNodeModule#provideFirstHomeBuyerFlagNode()}. */
  public static FirstHomeBuyerFlagNode proxyProvideFirstHomeBuyerFlagNode(
      FirstHomeBuyerFlagNodeModule instance) {
    return instance.provideFirstHomeBuyerFlagNode();
  }
}
