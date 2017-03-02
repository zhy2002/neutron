package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateErrorNodeRuleImpl_Factory implements Factory<CreateErrorNodeRuleImpl> {
  private final MembersInjector<CreateErrorNodeRuleImpl> createErrorNodeRuleImplMembersInjector;

  private final Provider<ApplicationNode> ownerProvider;

  public CreateErrorNodeRuleImpl_Factory(
      MembersInjector<CreateErrorNodeRuleImpl> createErrorNodeRuleImplMembersInjector,
      Provider<ApplicationNode> ownerProvider) {
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
      Provider<ApplicationNode> ownerProvider) {
    return new CreateErrorNodeRuleImpl_Factory(
        createErrorNodeRuleImplMembersInjector, ownerProvider);
  }
}
