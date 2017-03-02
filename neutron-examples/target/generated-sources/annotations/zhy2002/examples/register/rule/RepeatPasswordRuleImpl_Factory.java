package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.RepeatPasswordNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordRuleImpl_Factory implements Factory<RepeatPasswordRuleImpl> {
  private final MembersInjector<RepeatPasswordRuleImpl> repeatPasswordRuleImplMembersInjector;

  private final Provider<RepeatPasswordNode> ownerProvider;

  public RepeatPasswordRuleImpl_Factory(
      MembersInjector<RepeatPasswordRuleImpl> repeatPasswordRuleImplMembersInjector,
      Provider<RepeatPasswordNode> ownerProvider) {
    assert repeatPasswordRuleImplMembersInjector != null;
    this.repeatPasswordRuleImplMembersInjector = repeatPasswordRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public RepeatPasswordRuleImpl get() {
    return MembersInjectors.injectMembers(
        repeatPasswordRuleImplMembersInjector, new RepeatPasswordRuleImpl(ownerProvider.get()));
  }

  public static Factory<RepeatPasswordRuleImpl> create(
      MembersInjector<RepeatPasswordRuleImpl> repeatPasswordRuleImplMembersInjector,
      Provider<RepeatPasswordNode> ownerProvider) {
    return new RepeatPasswordRuleImpl_Factory(repeatPasswordRuleImplMembersInjector, ownerProvider);
  }
}
