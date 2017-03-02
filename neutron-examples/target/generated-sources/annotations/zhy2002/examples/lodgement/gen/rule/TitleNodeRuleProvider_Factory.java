package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TitleNodeRuleProvider_Factory implements Factory<TitleNodeRuleProvider> {
  private final MembersInjector<TitleNodeRuleProvider> titleNodeRuleProviderMembersInjector;

  public TitleNodeRuleProvider_Factory(
      MembersInjector<TitleNodeRuleProvider> titleNodeRuleProviderMembersInjector) {
    assert titleNodeRuleProviderMembersInjector != null;
    this.titleNodeRuleProviderMembersInjector = titleNodeRuleProviderMembersInjector;
  }

  @Override
  public TitleNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        titleNodeRuleProviderMembersInjector, new TitleNodeRuleProvider());
  }

  public static Factory<TitleNodeRuleProvider> create(
      MembersInjector<TitleNodeRuleProvider> titleNodeRuleProviderMembersInjector) {
    return new TitleNodeRuleProvider_Factory(titleNodeRuleProviderMembersInjector);
  }
}
