package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BasePrivacyNodeChildProvider_Factory
    implements Factory<BasePrivacyNodeChildProvider> {
  private final MembersInjector<BasePrivacyNodeChildProvider>
      basePrivacyNodeChildProviderMembersInjector;

  public BasePrivacyNodeChildProvider_Factory(
      MembersInjector<BasePrivacyNodeChildProvider> basePrivacyNodeChildProviderMembersInjector) {
    assert basePrivacyNodeChildProviderMembersInjector != null;
    this.basePrivacyNodeChildProviderMembersInjector = basePrivacyNodeChildProviderMembersInjector;
  }

  @Override
  public BasePrivacyNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        basePrivacyNodeChildProviderMembersInjector, new BasePrivacyNodeChildProvider());
  }

  public static Factory<BasePrivacyNodeChildProvider> create(
      MembersInjector<BasePrivacyNodeChildProvider> basePrivacyNodeChildProviderMembersInjector) {
    return new BasePrivacyNodeChildProvider_Factory(basePrivacyNodeChildProviderMembersInjector);
  }
}
