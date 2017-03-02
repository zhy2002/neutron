package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNodeItemProvider_Factory
    implements Factory<OtherAssetListNodeItemProvider> {
  private final MembersInjector<OtherAssetListNodeItemProvider>
      otherAssetListNodeItemProviderMembersInjector;

  public OtherAssetListNodeItemProvider_Factory(
      MembersInjector<OtherAssetListNodeItemProvider>
          otherAssetListNodeItemProviderMembersInjector) {
    assert otherAssetListNodeItemProviderMembersInjector != null;
    this.otherAssetListNodeItemProviderMembersInjector =
        otherAssetListNodeItemProviderMembersInjector;
  }

  @Override
  public OtherAssetListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetListNodeItemProviderMembersInjector, new OtherAssetListNodeItemProvider());
  }

  public static Factory<OtherAssetListNodeItemProvider> create(
      MembersInjector<OtherAssetListNodeItemProvider>
          otherAssetListNodeItemProviderMembersInjector) {
    return new OtherAssetListNodeItemProvider_Factory(
        otherAssetListNodeItemProviderMembersInjector);
  }
}
