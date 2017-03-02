package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final EmploymentEndedNodeModule module;

  public EmploymentEndedNodeModule_ProvideObjectUiNodeFactory(EmploymentEndedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(EmploymentEndedNodeModule module) {
    return new EmploymentEndedNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentEndedNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(EmploymentEndedNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
