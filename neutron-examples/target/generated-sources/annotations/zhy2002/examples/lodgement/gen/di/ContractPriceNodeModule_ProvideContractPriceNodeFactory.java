package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ContractPriceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContractPriceNodeModule_ProvideContractPriceNodeFactory
    implements Factory<ContractPriceNode> {
  private final ContractPriceNodeModule module;

  public ContractPriceNodeModule_ProvideContractPriceNodeFactory(ContractPriceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ContractPriceNode get() {
    return Preconditions.checkNotNull(
        module.provideContractPriceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ContractPriceNode> create(ContractPriceNodeModule module) {
    return new ContractPriceNodeModule_ProvideContractPriceNodeFactory(module);
  }

  /** Proxies {@link ContractPriceNodeModule#provideContractPriceNode()}. */
  public static ContractPriceNode proxyProvideContractPriceNode(ContractPriceNodeModule instance) {
    return instance.provideContractPriceNode();
  }
}
