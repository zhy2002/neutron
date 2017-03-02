package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeChildProvider_Factory implements Factory<RegisterNodeChildProvider> {
  private final MembersInjector<RegisterNodeChildProvider> registerNodeChildProviderMembersInjector;

  public RegisterNodeChildProvider_Factory(
      MembersInjector<RegisterNodeChildProvider> registerNodeChildProviderMembersInjector) {
    assert registerNodeChildProviderMembersInjector != null;
    this.registerNodeChildProviderMembersInjector = registerNodeChildProviderMembersInjector;
  }

  @Override
  public RegisterNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        registerNodeChildProviderMembersInjector, new RegisterNodeChildProvider());
  }

  public static Factory<RegisterNodeChildProvider> create(
      MembersInjector<RegisterNodeChildProvider> registerNodeChildProviderMembersInjector) {
    return new RegisterNodeChildProvider_Factory(registerNodeChildProviderMembersInjector);
  }
}
