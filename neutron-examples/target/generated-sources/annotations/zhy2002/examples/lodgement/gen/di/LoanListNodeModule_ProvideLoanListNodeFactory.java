package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeModule_ProvideLoanListNodeFactory implements Factory<LoanListNode> {
  private final LoanListNodeModule module;

  public LoanListNodeModule_ProvideLoanListNodeFactory(LoanListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanListNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanListNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanListNode> create(LoanListNodeModule module) {
    return new LoanListNodeModule_ProvideLoanListNodeFactory(module);
  }

  /** Proxies {@link LoanListNodeModule#provideLoanListNode()}. */
  public static LoanListNode proxyProvideLoanListNode(LoanListNodeModule instance) {
    return instance.provideLoanListNode();
  }
}
