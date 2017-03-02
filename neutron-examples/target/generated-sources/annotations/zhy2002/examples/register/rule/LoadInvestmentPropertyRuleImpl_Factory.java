package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.OwnInvestmentPropertyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoadInvestmentPropertyRuleImpl_Factory
    implements Factory<LoadInvestmentPropertyRuleImpl> {
  private final MembersInjector<LoadInvestmentPropertyRuleImpl>
      loadInvestmentPropertyRuleImplMembersInjector;

  private final Provider<OwnInvestmentPropertyNode> ownerProvider;

  public LoadInvestmentPropertyRuleImpl_Factory(
      MembersInjector<LoadInvestmentPropertyRuleImpl> loadInvestmentPropertyRuleImplMembersInjector,
      Provider<OwnInvestmentPropertyNode> ownerProvider) {
    assert loadInvestmentPropertyRuleImplMembersInjector != null;
    this.loadInvestmentPropertyRuleImplMembersInjector =
        loadInvestmentPropertyRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public LoadInvestmentPropertyRuleImpl get() {
    return MembersInjectors.injectMembers(
        loadInvestmentPropertyRuleImplMembersInjector,
        new LoadInvestmentPropertyRuleImpl(ownerProvider.get()));
  }

  public static Factory<LoadInvestmentPropertyRuleImpl> create(
      MembersInjector<LoadInvestmentPropertyRuleImpl> loadInvestmentPropertyRuleImplMembersInjector,
      Provider<OwnInvestmentPropertyNode> ownerProvider) {
    return new LoadInvestmentPropertyRuleImpl_Factory(
        loadInvestmentPropertyRuleImplMembersInjector, ownerProvider);
  }
}
