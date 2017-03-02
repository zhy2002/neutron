package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.EmailNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailChangeReasonRuleImpl_Factory implements Factory<EmailChangeReasonRuleImpl> {
  private final MembersInjector<EmailChangeReasonRuleImpl> emailChangeReasonRuleImplMembersInjector;

  private final Provider<EmailNode> ownerProvider;

  public EmailChangeReasonRuleImpl_Factory(
      MembersInjector<EmailChangeReasonRuleImpl> emailChangeReasonRuleImplMembersInjector,
      Provider<EmailNode> ownerProvider) {
    assert emailChangeReasonRuleImplMembersInjector != null;
    this.emailChangeReasonRuleImplMembersInjector = emailChangeReasonRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public EmailChangeReasonRuleImpl get() {
    return MembersInjectors.injectMembers(
        emailChangeReasonRuleImplMembersInjector,
        new EmailChangeReasonRuleImpl(ownerProvider.get()));
  }

  public static Factory<EmailChangeReasonRuleImpl> create(
      MembersInjector<EmailChangeReasonRuleImpl> emailChangeReasonRuleImplMembersInjector,
      Provider<EmailNode> ownerProvider) {
    return new EmailChangeReasonRuleImpl_Factory(
        emailChangeReasonRuleImplMembersInjector, ownerProvider);
  }
}
