package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeRuleProvider_Factory
    implements Factory<PayeEmployedNodeRuleProvider> {
  private final MembersInjector<PayeEmployedNodeRuleProvider>
      payeEmployedNodeRuleProviderMembersInjector;

  public PayeEmployedNodeRuleProvider_Factory(
      MembersInjector<PayeEmployedNodeRuleProvider> payeEmployedNodeRuleProviderMembersInjector) {
    assert payeEmployedNodeRuleProviderMembersInjector != null;
    this.payeEmployedNodeRuleProviderMembersInjector = payeEmployedNodeRuleProviderMembersInjector;
  }

  @Override
  public PayeEmployedNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        payeEmployedNodeRuleProviderMembersInjector, new PayeEmployedNodeRuleProvider());
  }

  public static Factory<PayeEmployedNodeRuleProvider> create(
      MembersInjector<PayeEmployedNodeRuleProvider> payeEmployedNodeRuleProviderMembersInjector) {
    return new PayeEmployedNodeRuleProvider_Factory(payeEmployedNodeRuleProviderMembersInjector);
  }
}
