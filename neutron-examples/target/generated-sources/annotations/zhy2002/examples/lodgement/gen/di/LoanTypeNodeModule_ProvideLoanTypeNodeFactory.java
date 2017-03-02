package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanTypeNodeModule_ProvideLoanTypeNodeFactory implements Factory<LoanTypeNode> {
  private final LoanTypeNodeModule module;

  public LoanTypeNodeModule_ProvideLoanTypeNodeFactory(LoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanTypeNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanTypeNode> create(LoanTypeNodeModule module) {
    return new LoanTypeNodeModule_ProvideLoanTypeNodeFactory(module);
  }

  /** Proxies {@link LoanTypeNodeModule#provideLoanTypeNode()}. */
  public static LoanTypeNode proxyProvideLoanTypeNode(LoanTypeNodeModule instance) {
    return instance.provideLoanTypeNode();
  }
}
