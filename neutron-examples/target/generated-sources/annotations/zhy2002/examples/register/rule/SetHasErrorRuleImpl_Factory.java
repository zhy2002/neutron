package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.RegisterNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SetHasErrorRuleImpl_Factory implements Factory<SetHasErrorRuleImpl> {
  private final MembersInjector<SetHasErrorRuleImpl> setHasErrorRuleImplMembersInjector;

  private final Provider<RegisterNode> ownerProvider;

  public SetHasErrorRuleImpl_Factory(
      MembersInjector<SetHasErrorRuleImpl> setHasErrorRuleImplMembersInjector,
      Provider<RegisterNode> ownerProvider) {
    assert setHasErrorRuleImplMembersInjector != null;
    this.setHasErrorRuleImplMembersInjector = setHasErrorRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public SetHasErrorRuleImpl get() {
    return MembersInjectors.injectMembers(
        setHasErrorRuleImplMembersInjector, new SetHasErrorRuleImpl(ownerProvider.get()));
  }

  public static Factory<SetHasErrorRuleImpl> create(
      MembersInjector<SetHasErrorRuleImpl> setHasErrorRuleImplMembersInjector,
      Provider<RegisterNode> ownerProvider) {
    return new SetHasErrorRuleImpl_Factory(setHasErrorRuleImplMembersInjector, ownerProvider);
  }
}
