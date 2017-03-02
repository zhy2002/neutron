package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNodeChildProvider_Factory implements Factory<UsageNodeChildProvider> {
  private final MembersInjector<UsageNodeChildProvider> usageNodeChildProviderMembersInjector;

  public UsageNodeChildProvider_Factory(
      MembersInjector<UsageNodeChildProvider> usageNodeChildProviderMembersInjector) {
    assert usageNodeChildProviderMembersInjector != null;
    this.usageNodeChildProviderMembersInjector = usageNodeChildProviderMembersInjector;
  }

  @Override
  public UsageNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        usageNodeChildProviderMembersInjector, new UsageNodeChildProvider());
  }

  public static Factory<UsageNodeChildProvider> create(
      MembersInjector<UsageNodeChildProvider> usageNodeChildProviderMembersInjector) {
    return new UsageNodeChildProvider_Factory(usageNodeChildProviderMembersInjector);
  }
}
