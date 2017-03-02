package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeRuleProvider_Factory implements Factory<ErrorListNodeRuleProvider> {
  private final MembersInjector<ErrorListNodeRuleProvider> errorListNodeRuleProviderMembersInjector;

  public ErrorListNodeRuleProvider_Factory(
      MembersInjector<ErrorListNodeRuleProvider> errorListNodeRuleProviderMembersInjector) {
    assert errorListNodeRuleProviderMembersInjector != null;
    this.errorListNodeRuleProviderMembersInjector = errorListNodeRuleProviderMembersInjector;
  }

  @Override
  public ErrorListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        errorListNodeRuleProviderMembersInjector, new ErrorListNodeRuleProvider());
  }

  public static Factory<ErrorListNodeRuleProvider> create(
      MembersInjector<ErrorListNodeRuleProvider> errorListNodeRuleProviderMembersInjector) {
    return new ErrorListNodeRuleProvider_Factory(errorListNodeRuleProviderMembersInjector);
  }
}
