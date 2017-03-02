package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeModule_ProvideLoanNodeFactory implements Factory<LoanNode> {
  private final LoanNodeModule module;

  public LoanNodeModule_ProvideLoanNodeFactory(LoanNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanNode> create(LoanNodeModule module) {
    return new LoanNodeModule_ProvideLoanNodeFactory(module);
  }

  /** Proxies {@link LoanNodeModule#provideLoanNode()}. */
  public static LoanNode proxyProvideLoanNode(LoanNodeModule instance) {
    return instance.provideLoanNode();
  }
}
