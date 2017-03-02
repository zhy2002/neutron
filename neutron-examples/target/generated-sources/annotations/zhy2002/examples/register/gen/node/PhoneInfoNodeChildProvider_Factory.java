package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeChildProvider_Factory
    implements Factory<PhoneInfoNodeChildProvider> {
  private final MembersInjector<PhoneInfoNodeChildProvider>
      phoneInfoNodeChildProviderMembersInjector;

  public PhoneInfoNodeChildProvider_Factory(
      MembersInjector<PhoneInfoNodeChildProvider> phoneInfoNodeChildProviderMembersInjector) {
    assert phoneInfoNodeChildProviderMembersInjector != null;
    this.phoneInfoNodeChildProviderMembersInjector = phoneInfoNodeChildProviderMembersInjector;
  }

  @Override
  public PhoneInfoNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        phoneInfoNodeChildProviderMembersInjector, new PhoneInfoNodeChildProvider());
  }

  public static Factory<PhoneInfoNodeChildProvider> create(
      MembersInjector<PhoneInfoNodeChildProvider> phoneInfoNodeChildProviderMembersInjector) {
    return new PhoneInfoNodeChildProvider_Factory(phoneInfoNodeChildProviderMembersInjector);
  }
}
