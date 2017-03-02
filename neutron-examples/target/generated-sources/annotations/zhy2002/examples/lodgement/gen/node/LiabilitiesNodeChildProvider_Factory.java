package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeChildProvider_Factory
    implements Factory<LiabilitiesNodeChildProvider> {
  private final MembersInjector<LiabilitiesNodeChildProvider>
      liabilitiesNodeChildProviderMembersInjector;

  public LiabilitiesNodeChildProvider_Factory(
      MembersInjector<LiabilitiesNodeChildProvider> liabilitiesNodeChildProviderMembersInjector) {
    assert liabilitiesNodeChildProviderMembersInjector != null;
    this.liabilitiesNodeChildProviderMembersInjector = liabilitiesNodeChildProviderMembersInjector;
  }

  @Override
  public LiabilitiesNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        liabilitiesNodeChildProviderMembersInjector, new LiabilitiesNodeChildProvider());
  }

  public static Factory<LiabilitiesNodeChildProvider> create(
      MembersInjector<LiabilitiesNodeChildProvider> liabilitiesNodeChildProviderMembersInjector) {
    return new LiabilitiesNodeChildProvider_Factory(liabilitiesNodeChildProviderMembersInjector);
  }
}
