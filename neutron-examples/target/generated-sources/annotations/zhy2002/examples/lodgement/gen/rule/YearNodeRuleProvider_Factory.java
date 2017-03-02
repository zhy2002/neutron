package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class YearNodeRuleProvider_Factory implements Factory<YearNodeRuleProvider> {
  private final MembersInjector<YearNodeRuleProvider> yearNodeRuleProviderMembersInjector;

  public YearNodeRuleProvider_Factory(
      MembersInjector<YearNodeRuleProvider> yearNodeRuleProviderMembersInjector) {
    assert yearNodeRuleProviderMembersInjector != null;
    this.yearNodeRuleProviderMembersInjector = yearNodeRuleProviderMembersInjector;
  }

  @Override
  public YearNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        yearNodeRuleProviderMembersInjector, new YearNodeRuleProvider());
  }

  public static Factory<YearNodeRuleProvider> create(
      MembersInjector<YearNodeRuleProvider> yearNodeRuleProviderMembersInjector) {
    return new YearNodeRuleProvider_Factory(yearNodeRuleProviderMembersInjector);
  }
}
