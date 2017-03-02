package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ApplicationTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChangeApplicationTypeRuleImpl_Factory
    implements Factory<ChangeApplicationTypeRuleImpl> {
  private final MembersInjector<ChangeApplicationTypeRuleImpl>
      changeApplicationTypeRuleImplMembersInjector;

  private final Provider<ApplicationTypeNode> ownerProvider;

  public ChangeApplicationTypeRuleImpl_Factory(
      MembersInjector<ChangeApplicationTypeRuleImpl> changeApplicationTypeRuleImplMembersInjector,
      Provider<ApplicationTypeNode> ownerProvider) {
    assert changeApplicationTypeRuleImplMembersInjector != null;
    this.changeApplicationTypeRuleImplMembersInjector =
        changeApplicationTypeRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public ChangeApplicationTypeRuleImpl get() {
    return MembersInjectors.injectMembers(
        changeApplicationTypeRuleImplMembersInjector,
        new ChangeApplicationTypeRuleImpl(ownerProvider.get()));
  }

  public static Factory<ChangeApplicationTypeRuleImpl> create(
      MembersInjector<ChangeApplicationTypeRuleImpl> changeApplicationTypeRuleImplMembersInjector,
      Provider<ApplicationTypeNode> ownerProvider) {
    return new ChangeApplicationTypeRuleImpl_Factory(
        changeApplicationTypeRuleImplMembersInjector, ownerProvider);
  }
}
