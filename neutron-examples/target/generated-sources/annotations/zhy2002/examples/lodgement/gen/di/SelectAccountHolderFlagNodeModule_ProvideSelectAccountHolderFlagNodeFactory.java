package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderFlagNodeModule_ProvideSelectAccountHolderFlagNodeFactory
    implements Factory<SelectAccountHolderFlagNode> {
  private final SelectAccountHolderFlagNodeModule module;

  public SelectAccountHolderFlagNodeModule_ProvideSelectAccountHolderFlagNodeFactory(
      SelectAccountHolderFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectAccountHolderFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideSelectAccountHolderFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectAccountHolderFlagNode> create(
      SelectAccountHolderFlagNodeModule module) {
    return new SelectAccountHolderFlagNodeModule_ProvideSelectAccountHolderFlagNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderFlagNodeModule#provideSelectAccountHolderFlagNode()}. */
  public static SelectAccountHolderFlagNode proxyProvideSelectAccountHolderFlagNode(
      SelectAccountHolderFlagNodeModule instance) {
    return instance.provideSelectAccountHolderFlagNode();
  }
}
