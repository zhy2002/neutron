package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.ReceiveOffersNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailIsRequiredWhenReceiveOffersRuleImpl_Factory
    implements Factory<EmailIsRequiredWhenReceiveOffersRuleImpl> {
  private final MembersInjector<EmailIsRequiredWhenReceiveOffersRuleImpl>
      emailIsRequiredWhenReceiveOffersRuleImplMembersInjector;

  private final Provider<ReceiveOffersNode> ownerProvider;

  public EmailIsRequiredWhenReceiveOffersRuleImpl_Factory(
      MembersInjector<EmailIsRequiredWhenReceiveOffersRuleImpl>
          emailIsRequiredWhenReceiveOffersRuleImplMembersInjector,
      Provider<ReceiveOffersNode> ownerProvider) {
    assert emailIsRequiredWhenReceiveOffersRuleImplMembersInjector != null;
    this.emailIsRequiredWhenReceiveOffersRuleImplMembersInjector =
        emailIsRequiredWhenReceiveOffersRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public EmailIsRequiredWhenReceiveOffersRuleImpl get() {
    return MembersInjectors.injectMembers(
        emailIsRequiredWhenReceiveOffersRuleImplMembersInjector,
        new EmailIsRequiredWhenReceiveOffersRuleImpl(ownerProvider.get()));
  }

  public static Factory<EmailIsRequiredWhenReceiveOffersRuleImpl> create(
      MembersInjector<EmailIsRequiredWhenReceiveOffersRuleImpl>
          emailIsRequiredWhenReceiveOffersRuleImplMembersInjector,
      Provider<ReceiveOffersNode> ownerProvider) {
    return new EmailIsRequiredWhenReceiveOffersRuleImpl_Factory(
        emailIsRequiredWhenReceiveOffersRuleImplMembersInjector, ownerProvider);
  }
}
