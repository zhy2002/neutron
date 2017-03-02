package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanTypeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final ProductLoanTypeNodeModule module;

  public ProductLoanTypeNodeModule_ProvideStringUiNodeFactory(ProductLoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(ProductLoanTypeNodeModule module) {
    return new ProductLoanTypeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link ProductLoanTypeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(ProductLoanTypeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
