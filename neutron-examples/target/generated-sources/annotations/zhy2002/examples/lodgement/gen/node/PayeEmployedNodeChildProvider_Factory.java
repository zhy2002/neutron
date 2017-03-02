package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeChildProvider_Factory
    implements Factory<PayeEmployedNodeChildProvider> {
  private final MembersInjector<PayeEmployedNodeChildProvider>
      payeEmployedNodeChildProviderMembersInjector;

  public PayeEmployedNodeChildProvider_Factory(
      MembersInjector<PayeEmployedNodeChildProvider> payeEmployedNodeChildProviderMembersInjector) {
    assert payeEmployedNodeChildProviderMembersInjector != null;
    this.payeEmployedNodeChildProviderMembersInjector =
        payeEmployedNodeChildProviderMembersInjector;
  }

  @Override
  public PayeEmployedNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        payeEmployedNodeChildProviderMembersInjector, new PayeEmployedNodeChildProvider());
  }

  public static Factory<PayeEmployedNodeChildProvider> create(
      MembersInjector<PayeEmployedNodeChildProvider> payeEmployedNodeChildProviderMembersInjector) {
    return new PayeEmployedNodeChildProvider_Factory(payeEmployedNodeChildProviderMembersInjector);
  }
}
