package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseTrustNodeChildProvider_Factory
    implements Factory<BaseTrustNodeChildProvider> {
  private final MembersInjector<BaseTrustNodeChildProvider>
      baseTrustNodeChildProviderMembersInjector;

  public BaseTrustNodeChildProvider_Factory(
      MembersInjector<BaseTrustNodeChildProvider> baseTrustNodeChildProviderMembersInjector) {
    assert baseTrustNodeChildProviderMembersInjector != null;
    this.baseTrustNodeChildProviderMembersInjector = baseTrustNodeChildProviderMembersInjector;
  }

  @Override
  public BaseTrustNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        baseTrustNodeChildProviderMembersInjector, new BaseTrustNodeChildProvider());
  }

  public static Factory<BaseTrustNodeChildProvider> create(
      MembersInjector<BaseTrustNodeChildProvider> baseTrustNodeChildProviderMembersInjector) {
    return new BaseTrustNodeChildProvider_Factory(baseTrustNodeChildProviderMembersInjector);
  }
}
