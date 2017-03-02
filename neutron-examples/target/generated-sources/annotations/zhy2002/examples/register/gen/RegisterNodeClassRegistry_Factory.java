package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeClassRegistry_Factory implements Factory<RegisterNodeClassRegistry> {
  private final MembersInjector<RegisterNodeClassRegistry> registerNodeClassRegistryMembersInjector;

  public RegisterNodeClassRegistry_Factory(
      MembersInjector<RegisterNodeClassRegistry> registerNodeClassRegistryMembersInjector) {
    assert registerNodeClassRegistryMembersInjector != null;
    this.registerNodeClassRegistryMembersInjector = registerNodeClassRegistryMembersInjector;
  }

  @Override
  public RegisterNodeClassRegistry get() {
    return MembersInjectors.injectMembers(
        registerNodeClassRegistryMembersInjector, new RegisterNodeClassRegistry());
  }

  public static Factory<RegisterNodeClassRegistry> create(
      MembersInjector<RegisterNodeClassRegistry> registerNodeClassRegistryMembersInjector) {
    return new RegisterNodeClassRegistry_Factory(registerNodeClassRegistryMembersInjector);
  }
}
