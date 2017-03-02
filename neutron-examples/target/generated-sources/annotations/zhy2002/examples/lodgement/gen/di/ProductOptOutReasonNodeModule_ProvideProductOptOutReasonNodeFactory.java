package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductOptOutReasonNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductOptOutReasonNodeModule_ProvideProductOptOutReasonNodeFactory
    implements Factory<ProductOptOutReasonNode> {
  private final ProductOptOutReasonNodeModule module;

  public ProductOptOutReasonNodeModule_ProvideProductOptOutReasonNodeFactory(
      ProductOptOutReasonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductOptOutReasonNode get() {
    return Preconditions.checkNotNull(
        module.provideProductOptOutReasonNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductOptOutReasonNode> create(ProductOptOutReasonNodeModule module) {
    return new ProductOptOutReasonNodeModule_ProvideProductOptOutReasonNodeFactory(module);
  }

  /** Proxies {@link ProductOptOutReasonNodeModule#provideProductOptOutReasonNode()}. */
  public static ProductOptOutReasonNode proxyProvideProductOptOutReasonNode(
      ProductOptOutReasonNodeModule instance) {
    return instance.provideProductOptOutReasonNode();
  }
}
