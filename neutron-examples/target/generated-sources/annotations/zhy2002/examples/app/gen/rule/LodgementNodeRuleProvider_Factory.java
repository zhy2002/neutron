package zhy2002.examples.app.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeRuleProvider_Factory implements Factory<LodgementNodeRuleProvider> {
  private final MembersInjector<LodgementNodeRuleProvider> lodgementNodeRuleProviderMembersInjector;

  public LodgementNodeRuleProvider_Factory(
      MembersInjector<LodgementNodeRuleProvider> lodgementNodeRuleProviderMembersInjector) {
    assert lodgementNodeRuleProviderMembersInjector != null;
    this.lodgementNodeRuleProviderMembersInjector = lodgementNodeRuleProviderMembersInjector;
  }

  @Override
  public LodgementNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        lodgementNodeRuleProviderMembersInjector, new LodgementNodeRuleProvider());
  }

  public static Factory<LodgementNodeRuleProvider> create(
      MembersInjector<LodgementNodeRuleProvider> lodgementNodeRuleProviderMembersInjector) {
    return new LodgementNodeRuleProvider_Factory(lodgementNodeRuleProviderMembersInjector);
  }
}
