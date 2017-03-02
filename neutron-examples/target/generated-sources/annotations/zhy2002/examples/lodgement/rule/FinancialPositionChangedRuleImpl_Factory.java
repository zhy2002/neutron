package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.FinancialPositionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionChangedRuleImpl_Factory
    implements Factory<FinancialPositionChangedRuleImpl> {
  private final MembersInjector<FinancialPositionChangedRuleImpl>
      financialPositionChangedRuleImplMembersInjector;

  private final Provider<FinancialPositionNode> ownerProvider;

  public FinancialPositionChangedRuleImpl_Factory(
      MembersInjector<FinancialPositionChangedRuleImpl>
          financialPositionChangedRuleImplMembersInjector,
      Provider<FinancialPositionNode> ownerProvider) {
    assert financialPositionChangedRuleImplMembersInjector != null;
    this.financialPositionChangedRuleImplMembersInjector =
        financialPositionChangedRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public FinancialPositionChangedRuleImpl get() {
    return MembersInjectors.injectMembers(
        financialPositionChangedRuleImplMembersInjector,
        new FinancialPositionChangedRuleImpl(ownerProvider.get()));
  }

  public static Factory<FinancialPositionChangedRuleImpl> create(
      MembersInjector<FinancialPositionChangedRuleImpl>
          financialPositionChangedRuleImplMembersInjector,
      Provider<FinancialPositionNode> ownerProvider) {
    return new FinancialPositionChangedRuleImpl_Factory(
        financialPositionChangedRuleImplMembersInjector, ownerProvider);
  }
}
