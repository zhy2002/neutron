package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeChildProvider_Factory
    implements Factory<SelfEmployedNodeChildProvider> {
  private final MembersInjector<SelfEmployedNodeChildProvider>
      selfEmployedNodeChildProviderMembersInjector;

  public SelfEmployedNodeChildProvider_Factory(
      MembersInjector<SelfEmployedNodeChildProvider> selfEmployedNodeChildProviderMembersInjector) {
    assert selfEmployedNodeChildProviderMembersInjector != null;
    this.selfEmployedNodeChildProviderMembersInjector =
        selfEmployedNodeChildProviderMembersInjector;
  }

  @Override
  public SelfEmployedNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        selfEmployedNodeChildProviderMembersInjector, new SelfEmployedNodeChildProvider());
  }

  public static Factory<SelfEmployedNodeChildProvider> create(
      MembersInjector<SelfEmployedNodeChildProvider> selfEmployedNodeChildProviderMembersInjector) {
    return new SelfEmployedNodeChildProvider_Factory(selfEmployedNodeChildProviderMembersInjector);
  }
}
