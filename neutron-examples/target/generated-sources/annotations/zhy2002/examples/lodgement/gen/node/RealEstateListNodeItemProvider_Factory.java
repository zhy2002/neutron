package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateListNodeItemProvider_Factory
    implements Factory<RealEstateListNodeItemProvider> {
  private final MembersInjector<RealEstateListNodeItemProvider>
      realEstateListNodeItemProviderMembersInjector;

  public RealEstateListNodeItemProvider_Factory(
      MembersInjector<RealEstateListNodeItemProvider>
          realEstateListNodeItemProviderMembersInjector) {
    assert realEstateListNodeItemProviderMembersInjector != null;
    this.realEstateListNodeItemProviderMembersInjector =
        realEstateListNodeItemProviderMembersInjector;
  }

  @Override
  public RealEstateListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        realEstateListNodeItemProviderMembersInjector, new RealEstateListNodeItemProvider());
  }

  public static Factory<RealEstateListNodeItemProvider> create(
      MembersInjector<RealEstateListNodeItemProvider>
          realEstateListNodeItemProviderMembersInjector) {
    return new RealEstateListNodeItemProvider_Factory(
        realEstateListNodeItemProviderMembersInjector);
  }
}
