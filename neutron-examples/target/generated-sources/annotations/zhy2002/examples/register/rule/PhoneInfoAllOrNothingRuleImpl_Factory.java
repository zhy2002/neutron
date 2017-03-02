package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.PhoneInfoNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoAllOrNothingRuleImpl_Factory
    implements Factory<PhoneInfoAllOrNothingRuleImpl> {
  private final MembersInjector<PhoneInfoAllOrNothingRuleImpl>
      phoneInfoAllOrNothingRuleImplMembersInjector;

  private final Provider<PhoneInfoNode> ownerProvider;

  public PhoneInfoAllOrNothingRuleImpl_Factory(
      MembersInjector<PhoneInfoAllOrNothingRuleImpl> phoneInfoAllOrNothingRuleImplMembersInjector,
      Provider<PhoneInfoNode> ownerProvider) {
    assert phoneInfoAllOrNothingRuleImplMembersInjector != null;
    this.phoneInfoAllOrNothingRuleImplMembersInjector =
        phoneInfoAllOrNothingRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public PhoneInfoAllOrNothingRuleImpl get() {
    return MembersInjectors.injectMembers(
        phoneInfoAllOrNothingRuleImplMembersInjector,
        new PhoneInfoAllOrNothingRuleImpl(ownerProvider.get()));
  }

  public static Factory<PhoneInfoAllOrNothingRuleImpl> create(
      MembersInjector<PhoneInfoAllOrNothingRuleImpl> phoneInfoAllOrNothingRuleImplMembersInjector,
      Provider<PhoneInfoNode> ownerProvider) {
    return new PhoneInfoAllOrNothingRuleImpl_Factory(
        phoneInfoAllOrNothingRuleImplMembersInjector, ownerProvider);
  }
}
