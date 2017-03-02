package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final EmploymentEndedNodeModule module;

  public EmploymentEndedNodeModule_ProvideParentUiNodeFactory(EmploymentEndedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(EmploymentEndedNodeModule module) {
    return new EmploymentEndedNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentEndedNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(EmploymentEndedNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
