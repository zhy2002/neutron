package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeItemProvider_MembersInjector
    implements MembersInjector<LoanListNodeItemProvider> {
  private final MembersInjector<LoanNode> loanNodeInjectorMembersInjector;

  public LoanListNodeItemProvider_MembersInjector(
      MembersInjector<LoanNode> loanNodeInjectorMembersInjector) {
    assert loanNodeInjectorMembersInjector != null;
    this.loanNodeInjectorMembersInjector = loanNodeInjectorMembersInjector;
  }

  public static MembersInjector<LoanListNodeItemProvider> create(
      MembersInjector<LoanNode> loanNodeInjectorMembersInjector) {
    return new LoanListNodeItemProvider_MembersInjector(loanNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(LoanListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.loanNodeInjector = loanNodeInjectorMembersInjector;
  }

  public static void injectLoanNodeInjector(
      LoanListNodeItemProvider instance, MembersInjector<LoanNode> loanNodeInjector) {
    instance.loanNodeInjector = loanNodeInjector;
  }
}
