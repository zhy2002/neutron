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
public final class CreateErrorNodeRuleImpl_Factory implements Factory<CreateErrorNodeRuleImpl> {
  private final MembersInjector<CreateErrorNodeRuleImpl> createErrorNodeRuleImplMembersInjector;

  private final Provider<RegisterNode> ownerProvider;

  public CreateErrorNodeRuleImpl_Factory(
      MembersInjector<CreateErrorNodeRuleImpl> createErrorNodeRuleImplMembersInjector,
      Provider<RegisterNode> ownerProvider) {
    assert createErrorNodeRuleImplMembersInjector != null;
    this.createErrorNodeRuleImplMembersInjector = createErrorNodeRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public CreateErrorNodeRuleImpl get() {
    return MembersInjectors.injectMembers(
        createErrorNodeRuleImplMembersInjector, new CreateErrorNodeRuleImpl(ownerProvider.get()));
  }

  public static Factory<CreateErrorNodeRuleImpl> create(
      MembersInjector<CreateErrorNodeRuleImpl> createErrorNodeRuleImplMembersInjector,
      Provider<RegisterNode> ownerProvider) {
    return new CreateErrorNodeRuleImpl_Factory(
        createErrorNodeRuleImplMembersInjector, ownerProvider);
  }
}
