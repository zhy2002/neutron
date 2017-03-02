package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ApplicationNodeModule module;

  public ApplicationNodeModule_ProvideObjectUiNodeFactory(ApplicationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ApplicationNodeModule module) {
    return new ApplicationNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ApplicationNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(ApplicationNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
