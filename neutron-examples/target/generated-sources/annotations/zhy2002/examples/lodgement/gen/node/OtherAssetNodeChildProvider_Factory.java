package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeChildProvider_Factory
    implements Factory<OtherAssetNodeChildProvider> {
  private final MembersInjector<OtherAssetNodeChildProvider>
      otherAssetNodeChildProviderMembersInjector;

  public OtherAssetNodeChildProvider_Factory(
      MembersInjector<OtherAssetNodeChildProvider> otherAssetNodeChildProviderMembersInjector) {
    assert otherAssetNodeChildProviderMembersInjector != null;
    this.otherAssetNodeChildProviderMembersInjector = otherAssetNodeChildProviderMembersInjector;
  }

  @Override
  public OtherAssetNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetNodeChildProviderMembersInjector, new OtherAssetNodeChildProvider());
  }

  public static Factory<OtherAssetNodeChildProvider> create(
      MembersInjector<OtherAssetNodeChildProvider> otherAssetNodeChildProviderMembersInjector) {
    return new OtherAssetNodeChildProvider_Factory(otherAssetNodeChildProviderMembersInjector);
  }
}
