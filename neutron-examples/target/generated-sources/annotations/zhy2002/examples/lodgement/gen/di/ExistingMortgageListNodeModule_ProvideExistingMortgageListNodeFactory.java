package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExistingMortgageListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeModule_ProvideExistingMortgageListNodeFactory
    implements Factory<ExistingMortgageListNode> {
  private final ExistingMortgageListNodeModule module;

  public ExistingMortgageListNodeModule_ProvideExistingMortgageListNodeFactory(
      ExistingMortgageListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExistingMortgageListNode get() {
    return Preconditions.checkNotNull(
        module.provideExistingMortgageListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExistingMortgageListNode> create(ExistingMortgageListNodeModule module) {
    return new ExistingMortgageListNodeModule_ProvideExistingMortgageListNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageListNodeModule#provideExistingMortgageListNode()}. */
  public static ExistingMortgageListNode proxyProvideExistingMortgageListNode(
      ExistingMortgageListNodeModule instance) {
    return instance.provideExistingMortgageListNode();
  }
}
