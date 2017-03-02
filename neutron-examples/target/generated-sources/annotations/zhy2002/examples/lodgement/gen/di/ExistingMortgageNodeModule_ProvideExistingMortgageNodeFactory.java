package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExistingMortgageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNodeModule_ProvideExistingMortgageNodeFactory
    implements Factory<ExistingMortgageNode> {
  private final ExistingMortgageNodeModule module;

  public ExistingMortgageNodeModule_ProvideExistingMortgageNodeFactory(
      ExistingMortgageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExistingMortgageNode get() {
    return Preconditions.checkNotNull(
        module.provideExistingMortgageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExistingMortgageNode> create(ExistingMortgageNodeModule module) {
    return new ExistingMortgageNodeModule_ProvideExistingMortgageNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageNodeModule#provideExistingMortgageNode()}. */
  public static ExistingMortgageNode proxyProvideExistingMortgageNode(
      ExistingMortgageNodeModule instance) {
    return instance.provideExistingMortgageNode();
  }
}
