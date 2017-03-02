package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.DobNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DobRangeValidationRuleImpl_Factory
    implements Factory<DobRangeValidationRuleImpl> {
  private final MembersInjector<DobRangeValidationRuleImpl>
      dobRangeValidationRuleImplMembersInjector;

  private final Provider<DobNode<?>> ownerProvider;

  public DobRangeValidationRuleImpl_Factory(
      MembersInjector<DobRangeValidationRuleImpl> dobRangeValidationRuleImplMembersInjector,
      Provider<DobNode<?>> ownerProvider) {
    assert dobRangeValidationRuleImplMembersInjector != null;
    this.dobRangeValidationRuleImplMembersInjector = dobRangeValidationRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public DobRangeValidationRuleImpl get() {
    return MembersInjectors.injectMembers(
        dobRangeValidationRuleImplMembersInjector,
        new DobRangeValidationRuleImpl(ownerProvider.get()));
  }

  public static Factory<DobRangeValidationRuleImpl> create(
      MembersInjector<DobRangeValidationRuleImpl> dobRangeValidationRuleImplMembersInjector,
      Provider<DobNode<?>> ownerProvider) {
    return new DobRangeValidationRuleImpl_Factory(
        dobRangeValidationRuleImplMembersInjector, ownerProvider);
  }
}
