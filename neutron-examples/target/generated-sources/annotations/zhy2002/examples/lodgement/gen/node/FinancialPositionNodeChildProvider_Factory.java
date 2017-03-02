package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNodeChildProvider_Factory
    implements Factory<FinancialPositionNodeChildProvider> {
  private final MembersInjector<FinancialPositionNodeChildProvider>
      financialPositionNodeChildProviderMembersInjector;

  public FinancialPositionNodeChildProvider_Factory(
      MembersInjector<FinancialPositionNodeChildProvider>
          financialPositionNodeChildProviderMembersInjector) {
    assert financialPositionNodeChildProviderMembersInjector != null;
    this.financialPositionNodeChildProviderMembersInjector =
        financialPositionNodeChildProviderMembersInjector;
  }

  @Override
  public FinancialPositionNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        financialPositionNodeChildProviderMembersInjector,
        new FinancialPositionNodeChildProvider());
  }

  public static Factory<FinancialPositionNodeChildProvider> create(
      MembersInjector<FinancialPositionNodeChildProvider>
          financialPositionNodeChildProviderMembersInjector) {
    return new FinancialPositionNodeChildProvider_Factory(
        financialPositionNodeChildProviderMembersInjector);
  }
}
