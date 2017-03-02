package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductRepaymentFrequencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRepaymentFrequencyNodeModule_ProvideProductRepaymentFrequencyNodeFactory
    implements Factory<ProductRepaymentFrequencyNode> {
  private final ProductRepaymentFrequencyNodeModule module;

  public ProductRepaymentFrequencyNodeModule_ProvideProductRepaymentFrequencyNodeFactory(
      ProductRepaymentFrequencyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductRepaymentFrequencyNode get() {
    return Preconditions.checkNotNull(
        module.provideProductRepaymentFrequencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductRepaymentFrequencyNode> create(
      ProductRepaymentFrequencyNodeModule module) {
    return new ProductRepaymentFrequencyNodeModule_ProvideProductRepaymentFrequencyNodeFactory(
        module);
  }

  /** Proxies {@link ProductRepaymentFrequencyNodeModule#provideProductRepaymentFrequencyNode()}. */
  public static ProductRepaymentFrequencyNode proxyProvideProductRepaymentFrequencyNode(
      ProductRepaymentFrequencyNodeModule instance) {
    return instance.provideProductRepaymentFrequencyNode();
  }
}
