package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final SavingsAccountListNodeModule module;

  public SavingsAccountListNodeModule_ProvideListUiNodeFactory(
      SavingsAccountListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(SavingsAccountListNodeModule module) {
    return new SavingsAccountListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(SavingsAccountListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
