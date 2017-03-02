package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.OtherIncomeTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeTypeChangeRuleImpl_Factory
    implements Factory<OtherIncomeTypeChangeRuleImpl> {
  private final MembersInjector<OtherIncomeTypeChangeRuleImpl>
      otherIncomeTypeChangeRuleImplMembersInjector;

  private final Provider<OtherIncomeTypeNode> ownerProvider;

  public OtherIncomeTypeChangeRuleImpl_Factory(
      MembersInjector<OtherIncomeTypeChangeRuleImpl> otherIncomeTypeChangeRuleImplMembersInjector,
      Provider<OtherIncomeTypeNode> ownerProvider) {
    assert otherIncomeTypeChangeRuleImplMembersInjector != null;
    this.otherIncomeTypeChangeRuleImplMembersInjector =
        otherIncomeTypeChangeRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public OtherIncomeTypeChangeRuleImpl get() {
    return MembersInjectors.injectMembers(
        otherIncomeTypeChangeRuleImplMembersInjector,
        new OtherIncomeTypeChangeRuleImpl(ownerProvider.get()));
  }

  public static Factory<OtherIncomeTypeChangeRuleImpl> create(
      MembersInjector<OtherIncomeTypeChangeRuleImpl> otherIncomeTypeChangeRuleImplMembersInjector,
      Provider<OtherIncomeTypeNode> ownerProvider) {
    return new OtherIncomeTypeChangeRuleImpl_Factory(
        otherIncomeTypeChangeRuleImplMembersInjector, ownerProvider);
  }
}
