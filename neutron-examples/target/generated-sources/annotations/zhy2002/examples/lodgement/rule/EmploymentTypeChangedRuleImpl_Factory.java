package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.EmploymentTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeChangedRuleImpl_Factory
    implements Factory<EmploymentTypeChangedRuleImpl> {
  private final MembersInjector<EmploymentTypeChangedRuleImpl>
      employmentTypeChangedRuleImplMembersInjector;

  private final Provider<EmploymentTypeNode> ownerProvider;

  public EmploymentTypeChangedRuleImpl_Factory(
      MembersInjector<EmploymentTypeChangedRuleImpl> employmentTypeChangedRuleImplMembersInjector,
      Provider<EmploymentTypeNode> ownerProvider) {
    assert employmentTypeChangedRuleImplMembersInjector != null;
    this.employmentTypeChangedRuleImplMembersInjector =
        employmentTypeChangedRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public EmploymentTypeChangedRuleImpl get() {
    return MembersInjectors.injectMembers(
        employmentTypeChangedRuleImplMembersInjector,
        new EmploymentTypeChangedRuleImpl(ownerProvider.get()));
  }

  public static Factory<EmploymentTypeChangedRuleImpl> create(
      MembersInjector<EmploymentTypeChangedRuleImpl> employmentTypeChangedRuleImplMembersInjector,
      Provider<EmploymentTypeNode> ownerProvider) {
    return new EmploymentTypeChangedRuleImpl_Factory(
        employmentTypeChangedRuleImplMembersInjector, ownerProvider);
  }
}
