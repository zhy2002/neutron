package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageLoanTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTypeNodeModule_ProvideMortgageLoanTypeNodeFactory
    implements Factory<MortgageLoanTypeNode> {
  private final MortgageLoanTypeNodeModule module;

  public MortgageLoanTypeNodeModule_ProvideMortgageLoanTypeNodeFactory(
      MortgageLoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageLoanTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageLoanTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageLoanTypeNode> create(MortgageLoanTypeNodeModule module) {
    return new MortgageLoanTypeNodeModule_ProvideMortgageLoanTypeNodeFactory(module);
  }

  /** Proxies {@link MortgageLoanTypeNodeModule#provideMortgageLoanTypeNode()}. */
  public static MortgageLoanTypeNode proxyProvideMortgageLoanTypeNode(
      MortgageLoanTypeNodeModule instance) {
    return instance.provideMortgageLoanTypeNode();
  }
}
