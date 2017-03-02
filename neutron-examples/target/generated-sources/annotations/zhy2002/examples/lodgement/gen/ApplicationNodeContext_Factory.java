package zhy2002.examples.lodgement.gen;

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
public final class ApplicationNodeContext_Factory implements Factory<ApplicationNodeContext> {
  private final MembersInjector<ApplicationNodeContext> applicationNodeContextMembersInjector;

  private final Provider<UiNodeChangeEngine> changeEngineProvider;

  private final Provider<UniqueIdGenerator> nodeIdGeneratorProvider;

  private final Provider<ClassRegistryImpl> implRegistryProvider;

  public ApplicationNodeContext_Factory(
      MembersInjector<ApplicationNodeContext> applicationNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    assert applicationNodeContextMembersInjector != null;
    this.applicationNodeContextMembersInjector = applicationNodeContextMembersInjector;
    assert changeEngineProvider != null;
    this.changeEngineProvider = changeEngineProvider;
    assert nodeIdGeneratorProvider != null;
    this.nodeIdGeneratorProvider = nodeIdGeneratorProvider;
    assert implRegistryProvider != null;
    this.implRegistryProvider = implRegistryProvider;
  }

  @Override
  public ApplicationNodeContext get() {
    return MembersInjectors.injectMembers(
        applicationNodeContextMembersInjector,
        new ApplicationNodeContext(
            changeEngineProvider.get(), nodeIdGeneratorProvider.get(), implRegistryProvider.get()));
  }

  public static Factory<ApplicationNodeContext> create(
      MembersInjector<ApplicationNodeContext> applicationNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    return new ApplicationNodeContext_Factory(
        applicationNodeContextMembersInjector,
        changeEngineProvider,
        nodeIdGeneratorProvider,
        implRegistryProvider);
  }
}
