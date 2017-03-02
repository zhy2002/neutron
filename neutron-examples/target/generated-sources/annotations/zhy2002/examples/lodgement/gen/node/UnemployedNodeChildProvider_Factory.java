package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNodeChildProvider_Factory
    implements Factory<UnemployedNodeChildProvider> {
  private final MembersInjector<UnemployedNodeChildProvider>
      unemployedNodeChildProviderMembersInjector;

  public UnemployedNodeChildProvider_Factory(
      MembersInjector<UnemployedNodeChildProvider> unemployedNodeChildProviderMembersInjector) {
    assert unemployedNodeChildProviderMembersInjector != null;
    this.unemployedNodeChildProviderMembersInjector = unemployedNodeChildProviderMembersInjector;
  }

  @Override
  public UnemployedNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        unemployedNodeChildProviderMembersInjector, new UnemployedNodeChildProvider());
  }

  public static Factory<UnemployedNodeChildProvider> create(
      MembersInjector<UnemployedNodeChildProvider> unemployedNodeChildProviderMembersInjector) {
    return new UnemployedNodeChildProvider_Factory(unemployedNodeChildProviderMembersInjector);
  }
}
