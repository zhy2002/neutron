package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanLenderNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLenderNameNodeModule_ProvideLoanLenderNameNodeFactory
    implements Factory<LoanLenderNameNode> {
  private final LoanLenderNameNodeModule module;

  public LoanLenderNameNodeModule_ProvideLoanLenderNameNodeFactory(
      LoanLenderNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanLenderNameNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanLenderNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanLenderNameNode> create(LoanLenderNameNodeModule module) {
    return new LoanLenderNameNodeModule_ProvideLoanLenderNameNodeFactory(module);
  }

  /** Proxies {@link LoanLenderNameNodeModule#provideLoanLenderNameNode()}. */
  public static LoanLenderNameNode proxyProvideLoanLenderNameNode(
      LoanLenderNameNodeModule instance) {
    return instance.provideLoanLenderNameNode();
  }
}
