package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeChildProvider_Factory implements Factory<AssetsNodeChildProvider> {
  private final MembersInjector<AssetsNodeChildProvider> assetsNodeChildProviderMembersInjector;

  public AssetsNodeChildProvider_Factory(
      MembersInjector<AssetsNodeChildProvider> assetsNodeChildProviderMembersInjector) {
    assert assetsNodeChildProviderMembersInjector != null;
    this.assetsNodeChildProviderMembersInjector = assetsNodeChildProviderMembersInjector;
  }

  @Override
  public AssetsNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        assetsNodeChildProviderMembersInjector, new AssetsNodeChildProvider());
  }

  public static Factory<AssetsNodeChildProvider> create(
      MembersInjector<AssetsNodeChildProvider> assetsNodeChildProviderMembersInjector) {
    return new AssetsNodeChildProvider_Factory(assetsNodeChildProviderMembersInjector);
  }
}
