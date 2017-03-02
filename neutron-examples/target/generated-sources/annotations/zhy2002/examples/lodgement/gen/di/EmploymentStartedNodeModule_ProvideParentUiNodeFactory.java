package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final EmploymentStartedNodeModule module;

  public EmploymentStartedNodeModule_ProvideParentUiNodeFactory(
      EmploymentStartedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(EmploymentStartedNodeModule module) {
    return new EmploymentStartedNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentStartedNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(EmploymentStartedNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
