package zhy2002.examples.app.gen;

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
public final class LodgementNodeContext_Factory implements Factory<LodgementNodeContext> {
  private final MembersInjector<LodgementNodeContext> lodgementNodeContextMembersInjector;

  private final Provider<UiNodeChangeEngine> changeEngineProvider;

  private final Provider<UniqueIdGenerator> nodeIdGeneratorProvider;

  private final Provider<ClassRegistryImpl> implRegistryProvider;

  public LodgementNodeContext_Factory(
      MembersInjector<LodgementNodeContext> lodgementNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    assert lodgementNodeContextMembersInjector != null;
    this.lodgementNodeContextMembersInjector = lodgementNodeContextMembersInjector;
    assert changeEngineProvider != null;
    this.changeEngineProvider = changeEngineProvider;
    assert nodeIdGeneratorProvider != null;
    this.nodeIdGeneratorProvider = nodeIdGeneratorProvider;
    assert implRegistryProvider != null;
    this.implRegistryProvider = implRegistryProvider;
  }

  @Override
  public LodgementNodeContext get() {
    return MembersInjectors.injectMembers(
        lodgementNodeContextMembersInjector,
        new LodgementNodeContext(
            changeEngineProvider.get(), nodeIdGeneratorProvider.get(), implRegistryProvider.get()));
  }

  public static Factory<LodgementNodeContext> create(
      MembersInjector<LodgementNodeContext> lodgementNodeContextMembersInjector,
      Provider<UiNodeChangeEngine> changeEngineProvider,
      Provider<UniqueIdGenerator> nodeIdGeneratorProvider,
      Provider<ClassRegistryImpl> implRegistryProvider) {
    return new LodgementNodeContext_Factory(
        lodgementNodeContextMembersInjector,
        changeEngineProvider,
        nodeIdGeneratorProvider,
        implRegistryProvider);
  }
}
