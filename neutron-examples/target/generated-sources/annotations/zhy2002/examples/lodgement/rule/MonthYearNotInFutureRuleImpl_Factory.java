package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthYearNotInFutureRuleImpl_Factory
    implements Factory<MonthYearNotInFutureRuleImpl> {
  private final MembersInjector<MonthYearNotInFutureRuleImpl>
      monthYearNotInFutureRuleImplMembersInjector;

  private final Provider<MonthYearNode<?>> ownerProvider;

  public MonthYearNotInFutureRuleImpl_Factory(
      MembersInjector<MonthYearNotInFutureRuleImpl> monthYearNotInFutureRuleImplMembersInjector,
      Provider<MonthYearNode<?>> ownerProvider) {
    assert monthYearNotInFutureRuleImplMembersInjector != null;
    this.monthYearNotInFutureRuleImplMembersInjector = monthYearNotInFutureRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public MonthYearNotInFutureRuleImpl get() {
    return MembersInjectors.injectMembers(
        monthYearNotInFutureRuleImplMembersInjector,
        new MonthYearNotInFutureRuleImpl(ownerProvider.get()));
  }

  public static Factory<MonthYearNotInFutureRuleImpl> create(
      MembersInjector<MonthYearNotInFutureRuleImpl> monthYearNotInFutureRuleImplMembersInjector,
      Provider<MonthYearNode<?>> ownerProvider) {
    return new MonthYearNotInFutureRuleImpl_Factory(
        monthYearNotInFutureRuleImplMembersInjector, ownerProvider);
  }
}
