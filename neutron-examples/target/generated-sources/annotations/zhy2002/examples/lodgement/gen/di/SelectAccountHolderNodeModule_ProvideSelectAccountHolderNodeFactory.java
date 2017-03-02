package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeModule_ProvideSelectAccountHolderNodeFactory
    implements Factory<SelectAccountHolderNode> {
  private final SelectAccountHolderNodeModule module;

  public SelectAccountHolderNodeModule_ProvideSelectAccountHolderNodeFactory(
      SelectAccountHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectAccountHolderNode get() {
    return Preconditions.checkNotNull(
        module.provideSelectAccountHolderNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectAccountHolderNode> create(SelectAccountHolderNodeModule module) {
    return new SelectAccountHolderNodeModule_ProvideSelectAccountHolderNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderNodeModule#provideSelectAccountHolderNode()}. */
  public static SelectAccountHolderNode proxyProvideSelectAccountHolderNode(
      SelectAccountHolderNodeModule instance) {
    return instance.provideSelectAccountHolderNode();
  }
}
