package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStatusNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final EmploymentStatusNodeModule module;

  public EmploymentStatusNodeModule_ProvideLeafUiNodeFactory(EmploymentStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(EmploymentStatusNodeModule module) {
    return new EmploymentStatusNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentStatusNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(EmploymentStatusNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
