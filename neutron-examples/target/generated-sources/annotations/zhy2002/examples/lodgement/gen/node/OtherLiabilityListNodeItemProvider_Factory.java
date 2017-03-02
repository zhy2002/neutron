package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeItemProvider_Factory
    implements Factory<OtherLiabilityListNodeItemProvider> {
  private final MembersInjector<OtherLiabilityListNodeItemProvider>
      otherLiabilityListNodeItemProviderMembersInjector;

  public OtherLiabilityListNodeItemProvider_Factory(
      MembersInjector<OtherLiabilityListNodeItemProvider>
          otherLiabilityListNodeItemProviderMembersInjector) {
    assert otherLiabilityListNodeItemProviderMembersInjector != null;
    this.otherLiabilityListNodeItemProviderMembersInjector =
        otherLiabilityListNodeItemProviderMembersInjector;
  }

  @Override
  public OtherLiabilityListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityListNodeItemProviderMembersInjector,
        new OtherLiabilityListNodeItemProvider());
  }

  public static Factory<OtherLiabilityListNodeItemProvider> create(
      MembersInjector<OtherLiabilityListNodeItemProvider>
          otherLiabilityListNodeItemProviderMembersInjector) {
    return new OtherLiabilityListNodeItemProvider_Factory(
        otherLiabilityListNodeItemProviderMembersInjector);
  }
}
