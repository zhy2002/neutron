package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeOrWorkPhoneRequiredRuleImpl_Factory
    implements Factory<HomeOrWorkPhoneRequiredRuleImpl> {
  private final MembersInjector<HomeOrWorkPhoneRequiredRuleImpl>
      homeOrWorkPhoneRequiredRuleImplMembersInjector;

  private final Provider<PersonContactNode> ownerProvider;

  public HomeOrWorkPhoneRequiredRuleImpl_Factory(
      MembersInjector<HomeOrWorkPhoneRequiredRuleImpl>
          homeOrWorkPhoneRequiredRuleImplMembersInjector,
      Provider<PersonContactNode> ownerProvider) {
    assert homeOrWorkPhoneRequiredRuleImplMembersInjector != null;
    this.homeOrWorkPhoneRequiredRuleImplMembersInjector =
        homeOrWorkPhoneRequiredRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public HomeOrWorkPhoneRequiredRuleImpl get() {
    return MembersInjectors.injectMembers(
        homeOrWorkPhoneRequiredRuleImplMembersInjector,
        new HomeOrWorkPhoneRequiredRuleImpl(ownerProvider.get()));
  }

  public static Factory<HomeOrWorkPhoneRequiredRuleImpl> create(
      MembersInjector<HomeOrWorkPhoneRequiredRuleImpl>
          homeOrWorkPhoneRequiredRuleImplMembersInjector,
      Provider<PersonContactNode> ownerProvider) {
    return new HomeOrWorkPhoneRequiredRuleImpl_Factory(
        homeOrWorkPhoneRequiredRuleImplMembersInjector, ownerProvider);
  }
}
