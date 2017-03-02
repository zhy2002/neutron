package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeItemProvider_Factory implements Factory<LoanListNodeItemProvider> {
  private final MembersInjector<LoanListNodeItemProvider> loanListNodeItemProviderMembersInjector;

  public LoanListNodeItemProvider_Factory(
      MembersInjector<LoanListNodeItemProvider> loanListNodeItemProviderMembersInjector) {
    assert loanListNodeItemProviderMembersInjector != null;
    this.loanListNodeItemProviderMembersInjector = loanListNodeItemProviderMembersInjector;
  }

  @Override
  public LoanListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        loanListNodeItemProviderMembersInjector, new LoanListNodeItemProvider());
  }

  public static Factory<LoanListNodeItemProvider> create(
      MembersInjector<LoanListNodeItemProvider> loanListNodeItemProviderMembersInjector) {
    return new LoanListNodeItemProvider_Factory(loanListNodeItemProviderMembersInjector);
  }
}
