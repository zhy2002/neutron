package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductAccountHolderListNodeModule_ProvideSelectAccountHolderListNodeFactory
    implements Factory<SelectAccountHolderListNode<?>> {
  private final ProductAccountHolderListNodeModule module;

  public ProductAccountHolderListNodeModule_ProvideSelectAccountHolderListNodeFactory(
      ProductAccountHolderListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectAccountHolderListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideSelectAccountHolderListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectAccountHolderListNode<?>> create(
      ProductAccountHolderListNodeModule module) {
    return new ProductAccountHolderListNodeModule_ProvideSelectAccountHolderListNodeFactory(module);
  }

  /** Proxies {@link ProductAccountHolderListNodeModule#provideSelectAccountHolderListNode()}. */
  public static SelectAccountHolderListNode<?> proxyProvideSelectAccountHolderListNode(
      ProductAccountHolderListNodeModule instance) {
    return instance.provideSelectAccountHolderListNode();
  }
}
