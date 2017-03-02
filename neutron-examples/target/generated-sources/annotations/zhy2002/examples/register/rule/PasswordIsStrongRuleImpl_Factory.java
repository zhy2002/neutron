package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.PasswordNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordIsStrongRuleImpl_Factory implements Factory<PasswordIsStrongRuleImpl> {
  private final MembersInjector<PasswordIsStrongRuleImpl> passwordIsStrongRuleImplMembersInjector;

  private final Provider<PasswordNode> ownerProvider;

  public PasswordIsStrongRuleImpl_Factory(
      MembersInjector<PasswordIsStrongRuleImpl> passwordIsStrongRuleImplMembersInjector,
      Provider<PasswordNode> ownerProvider) {
    assert passwordIsStrongRuleImplMembersInjector != null;
    this.passwordIsStrongRuleImplMembersInjector = passwordIsStrongRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public PasswordIsStrongRuleImpl get() {
    return MembersInjectors.injectMembers(
        passwordIsStrongRuleImplMembersInjector, new PasswordIsStrongRuleImpl(ownerProvider.get()));
  }

  public static Factory<PasswordIsStrongRuleImpl> create(
      MembersInjector<PasswordIsStrongRuleImpl> passwordIsStrongRuleImplMembersInjector,
      Provider<PasswordNode> ownerProvider) {
    return new PasswordIsStrongRuleImpl_Factory(
        passwordIsStrongRuleImplMembersInjector, ownerProvider);
  }
}
