package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalNodeChildProvider_Factory
    implements Factory<AdditionalNodeChildProvider> {
  private final MembersInjector<AdditionalNodeChildProvider>
      additionalNodeChildProviderMembersInjector;

  public AdditionalNodeChildProvider_Factory(
      MembersInjector<AdditionalNodeChildProvider> additionalNodeChildProviderMembersInjector) {
    assert additionalNodeChildProviderMembersInjector != null;
    this.additionalNodeChildProviderMembersInjector = additionalNodeChildProviderMembersInjector;
  }

  @Override
  public AdditionalNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        additionalNodeChildProviderMembersInjector, new AdditionalNodeChildProvider());
  }

  public static Factory<AdditionalNodeChildProvider> create(
      MembersInjector<AdditionalNodeChildProvider> additionalNodeChildProviderMembersInjector) {
    return new AdditionalNodeChildProvider_Factory(additionalNodeChildProviderMembersInjector);
  }
}
