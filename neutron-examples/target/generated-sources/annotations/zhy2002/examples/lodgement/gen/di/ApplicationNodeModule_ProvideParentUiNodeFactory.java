package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ApplicationNodeModule module;

  public ApplicationNodeModule_ProvideParentUiNodeFactory(ApplicationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ApplicationNodeModule module) {
    return new ApplicationNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ApplicationNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ApplicationNodeModule instance) {
    return instance.provideParentUiNode();
  }
}