package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeChildProvider_Factory implements Factory<LoanNodeChildProvider> {
  private final MembersInjector<LoanNodeChildProvider> loanNodeChildProviderMembersInjector;

  public LoanNodeChildProvider_Factory(
      MembersInjector<LoanNodeChildProvider> loanNodeChildProviderMembersInjector) {
    assert loanNodeChildProviderMembersInjector != null;
    this.loanNodeChildProviderMembersInjector = loanNodeChildProviderMembersInjector;
  }

  @Override
  public LoanNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        loanNodeChildProviderMembersInjector, new LoanNodeChildProvider());
  }

  public static Factory<LoanNodeChildProvider> create(
      MembersInjector<LoanNodeChildProvider> loanNodeChildProviderMembersInjector) {
    return new LoanNodeChildProvider_Factory(loanNodeChildProviderMembersInjector);
  }
}
