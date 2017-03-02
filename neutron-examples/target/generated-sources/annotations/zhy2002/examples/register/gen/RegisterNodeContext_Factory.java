package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UniqueIdGenerator;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeContext_Factory implements Factory<RegisterNodeContext> {
  private final MembersInjector<RegisterNodeContext> registerNodeContextMembersInjector;

  private final Provider<UiNodeChangeEngine> changeEngineProvider;

  private final Provider<UniqueIdGenerator> nodeIdGeneratorProvider;

  private final Provider<ClassRegistryImpl> implRegistryProvider;

  public RegisterNodeContext_Factory(
      MembersInjector<RegisterNodeContext> registerNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    assert registerNodeContextMembersInjector != null;
    this.registerNodeContextMembersInjector = registerNodeContextMembersInjector;
    assert changeEngineProvider != null;
    this.changeEngineProvider = changeEngineProvider;
    assert nodeIdGeneratorProvider != null;
    this.nodeIdGeneratorProvider = nodeIdGeneratorProvider;
    assert implRegistryProvider != null;
    this.implRegistryProvider = implRegistryProvider;
  }

  @Override
  public RegisterNodeContext get() {
    return MembersInjectors.injectMembers(
        registerNodeContextMembersInjector,
        new RegisterNodeContext(
            changeEngineProvider.get(), nodeIdGeneratorProvider.get(), implRegistryProvider.get()));
  }

  public static Factory<RegisterNodeContext> create(
      MembersInjector<RegisterNodeContext> registerNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    return new RegisterNodeContext_Factory(
        registerNodeContextMembersInjector,
        changeEngineProvider,
        nodeIdGeneratorProvider,
        implRegistryProvider);
  }
}
