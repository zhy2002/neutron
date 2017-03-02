package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailNodeRuleProvider_Factory implements Factory<EmailNodeRuleProvider> {
  private final MembersInjector<EmailNodeRuleProvider> emailNodeRuleProviderMembersInjector;

  public EmailNodeRuleProvider_Factory(
      MembersInjector<EmailNodeRuleProvider> emailNodeRuleProviderMembersInjector) {
    assert emailNodeRuleProviderMembersInjector != null;
    this.emailNodeRuleProviderMembersInjector = emailNodeRuleProviderMembersInjector;
  }

  @Override
  public EmailNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        emailNodeRuleProviderMembersInjector, new EmailNodeRuleProvider());
  }

  public static Factory<EmailNodeRuleProvider> create(
      MembersInjector<EmailNodeRuleProvider> emailNodeRuleProviderMembersInjector) {
    return new EmailNodeRuleProvider_Factory(emailNodeRuleProviderMembersInjector);
  }
}
