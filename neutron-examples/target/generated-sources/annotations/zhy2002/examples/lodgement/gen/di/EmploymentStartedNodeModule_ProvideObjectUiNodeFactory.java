package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final EmploymentStartedNodeModule module;

  public EmploymentStartedNodeModule_ProvideObjectUiNodeFactory(
      EmploymentStartedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(EmploymentStartedNodeModule module) {
    return new EmploymentStartedNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentStartedNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(EmploymentStartedNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
