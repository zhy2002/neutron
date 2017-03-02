package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNodeChildProvider_Factory
    implements Factory<RealEstateNodeChildProvider> {
  private final MembersInjector<RealEstateNodeChildProvider>
      realEstateNodeChildProviderMembersInjector;

  public RealEstateNodeChildProvider_Factory(
      MembersInjector<RealEstateNodeChildProvider> realEstateNodeChildProviderMembersInjector) {
    assert realEstateNodeChildProviderMembersInjector != null;
    this.realEstateNodeChildProviderMembersInjector = realEstateNodeChildProviderMembersInjector;
  }

  @Override
  public RealEstateNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        realEstateNodeChildProviderMembersInjector, new RealEstateNodeChildProvider());
  }

  public static Factory<RealEstateNodeChildProvider> create(
      MembersInjector<RealEstateNodeChildProvider> realEstateNodeChildProviderMembersInjector) {
    return new RealEstateNodeChildProvider_Factory(realEstateNodeChildProviderMembersInjector);
  }
}
