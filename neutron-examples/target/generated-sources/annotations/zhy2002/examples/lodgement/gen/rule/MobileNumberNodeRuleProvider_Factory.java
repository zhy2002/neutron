package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MobileNumberNodeRuleProvider_Factory
    implements Factory<MobileNumberNodeRuleProvider> {
  private final MembersInjector<MobileNumberNodeRuleProvider>
      mobileNumberNodeRuleProviderMembersInjector;

  public MobileNumberNodeRuleProvider_Factory(
      MembersInjector<MobileNumberNodeRuleProvider> mobileNumberNodeRuleProviderMembersInjector) {
    assert mobileNumberNodeRuleProviderMembersInjector != null;
    this.mobileNumberNodeRuleProviderMembersInjector = mobileNumberNodeRuleProviderMembersInjector;
  }

  @Override
  public MobileNumberNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mobileNumberNodeRuleProviderMembersInjector, new MobileNumberNodeRuleProvider());
  }

  public static Factory<MobileNumberNodeRuleProvider> create(
      MembersInjector<MobileNumberNodeRuleProvider> mobileNumberNodeRuleProviderMembersInjector) {
    return new MobileNumberNodeRuleProvider_Factory(mobileNumberNodeRuleProviderMembersInjector);
  }
}
