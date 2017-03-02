package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.UsernameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefaultEmailByUsernameRuleImpl_Factory
    implements Factory<DefaultEmailByUsernameRuleImpl> {
  private final MembersInjector<DefaultEmailByUsernameRuleImpl>
      defaultEmailByUsernameRuleImplMembersInjector;

  private final Provider<UsernameNode> ownerProvider;

  public DefaultEmailByUsernameRuleImpl_Factory(
      MembersInjector<DefaultEmailByUsernameRuleImpl> defaultEmailByUsernameRuleImplMembersInjector,
      Provider<UsernameNode> ownerProvider) {
    assert defaultEmailByUsernameRuleImplMembersInjector != null;
    this.defaultEmailByUsernameRuleImplMembersInjector =
        defaultEmailByUsernameRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public DefaultEmailByUsernameRuleImpl get() {
    return MembersInjectors.injectMembers(
        defaultEmailByUsernameRuleImplMembersInjector,
        new DefaultEmailByUsernameRuleImpl(ownerProvider.get()));
  }

  public static Factory<DefaultEmailByUsernameRuleImpl> create(
      MembersInjector<DefaultEmailByUsernameRuleImpl> defaultEmailByUsernameRuleImplMembersInjector,
      Provider<UsernameNode> ownerProvider) {
    return new DefaultEmailByUsernameRuleImpl_Factory(
        defaultEmailByUsernameRuleImplMembersInjector, ownerProvider);
  }
}
