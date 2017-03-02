package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveOffersNodeRuleProvider_Factory
    implements Factory<ReceiveOffersNodeRuleProvider> {
  private final MembersInjector<ReceiveOffersNodeRuleProvider>
      receiveOffersNodeRuleProviderMembersInjector;

  public ReceiveOffersNodeRuleProvider_Factory(
      MembersInjector<ReceiveOffersNodeRuleProvider> receiveOffersNodeRuleProviderMembersInjector) {
    assert receiveOffersNodeRuleProviderMembersInjector != null;
    this.receiveOffersNodeRuleProviderMembersInjector =
        receiveOffersNodeRuleProviderMembersInjector;
  }

  @Override
  public ReceiveOffersNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        receiveOffersNodeRuleProviderMembersInjector, new ReceiveOffersNodeRuleProvider());
  }

  public static Factory<ReceiveOffersNodeRuleProvider> create(
      MembersInjector<ReceiveOffersNodeRuleProvider> receiveOffersNodeRuleProviderMembersInjector) {
    return new ReceiveOffersNodeRuleProvider_Factory(receiveOffersNodeRuleProviderMembersInjector);
  }
}
