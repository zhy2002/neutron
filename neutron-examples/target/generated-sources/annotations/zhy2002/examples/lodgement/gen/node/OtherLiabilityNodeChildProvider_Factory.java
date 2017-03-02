package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeChildProvider_Factory
    implements Factory<OtherLiabilityNodeChildProvider> {
  private final MembersInjector<OtherLiabilityNodeChildProvider>
      otherLiabilityNodeChildProviderMembersInjector;

  public OtherLiabilityNodeChildProvider_Factory(
      MembersInjector<OtherLiabilityNodeChildProvider>
          otherLiabilityNodeChildProviderMembersInjector) {
    assert otherLiabilityNodeChildProviderMembersInjector != null;
    this.otherLiabilityNodeChildProviderMembersInjector =
        otherLiabilityNodeChildProviderMembersInjector;
  }

  @Override
  public OtherLiabilityNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityNodeChildProviderMembersInjector, new OtherLiabilityNodeChildProvider());
  }

  public static Factory<OtherLiabilityNodeChildProvider> create(
      MembersInjector<OtherLiabilityNodeChildProvider>
          otherLiabilityNodeChildProviderMembersInjector) {
    return new OtherLiabilityNodeChildProvider_Factory(
        otherLiabilityNodeChildProviderMembersInjector);
  }
}
